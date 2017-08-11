package datastructures.graph.adjacencylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

/**
 * Adjacency based Graph
 */
public class GraphByAdjacencyList {
    int V; //Number of Vertices

    LinkedList<Integer>[] adj; // adjacency lists

    //Constructor
    public GraphByAdjacencyList(int V) {
        this.V = V;
        adj = new LinkedList[V];

        for (int i = 0; i < adj.length; i++)
            adj[i] = new LinkedList<Integer>();

    }

    //To add an edge to graph
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v’s list.
    }

    // prints all not yet visited vertices reachable from s
    void iterativeDfs(int s) {
        // Initially mark all vertices as not visited
        Vector<Boolean> visited = new Vector<Boolean>(V);
        for (int i = 0; i < V; i++)
            visited.add(false);

        // Create a stack for DFS
        Stack<Integer> stack = new Stack<>();

        // Push the current source node
        stack.push(s);

        while (stack.empty() == false) {
            // Pop a vertex from stack and print it
            s = stack.peek();
            stack.pop();

            // Stack may contain same vertex twice. So
            // we need to print the popped item only
            // if it is not visited.
            if (visited.get(s) == false) {
                System.out.print(s + " ");
                visited.set(s, true);
            }

            // Get all adjacent vertices of the popped vertex s
            // If a adjacent has not been visited, then puah it
            // to the stack.
            Iterator<Integer> itr = adj[s].iterator();

            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited.get(v))
                    stack.push(v);
            }

        }
    }

    // A function used by DFS
    void recursiveDfsUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                recursiveDfsUtil(n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void recursiveDFS(int v) {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];

        // Call the recursive helper function to print DFS traversal
        recursiveDfsUtil(v, visited);
    }
}
