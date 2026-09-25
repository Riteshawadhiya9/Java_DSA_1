package Graph;

public class Q1_Graph_Representation_Adjacency_Matrix {

    // 1. Undirected - Unweighted Graph
    static void undirectedUnweighted(int[][] edges, int vertices) {

        int[][] matrix = new int[vertices][vertices];

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            matrix[u][v] = 1;
            matrix[v][u] = 1;   // Undirected
        }

        System.out.println("Undirected - Unweighted Graph:");
        printMatrix(matrix);
    }


    // 2. Undirected - Weighted Graph
    static void undirectedWeighted(int[][] edges, int vertices) {

        int[][] matrix = new int[vertices][vertices];

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            matrix[u][v] = weight;
            matrix[v][u] = weight;   // Undirected
        }

        System.out.println("Undirected - Weighted Graph:");
        printMatrix(matrix);
    }


    // 3. Directed - Unweighted Graph
    static void directedUnweighted(int[][] edges, int vertices) {

        int[][] matrix = new int[vertices][vertices];

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            matrix[u][v] = 1;   // Only u -> v
        }

        System.out.println("Directed - Unweighted Graph:");
        printMatrix(matrix);
    }


    // 4. Directed - Weighted Graph
    static void directedWeighted(int[][] edges, int vertices) {

        int[][] matrix = new int[vertices][vertices];

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            matrix[u][v] = weight;   // Only u -> v
        }

        System.out.println("Directed - Weighted Graph:");
        printMatrix(matrix);
    }


    // Helper method to print matrix
    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();
    }


    public static void main(String[] args) {

        int vertices = 5;

        // For unweighted graphs: {source, destination}
        int[][] unweightedEdges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 4}
        };

        // For weighted graphs: {source, destination, weight}
        int[][] weightedEdges = {
                {0, 1, 10},
                {0, 2, 20},
                {1, 3, 30},
                {2, 4, 40}
        };


        undirectedUnweighted(unweightedEdges, vertices);

        undirectedWeighted(weightedEdges, vertices);

        directedUnweighted(unweightedEdges, vertices);

        directedWeighted(weightedEdges, vertices);
    }
}