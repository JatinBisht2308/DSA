// here we will see the BFS traversal in graph.
import java.util.*;
public class G3  {
//    edge class
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
       System.out.println("Graph has been created.");
        System.out.println("Vertex in the given graph are:");
       BFS(graph);
    }
    public static void BFS(ArrayList<Edge> graph[])
    {
//      1)- Create an queue.
        Queue<Integer> q = new LinkedList<>();
//      2)- Create an visited array of type boolean.
        boolean[] visited = new boolean[graph.length];
//      3)- Add the initial vertex in the queue here its is 0.
        q.add(0);
//        search algo starts
//        if the queue is not empty then while loops runs again and again an if it is empty then the loop will terminate
        while(q.isEmpty()!=true)
        {
            int current = q.remove();
//          if current index is not visited then go inside the if block
            if(visited[current]!=true)
            {
                System.out.println(current+" ");
                visited[current] = true;
                for(int i=0;i<graph[current].size();i++)
                {
                    Edge e = graph[current].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
}
