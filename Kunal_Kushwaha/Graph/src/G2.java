// Here we have to create undirected weighted graph.
import java.util.*;
public class G2 {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s,int d,int w)
        {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
//        here we will initialize the garph elements which are arraylist to empty array list as they are null right now
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<Edge>();
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
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println("Graph has been created.");
//        print the 2's neighbours with the weight required to reach there
        System.out.println("Where we can travel if our initial point is 2:");
        for(int i=0;i<graph[2].size();i++)
        {
          Edge obj = graph[2].get(i);
            System.out.println(obj.src+"->"+obj.dest+"("+ obj.weight+ ")");
        }
    }
}
