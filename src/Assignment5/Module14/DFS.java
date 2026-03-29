package Assignment5.Module14;

import java.util.ArrayList;

public class DFS {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        DFS(int V) {
            for (int i = 0; i < V; i++)
                adj.add(new ArrayList<>());
        }

        void addEdge(int u, int v) {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        void dfs(int node, boolean[] visited) {
            visited[node] = true;
            System.out.print(node + " ");

            for (int neigh : adj.get(node)) {
                if (!visited[neigh]) {
                    dfs(neigh, visited);
                }
            }
        }

        public static void main(String[] args) {
            DFS g = new DFS(4);
            g.addEdge(0,1);
            g.addEdge(0,2);
            g.addEdge(1,3);

            boolean[] visited = new boolean[4];
            g.dfs(0, visited);
        }
    }



