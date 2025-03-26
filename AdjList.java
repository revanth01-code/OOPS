import java.util.LinkedList;
import java.util.Scanner;

public class AdjList {

    private LinkedList<Integer>[] adj;
    private int V, E;

    @SuppressWarnings("unchecked")
    AdjList(int n) {
        V = n;
        E = 0;
        adj = new LinkedList[n];
        for (int v = 0; v < V; v++)
            adj[v] = new LinkedList<>();
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public void printEdges() {
        System.out.println("Edges of the graph:");
        for (int v = 0; v < V; v++) {
            System.out.print(v + ": ");
            for (int w : adj[v]) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int n = input.nextInt();
        AdjList g = new AdjList(n);
        System.out.println("Enter the edges to be added (ex: 1 2, or type 'n' to stop): ");
         
        while (n<5) {
            System.out.print("Enter the edge: ");
            String x = input.next();
            if (x.equals("n")) {
                break;
            }
            int u = Integer.parseInt(x);
            int v = input.nextInt();
            g.addEdge(u, v);
        }
 	g.printEdges();
        input.close();
    }
}
