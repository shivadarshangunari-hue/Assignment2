package Assignment5.Module14;

    import java.util.*;

    public class CountGraph {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V;

        CountGraph(int V) {
            this.V = V;
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int countEdges() {
            int count = 0;
            for (ArrayList<Integer> list : adj)
                count += list.size();
            return count / 2;
        }

        public static void main(String[] args) {
            CountGraph g = new CountGraph(4);
            g.addEdge(0,1);
            g.addEdge(1,2);

            System.out.println("Vertices: " + g.V);
            System.out.println("Edges: " + g.countEdges());
        }
    }

