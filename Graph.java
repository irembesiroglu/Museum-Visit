import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int vertices;
    private List<List<Edge>> adj;
    private int minTime;
    private List<Integer> minPath;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adj = new ArrayList<>(vertices + 1);
        for (int i = 0; i <= vertices; i++) {
            adj.add(new ArrayList<>());
        }
        this.minTime = Integer.MAX_VALUE;
        this.minPath = new ArrayList<>();
    }

    public void addEdge(int u, int v, int time) {
        adj.get(u).add(new Edge(v, time));
        adj.get(v).add(new Edge(u, time));
    }

    public int findMinTime() {
        for (int i = 1; i <= vertices; i++) {
            dfs(i, new boolean[vertices + 1], 0, 0, new ArrayList<>());
        }
        return minTime == Integer.MAX_VALUE ? -1 : minTime;
    }

    private void dfs(int current, boolean[] visited, int totalTime, int visitedCount, List<Integer> path) {
        visited[current] = true;
        path.add(current);

        if (visitedCount == vertices) {
            if (totalTime < minTime) {
                minTime = totalTime;
                minPath = new ArrayList<>(path);
            }
        }

        for (Edge neighbor : adj.get(current)) {
            if (!visited[neighbor.to]) {
                dfs(neighbor.to, visited, totalTime + neighbor.time, visitedCount + 1, path);
            }
        }

        visited[current] = false;
        path.remove(path.size() - 1);
    }

    public List<Integer> getMinPath() {
        return minPath;
    }
}
