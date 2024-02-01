import java.util.List;
import java.util.Scanner;

public class MuseumVisit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(); // Number of museums
        int N = scanner.nextInt(); // Number of roads

        Graph graph = new Graph(M); // Create a graph with M museums
        for (int i = 0; i < N; i++) {
            int u = scanner.nextInt(); // Start of road
            int v = scanner.nextInt(); // End of road
            int time = scanner.nextInt(); // Time to travel from u to v
            graph.addEdge(u, v, time); // Add the road to the graph
        }

        int minTime = graph.findMinTime(); // Find the minimum time to reach the destination
        List<Integer> minPath = graph.getMinPath(); // Get the minimum time path

        if (minTime == Integer.MAX_VALUE) {
            System.out.println(-1); // If no path exists, print -1
        } else {
            System.out.println(minTime); // Print the minimum time
            for (int vertex : minPath) {
                System.out.print(vertex + " "); // Print the vertices in the minimum time path
            }
        }
    }
}
