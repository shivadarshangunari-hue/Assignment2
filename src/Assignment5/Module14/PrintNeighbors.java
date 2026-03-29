package Assignment5.Module14;


    import java.util.*;

    public class PrintNeighbors {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        PrintNeighbors(int V) {
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void printNeighbors(int node) {
            System.out.println("Neighbors of " + node + ": " + adj.get(node));
        }

        public static void main(String[] args) {
            PrintNeighbors g = new PrintNeighbors(4);
            g.addEdge(0,1);
            g.addEdge(0,2);

            g.printNeighbors(0);
        }
    }

