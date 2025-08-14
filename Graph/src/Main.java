import java.util.ArrayList;
//Adjacency list aka list of list
public class Main {
    static class Edge{
        int src;
        int destination;
        int weight;

        public Edge(int s, int d){
            this.src = s;
            this.destination = d;
        }
        public Edge(int s, int d, int w){
            this.src = s;
            this.destination = d;
            this.weight = w;
        }
    }

    public static void makeGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        makeGraph(graph);

        //print neighbours of 2
        for (int j = 0; j < graph[2].size(); j++) {
            Edge e = graph[2].get(j);
            System.out.println(e.destination+" , "+e.weight);
        }
    }

}
