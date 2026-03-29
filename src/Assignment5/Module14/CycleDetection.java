package Assignment5.Module14;


    import java.util.*;

    public class CycleDetection {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        CycleDetection(int V) {
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean dfs(int node, int parent, boolean[] visited) {
            visited[node] = true;

            for (int neigh : adj.get(node)) {
                if (!visited[neigh]) {
                    if (dfs(neigh, node, visited))
                        return true;
                } else if (neigh != parent) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            CycleDetection g = new CycleDetection(3);
            g.addEdge(0,1);
            g.addEdge(1,2);
            g.addEdge(2,0); // cycle

            boolean[] visited = new boolean[3];
            System.out.println(g.dfs(0, -1, visited));
        }
    }

