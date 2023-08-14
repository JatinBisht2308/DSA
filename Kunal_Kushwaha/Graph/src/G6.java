// All paths from source to destination using DFS.
import java.util.*;
public class G6 {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d)
        {
            this.src = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

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
    public static void main(String[] args) {
        int size = 7;
        ArrayList<Edge> graph[] = new ArrayList[size];
        createGraph(graph);
        System.out.println("Graph has been created sucessfully");
        boolean[] visited = new boolean[size];
        allPaths(graph,visited,0,"0",5);
    }
    public static void allPaths(ArrayList<Edge>[] graph,boolean[] visited,int current,String path,int target)
    {
//         base condition
        if(current == target)
        {
            System.out.println(path+" ");
            return;
        }
        for(int i=0;i<graph[current].size();i++)
        {
            Edge e = graph[current].get(i);
            if(visited[e.dest] == false)
            {
                visited[current] = true;
                allPaths(graph,visited,e.dest,path+e.dest,target);
                visited[current] = false;
            }
        }
    }
}
