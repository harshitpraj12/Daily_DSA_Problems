package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WeigthedGraph {
    static class Edge{
        int src;
        int des;
        int weight;
        Edge(int s, int d, int w){
            src = s;
            des = d;
            weight = w;
        }
    }
    public static void create_graph(ArrayList<Edge> [] graph){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 5));

        graph[1].add(new Edge(1, 0, 4));
        graph[1].add(new Edge(1, 3, 6));

        graph[2].add(new Edge(2, 0, 5));
        graph[2].add(new Edge(2, 4, 7));

        graph[3].add(new Edge(3, 1, 6));
        graph[3].add(new Edge(3, 4, 8));
        graph[3].add(new Edge(3, 5, 9));

        graph[4].add(new Edge(4, 2, 7));
        graph[4].add(new Edge(4, 3, 8));
        graph[4].add(new Edge(4, 5, 10));

        graph[5].add(new Edge(5, 3, 9));
        graph[5].add(new Edge(5, 4, 10));
        graph[5].add(new Edge(5, 6, 11));

        graph[6].add(new Edge(6, 5, 11));
    }
    public static void bfs(ArrayList<Edge> [] graph, int v, boolean [] vis, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> [] graph = new ArrayList[v];
        create_graph(graph);
        boolean vis[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(vis[i]==false){
                bfs(graph, v, vis, i);

            }
        }
    }
}
