package Assignment5.Module14;


    import java.util.*;

    public class BipartiteCheck {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        BipartiteCheck(int V) {
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean isBipartite(int V) {
            int[] color = new int[V];
            Arrays.fill(color, -1);

            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            color[0] = 0;

            while (!q.isEmpty()) {
                int node = q.poll();
                for (int neigh : adj.get(node)) {
                    if (color[neigh] == -1) {
                        color[neigh] = 1 - color[node];
                        q.add(neigh);
                    } else if (color[neigh] == color[node]) {
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            BipartiteCheck g = new BipartiteCheck(4);
            g.addEdge(0,1);
            g.addEdge(1,2);
            g.addEdge(2,3);

            System.out.println(g.isBipartite(4));
        }
    }

