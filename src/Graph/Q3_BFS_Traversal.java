package Graph;

import java.util.*;

public class Q3_BFS_Traversal {

    // BFS Traversal
    static void bfs(ArrayList<ArrayList<Integer>> graph, int source) {

        int vertices = graph.size();

        // To keep track of visited vertices
        boolean[] visited = new boolean[vertices];

        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Start from source
        visited[source] = true;
        queue.add(source);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            // Remove from front
            int current = queue.poll();

            System.out.print(current + " ");

            // Visit all neighbours
            for (int neighbour : graph.get(current)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println();
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

        // BFS starting from vertex 0
        bfs(graph, 0);
//                  0
//                /   \
//               1     2
//              /  \     \
//              3    4     5
//              \  /
//               4

//      Adjacency list:
//        0 → [1, 2]
//        1 → [3, 4]
//        2 → [5]
//        3 → [4]
//        4 → []
//        5 → []
    }
}

//              START
//               |
//               v
//          Create Graph
//               |
//               v
//          Create Queue
//               |
//               v
//          Create visited[]
//               |
//               v
//         Add source vertex
//         to Queue
//         visited[source] = true
//               |
//               v
//        Is Queue empty?
//         /          \
//       NO            YES
//        |              |
//        v              v
//    Remove vertex     END
//     from Queue
//        |
//        v
//     Print vertex
//        |
//        v
//  Check all neighbors
//        |
//        v
//  Is neighbor visited?
//         /       \
//       NO         YES
//       |           |
//       v           |
//    Mark visited   |
//       |           |
//    Add to Queue   |
//        |          |
//        +-----<-----+
//        |
//        v
//    Is Queue empty?