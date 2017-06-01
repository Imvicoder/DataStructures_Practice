/**
 * Created by Descent-Vikas on 01-06-2017.
 */

import java.util.*;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjacencyList[];

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < adjacencyList.length; i++) {
            adjacencyList[i] = new LinkedList<>(); //each element of array will contain a linked list
        }
    }

    public void addEdge(int source, int destinatiom) {
        adjacencyList[source].add(destinatiom);
    }

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No of vertices");
        int V = sc.nextInt();
        Graph gf = new Graph(V);
        System.out.println("How many edges are there in your Graph..??");
        int edges = sc.nextInt();
        while (edges-- > 0) {
            System.out.println("Enter edges by entering source and destinatoin ");
            int source = sc.nextInt();
            int destination = sc.nextInt();

            gf.addEdge(source, destination);
        }
        System.out.println("Now printing graph...");
        gf.printgraph(gf.adjacencyList);
    }

    void printgraph(LinkedList<Integer> A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(i);
            for (int j = 0; j < A[i].size(); j++) {
                System.out.print("->" +A[i].get(j));
            }
            System.out.println();
        }
    }
}