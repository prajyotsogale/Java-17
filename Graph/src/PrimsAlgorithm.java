import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
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
    static class Pair implements Comparable<Pair>{
        int node;
        int cost;

        public Pair(int node, int cost){
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost;
        }

    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }
    public static void primsAlgorithm(ArrayList<Edge>[] graph, int V){  //O(E logE)
        PriorityQueue<Pair> pq = new PriorityQueue<>();//non mst
        boolean[] vis = new boolean[V];//mst
        pq.add(new Pair(0,0));
        int mstCost = 0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                mstCost+= curr.cost;

                for (int i = 0; i < graph[curr.node].size(); i++) {
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.d]){
                        pq.add(new Pair(e.d,e.w));
                    }
                }
            }
        }
        System.out.println(mstCost);
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        primsAlgorithm(graph,V);
    }
}
