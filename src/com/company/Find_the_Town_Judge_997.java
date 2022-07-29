package com.company;

import java.util.ArrayList;

public class Find_the_Town_Judge_997 {
    public static void main(String[] args) {
        int[][] trust = {{1,2}};
        int n = 2;
        System.out.println(findJudge(n, trust));
    }
    static class Graph{
        ArrayList[] graph;
        Graph(int n){
            graph = new ArrayList[n+1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList();
            }
        }
        void connectEdges(int source, int destination){
            graph[source].add(destination);
        }
        boolean isJudge(int i){
            if(graph[i].size() == 0)
                return true;
            else return false;
        }
        
    }
    public static int findJudge(int n, int[][] trust) {
        Graph graph = new Graph(n);
        for(int[] arr : trust){
            graph.connectEdges(arr[0], arr[1]);
        }
        for(int i = 1;i<=n;i++){
            if(graph.isJudge(i))
                return i;
        }
        return -1;
    }
}
