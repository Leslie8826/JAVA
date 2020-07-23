
public class Test {

	public static void main(String[] args) {
		// Graph with 4 vertices
		Graph graph = new Graph(4);
		
		// Adds the edges between the vertices
		graph.addEdge(0, 1); // edge between vertex 0 and vertex 1
		graph.addEdge(0, 3); // edge between vertex 0 and vertex 3
		graph.addEdge(1, 2); // edge between vertex 1 and vertex 2
		graph.addEdge(1, 3); // edge between vertex 1 and vertex 3
		graph.addEdge(2, 3); // edge between vertex 2 and vertex 3
		
		System.out.println("Graph - PRINT 1:");
		graph.printGraph();
		
		System.out.print("\n");
		System.out.println("Graph - PRINT 2:");
		graph.print_Graph();
		
		
		System.out.println(" ");
		// Prints the connections of each vertex
		graph.VertexConnections();

	}

}

