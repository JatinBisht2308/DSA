// This is BFS with dis-connected components
import java.util.*;
public class G4 {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d)
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

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new  Edge(2,1));

        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));

    }
    public static void main(String[] args) {
        int size = 5;
        ArrayList<Edge> graph[] = new ArrayList[size];
        createGraph(graph);
        System.out.println("Graph has been created.");

        boolean visited[] = new boolean[size];
        for(int i=0;i<size;i++)
        {
            if(visited[i]==false)
            {
                BFS(graph,visited,i);
            }
        }
    }
    public static void BFS(ArrayList<Edge> graph[],boolean[] visited, int start)
    {
      Queue<Integer> q = new LinkedList<>();
      q.add(start);
      while(q.isEmpty()==false)
      {
          int current = q.remove();
          if(visited[current]==false)
          {
              System.out.println(current+" ");
              visited[current]  = true;
              for(int i=0;i<graph[current].size();i++)
              {
                  Edge e = graph[current].get(i);
                  q.add(e.dest);
              }
          }
      }
    }

}
