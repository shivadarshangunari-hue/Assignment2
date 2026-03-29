package Assignment5.Module14;


    import java.util.*;

    public class TraverseGraph {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        TraverseGraph(int V) {
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void traverse(int start) {
            boolean[] visited = new boolean[adj.size()];
            Queue<Integer> q = new LinkedList<>();

            q.add(start);
            visited[start] = true;

            while (!q.isEmpty()) {
                int node = q.poll();
                System.out.print(node + " ");

                for (int neigh : adj.get(node)) {
                    if (!visited[neigh]) {
                        visited[neigh] = true;
                        q.add(neigh);
                    }
                }
            }
        }

        public static void main(String[] args) {
            TraverseGraph g = new TraverseGraph(4);
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(2,3);

            g.traverse(0);
        }
    }

