package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Find_if_Path_Exists_in_Graph_1961 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int source = 0;
        int destination = 5;
        System.out.println(validPath(n,edges,source,destination));
    }

   static public boolean validPath(int n, int[][] edges, int source, int destination) {
        class Graph{
            ArrayList<Integer>[] arr;
            Graph(int n){
                arr = new ArrayList[n];
                for(int i = 0;i<n;i++){
                    arr[i] = new ArrayList<Integer>();
                }
            }
            void connectEdges(int source, int destination){
                arr[source].add(destination);
                arr[destination].add(source);
            }
        }
        Graph graph = new Graph(n);
        for(int i = 0;i<edges.length;i++){
            graph.connectEdges(edges[i][0], edges[i][1]);
        }
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[n];
        q.add(source);
        while(!q.isEmpty()){
            int curr = q.poll();
            visited[curr] = true;
//            System.out.print(curr + " ");
            if(curr == destination)
                return true;
            for(int neighbor : graph.arr[curr]){
                if(!visited[neighbor]){
                    q.add(neighbor);
                }
            }
        }
        return false;
    }
}
