package Graph;
import java.util.*;

public class Q6_Detect_Cycle_Undirected_Unweighted_BFS {

    static boolean bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int start) {

        Queue<int[]> queue = new LinkedList<>();

        // {current, parent}
        queue.add(new int[]{start, -1});

        visited[start] = true;

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int node = current[0];
            int parent = current[1];

            for (int neighbour : graph.get(node)) {

                // If neighbour is not visited
                if (!visited[neighbour]) {

                    visited[neighbour] = true;

                    queue.add(new int[]{neighbour, node});
                }

                // Already visited and not parent
                else if (neighbour != parent) {

                    return true;
                }
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

                if (bfs(graph, visited, i)) {
                    cycle = true;
                    break;
                }
            }
        }

        System.out.println("Cycle exists: " + cycle);
    }
}
