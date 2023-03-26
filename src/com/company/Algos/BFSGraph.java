package com.company.Algos;
import  com.company.DSImplementation.Graphs.Undirected.AdjacencyList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    public static void main(String[] args) {
        int[][] graphInput = {{5,6},{0,1},{0,2},{4,1},{3,4},{3,1},{2,3}};
        AdjacencyList adList = new AdjacencyList();
        for(int i: bfs(adList.adjacencyList(graphInput), graphInput[0][1]))
            System.out.print(i + " ");
    }
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adList, int V)
    {
        ArrayList<Integer> ansList = new ArrayList<>();
        int[] visited = new int[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0]=1;
        while(!q.isEmpty())
        {
            int node = q.poll();
            ansList.add(node);
            for (int i:adList.get(node))
            {
                if(visited[i]!=1)
                {
                    visited[i]=1;
                    q.add(i);
                }
            }
        }
        return ansList;
    }
}
