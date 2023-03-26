package com.company.DSImplementation.Graphs.Undirected;
import  com.company.DSImplementation.Graphs.Undirected.AdjacencyList;

import java.util.ArrayList;

public class DetectCycle {
    public static void main(String[] args) {
        int[][] graphInput = {{5,6},{0,1},{0,2},{4,1},{3,1}};
        AdjacencyList adList = new AdjacencyList();
        boolean[] visArr = new boolean[graphInput[0][1]];
        System.out.println(check(adList.adjacencyList(graphInput),visArr,-1,0));
    }
    public static boolean check(ArrayList<ArrayList<Integer>> adList, boolean[] visArr, int p, int node)
    {
        visArr[node] = true;
        for(int i: adList.get(node))
        {
            if(!visArr[i]) return check(adList, visArr, node, i);
            else if(i!=p) return true;
        }
        return false;
    }
}
