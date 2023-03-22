package com.company.DSImplementation.Graphs.Undirected;

import java.util.ArrayList;

public class AdjacencyList {
    public static void main(String[] args) {
        int[][] graphInput = {{5,6},{1,2},{1,3},{5,2},{4,5},{4,2},{3,4}};
        int c = 0;
        for (ArrayList<Integer> arr: adjacencyList(graphInput))
        {
            System.out.print(c + " -> ");
            for(int i: arr)
            {
                System.out.print(i + " ");
            }
            System.out.println();
            c++;
        }
    }
    public static ArrayList<ArrayList<Integer>> adjacencyList(int[][] inputMat)
    {
        ArrayList<ArrayList<Integer>> adList = new ArrayList<>();
        int nodes = inputMat[0][0], edges = inputMat[0][1];

        // Add sublists to adList
        for(int i=0;i<edges;i++) adList.add(new ArrayList<Integer>());

        for(int i=1;i<inputMat.length;i++)
        {
            adList.get(inputMat[i][0]).add(inputMat[i][1]);
            adList.get(inputMat[i][1]).add(inputMat[i][0]);
        }

        return adList;
    }
}
