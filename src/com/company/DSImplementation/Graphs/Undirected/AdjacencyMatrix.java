package com.company.DSImplementation.Graphs.Undirected;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int[][] graphInput = {{5,6},{1,2},{1,3},{5,2},{4,5},{4,2},{3,4}};
        for (int[] arr: adjacencyMatrix(graphInput))
        {
            for(int i: arr)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static int[][] adjacencyMatrix(int[][] inputMat)
    {
        int nodes = inputMat[0][0], edges = inputMat[0][1];
        int[][] adMat = new int[edges][edges];
        for (int i=1;i<inputMat.length;i++) {
            int arr[] = inputMat[i];
            adMat[arr[0]][arr[1]] = 1;
            adMat[arr[1]][arr[0]] = 1;
        }
        return adMat;
    }
}
