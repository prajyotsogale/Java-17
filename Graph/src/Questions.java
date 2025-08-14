import java.util.ArrayList;

public class Questions {
    static class Edge{
        int s;
        int d;

        public Edge(int s, int d){
            this.s = s;
            this.d = d;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[6].add(new Edge(6,5));


    }
    //O(V*V)
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];     
        createGraph(graph);
        //all paths from source to destinations
        boolean[] vis = new boolean[7];
        printDfs(graph,vis,0,"0",5);

    }
    public static void printDfs(ArrayList<Edge>[] graph, boolean[] vis, int curr, String path, int target){
        if(curr == target){
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.d]){
                vis[curr] = true;
                printDfs(graph,vis, e.d,path+" "+e.d,target);
                vis[curr] = false;
            }

        }


    }
}
