
package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    int val;
    ArrayList<ListNode> nodes;

    public static void main(String[] args) {
        int[][] graph = new int[][]{{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 4}, {4, 5}};
        adjacencyMatrix(6, graph);
    }

    static void adjacencyMatrix(int numberOfNodes, int[][] edges) {
        int[][] directedGraph = new int[numberOfNodes][numberOfNodes];
        int[][] unDirectedGraph = new int[numberOfNodes][numberOfNodes];

        for(int[] edge : edges) {
            directedGraph[edge[0]][edge[1]] = 1;
        }

        for(int[] edge : edges) {
            unDirectedGraph[edge[1]][edge[0]] = 1;
            unDirectedGraph[edge[0]][edge[1]] = 1;
        }

        System.out.println("Directed Graph");

        for(int[] dg : directedGraph) {
            System.out.println(Arrays.toString(dg));
        }

        System.out.println("Un Directed Graph");

        for(int[] udg : unDirectedGraph) {
            System.out.println(Arrays.toString(udg));
        }

    }
}
