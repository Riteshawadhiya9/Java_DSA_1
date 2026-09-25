package Graph;
import java.util.*;

public class Q5_Detect_Cycle_Undirected_Unweighted_DFS {
    static boolean dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int current, int parent) {

        visited[current] = true;

        for (int neighbour : graph.get(current)) {

            // If not visited, go deeper
            if (!visited[neighbour]) {

                if (dfs(graph, visited, neighbour, current)) {
                    return true;
                }
            }

            // Already visited and not parent = cycle
            else if (neighbour != parent) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int vertices = 5;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // 0 -- 1
        graph.get(0).add(1);
        graph.get(1).add(0);

        // 1 -- 2
        graph.get(1).add(2);
        graph.get(2).add(1);

        // 2 -- 3
        graph.get(2).add(3);
        graph.get(3).add(2);

        // 3 -- 0
        graph.get(3).add(0);
        graph.get(0).add(3);

        // 3 -- 4
        graph.get(3).add(4);
        graph.get(4).add(3);


        boolean[] visited = new boolean[vertices];

        boolean cycle = false;

        for (int i = 0; i < vertices; i++) {

            if (!visited[i]) {

                if (dfs(graph, visited, i, -1)) {
                    cycle = true;
                    break;
                }
            }
        }

        System.out.println("Cycle exists: " + cycle);
    }
}
