package Assignment5.Module14;


    import java.util.*;

    public class BFS {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        BFS(int V) {
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void bfs(int start) {
            boolean[] visited = new boolean[adj.size()];
            Queue<Integer> q = new LinkedList<>();

            visited[start] = true;
            q.add(start);

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
            BFS g = new BFS(4);
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(1,3);

            g.bfs(0);
        }
    }

