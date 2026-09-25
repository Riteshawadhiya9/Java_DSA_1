package Graph;
import java.util.*;

public class Q2_Graph_Representation_Adjacency_List {
    // 1. Undirected - Unweighted Graph
    static void undirectedUnweighted(int[][] edges, int vertices) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);   // Undirected
        }

        System.out.println("Undirected - Unweighted Graph:");

        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }

        System.out.println();
    }


    // 2. Undirected - Weighted Graph
    static void undirectedWeighted(int[][] edges, int vertices) {

        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            graph.get(u).add(new int[]{v, weight});
            graph.get(v).add(new int[]{u, weight});   // Undirected
        }

        System.out.println("Undirected - Weighted Graph:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int[] neighbour : graph.get(i)) {
                System.out.print("(" + neighbour[0] + ", " + neighbour[1] + ") ");
            }

            System.out.println();
        }

        System.out.println();
    }


    // 3. Directed - Unweighted Graph
    static void directedUnweighted(int[][] edges, int vertices) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);   // Only u -> v
        }

        System.out.println("Directed - Unweighted Graph:");

        for (int i = 0; i < vertices; i++) {
            System.out.println(i + " -> " + graph.get(i));
        }

        System.out.println();
    }


    // 4. Directed - Weighted Graph
    static void directedWeighted(int[][] edges, int vertices) {

        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            graph.get(u).add(new int[]{v, weight});   // Only u -> v
        }

        System.out.println("Directed - Weighted Graph:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int[] neighbour : graph.get(i)) {
                System.out.print("(" + neighbour[0] + ", " + neighbour[1] + ") ");
            }

            System.out.println();
        }

        System.out.println();
    }


    public static void main(String[] args) {

        int vertices = 5;

        // Unweighted: {source, destination}
        int[][] unweightedEdges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 4}
        };

        // Weighted: {source, destination, weight}
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
