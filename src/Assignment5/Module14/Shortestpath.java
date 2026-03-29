package Assignment5.Module14;


    import java.util.*;

     class ShortestPath {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        ShortestPath(int V) {
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void shortestPath(int src, int V) {
            int[] dist = new int[V];
            Arrays.fill(dist, -1);

            Queue<Integer> q = new LinkedList<>();
            q.add(src);
            dist[src] = 0;

            while (!q.isEmpty()) {
                int node = q.poll();
                for (int neigh : adj.get(node)) {
                    if (dist[neigh] == -1) {
                        dist[neigh] = dist[node] + 1;
                        q.add(neigh);
                    }
                }
            }

            System.out.println(Arrays.toString(dist));
        }

        public static void main(String[] args) {
            ShortestPath g = new ShortestPath(4);
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(1,3);

            g.shortestPath(0,4);
        }
    }

