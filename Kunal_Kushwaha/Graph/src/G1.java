import java.util.*;
public class G1 {
    //    class to create edge of an arraylist
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    //  method for creating a graph
    public static void createGraph(ArrayList<Edge> graph[]) {
//        so initially all the element inside the graph array is null so we have to give them an empty array list
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<Edge>();
//            if dont initialze it with the empty arraylist then it will gives us NullPointerException
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
        System.out.println("Graph has created successfully using adjacency list");
    }

    public static void main(String[] args) {
        int v = 4;
//      int             arr[]  = new  int[size];
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
//      find 2's neighbours
        System.out.println("Neighbours of 2 vertex are:");
        for(int i=0;i<graph[2].size();i++)
        {
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }
}