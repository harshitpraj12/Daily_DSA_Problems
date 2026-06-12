package Graph;

import java.util.*;

public class PracticeGraph {
    static class Edge{
        int src;
        int des;
        Edge(int src, int des){
            this.src = src;
            this.des = des;
        }
    }

    private static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    // public static void bfs(ArrayList<Edge> graph[], int v, boolean [] vis, int start){
    //     Queue<Integer> q = new LinkedList<>(); 
    //     q.add(start);
    //     while(!q.isEmpty()){
    //         int curr = q.remove();
    //         if(vis[curr]==false){
    //             System.out.print(curr+" ");
    //             vis[curr] = true;
    //             for(int i=0; i<graph[curr].size(); i++){
        //                 Edge a = graph[curr].get(i);
        //                 q.add(a.des);
        //             }
        //         }
        //     }
        // }
        // private static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis) {
        //     System.out.println(curr);
        //     vis[curr]=true;
        //     for(int i=0; i<graph[curr].size(); i++){
        //         Edge e = graph[curr].get(i);
        //         if(vis[e.des]==false)
        //             dfs(graph, e.des, vis);
        //     }
        // }
        private static void printAllPath(ArrayList<Edge>[] graph, int curr, boolean[] vis, int tar, String path) {
            if(curr==tar){
                System.out.println(path);
                return;
            }
            for(int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(vis[e.des]==false){
                    vis[curr]=true;
                    printAllPath(graph, e.des, vis, tar, path+e.des);
                    vis[curr]=false;
                }
            }
        }
        public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph); 
        // for(int i=0; i<graph[3].size(); i++){
        //     Edge a = graph[3].get(i);
        //     System.out.println(a.des);
        // } 
        boolean vis[] = new boolean[v];
        // for(int i=0; i<v; i++){
        //     if(vis[i]==false){
        //         bfs(graph, v, vis, 3);
        //     }
        // }
        // for(int i=0; i<v; i++){
        //     if(vis[i]==false){ 
        //         dfs(graph, i, vis);
        //     }
        // }
        int src = 0;
        int tar = 3;
        printAllPath(graph, src, vis, tar, "0");
    }

}
