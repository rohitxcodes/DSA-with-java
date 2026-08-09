import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build graph
       for (int i = 0; i < edges.length; i++) {
        
            int u = edges[i][0];
            int v = edges[i][1];

            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(source, destination, graph, visited);
    }

    private boolean dfs(int curr, int destination,ArrayList<Integer>[] graph,boolean[] visited) {

        if (curr == destination) {
            return true;
        }

        visited[curr] = true;

        for (int neighbor : graph[curr]) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
}