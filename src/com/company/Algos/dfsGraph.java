package com.company.Algos;
import  com.company.DSImplementation.Graphs.Undirected.AdjacencyList;
import java.util.*;

public class dfsGraph {
    public static void main(String[] args) {
        int[][] graphInput = {{5,6},{0,1},{0,2},{4,1},{3,4},{3,1},{2,3}};
        AdjacencyList adList = new AdjacencyList();
        boolean[] visArr = new boolean[graphInput[0][1]];
        ArrayList<Integer> ansArr = new ArrayList<>();
        dfs(adList.adjacencyList(graphInput), 0, visArr, ansArr);
        for(int i: ansArr)
            System.out.print(i + " ");
    }
    public static void dfs(ArrayList<ArrayList<Integer>> adList, int node, boolean[] visArr, ArrayList<Integer> ansArr)
    {
         visArr[node] = true;
         ansArr.add(node);
         for(int i: adList.get(node))
         {
             if(!visArr[i])
                 dfs(adList, i, visArr, ansArr);
         }
    }
}
