package Graph;

import java.util.ArrayList;

public class Implementation {
    static class Edge{
        int src;
        int des;
        Edge(int src, int des){
            this.src = src;
            this.des = des;
        }
    }
    public static void create_graph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(1, 2));
        graph[1].add(new Edge(2, 1));
        graph[1].add(new Edge(2, 4));
        graph[1].add(new Edge(2, 3));
        graph[2].add(new Edge(3, 2));
        graph[2].add(new Edge(3, 4));
        graph[3].add(new Edge(4, 2));
        graph[3].add(new Edge(4, 3));
        
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        System.out.println("Length is: "+graph.length);
        create_graph(graph);
        for(int i=0; i<=graph[2].size(); i++){
            // System.out.println(graph[1].get(i));
            Edge e = graph[1].get(i);
            System.out.println(e.des);
        }
        // System.out.println("hello "+ graph[0]);
        // System.out.println("hello "+ graph[1]);
        // System.out.println("hello "+ graph[1].get(1).des);
        // System.out.println("hello "+ graph[2].get(0).des);
        // System.out.println("hello "+ graph[3]);
        
    }
}
