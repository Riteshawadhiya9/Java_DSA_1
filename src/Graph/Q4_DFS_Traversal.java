package Graph;

import java.util.*;

public class Q4_DFS_Traversal {

    static void dfs(ArrayList<ArrayList<Integer>> graph,
                    boolean[] visited,
                    int current) {

        // Mark current vertex as visited
        visited[current] = true;

        // Print current vertex
        System.out.print(current + " ");

        // Visit all neighbours
        for (int neighbour : graph.get(current)) {

            if (!visited[neighbour]) {
                dfs(graph, visited, neighbour);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 6;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(3);
        graph.get(1).add(4);

        graph.get(2).add(5);

        graph.get(3).add(4);

        // Visited array
        boolean[] visited = new boolean[vertices];

        // Start DFS from vertex 0
        System.out.print("DFS Traversal: ");

        dfs(graph, visited, 0);


//                  0
//                /   \
//               1     2
//             /  \     \
//            3    4     5
//             \
//              4

//        Adjacency list:
//        0 → [1, 2]
//        1 → [3, 4]
//        2 → [5]
//        3 → [4]
//        4 → []
//        5 → []
    }
}