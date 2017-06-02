import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Descent-Vikas on 02-06-2017.
 */
public class WeightedGraph {
    static class Edge {
        int dest;
        int weight;
    }

    int vertices;
    LinkedList<Edge> adjacencyList[];

    public WeightedGraph(int V) {
        this.vertices = V;
        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new LinkedList<>();
        }

    }

    public void addEdge(int source, int dest, int weight, Edge ed) {
        ed.dest = dest;
        ed.weight = weight;
        System.out.println("destination is:;->" + ed.dest + " and corresponding weight is:->" + ed.weight);
        System.out.println("ed is :->"+ed);
        adjacencyList[source].add(ed);
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of vertices");
        int V = sc.nextInt();

        WeightedGraph gf = new WeightedGraph(V);
        System.out.println("How many edges are there in your Graph..??");
        int edges = sc.nextInt();
        while (edges-- > 0) {
            System.out.println("Enter edges by entering source, destinatoin and corresponding weight ");
            int source = sc.nextInt();
            int destination = sc.nextInt();
            int weight = sc.nextInt();
            Edge ed = new Edge();
            gf.addEdge(source, destination, weight, ed);
        }
        System.out.println("Now printing graph...");
        gf.printgraph(gf.adjacencyList);
    }

    public void printgraph(LinkedList<Edge>[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(i);
            for (int j = 0; j < A[i].size(); j++) {
                System.out.print("->" + A[i].get(j).dest+" with weight "+A[i].get(j).weight);
            }
            System.out.println();
        }
    }
}
