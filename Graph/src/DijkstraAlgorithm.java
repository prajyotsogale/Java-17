import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static class Pair implements Comparable<Pair>{
        int node;
        int dis;

        public Pair(int n, int d){
            this.node = n;
            this.dis = d;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dis - p2.dis;
        }
    }
    static class Edge{
        int s;
        int d;
        int w;

        public Edge(int s, int d, int w){
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V){
        PriorityQueue<Pair> q = new PriorityQueue<>();
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        boolean[] vis = new boolean[V];

        q.add(new Pair(0,0));

        while(!q.isEmpty()){
            Pair curr = q.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    int u = e.s;
                    int v = e.d;
                    if(dist[u]+e.w < dist[v]){
                        dist[v] = dist[u]+e.w;
                        q.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            System.out.print(dist[i]+" ");
        }
    }
    //O(E + ELogV) time complexity
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        dijkstra(graph, 0, V);
    }
}
