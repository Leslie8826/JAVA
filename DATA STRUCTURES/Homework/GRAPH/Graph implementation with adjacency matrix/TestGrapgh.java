
public class Test {
	public static void main(String[] args) {
    Graph graph = new Graph(5);
    
		graph.addEdge(0, 1); // adds edge between vertex 0 and vertex 1
    graph.addEdge(0, 4); // adds edge between vertex 0 and vertex 4
    graph.addEdge(1, 2); // adds edge between vertex 1 and vertex 2
    graph.addEdge(1, 3); // adds edge between vertex 1 and vertex 3
    graph.addEdge(1, 4); // adds edge between vertex 1 and vertex 4
    graph.addEdge(2, 3); // adds edge between vertex 2 and vertex 3
    graph.addEdge(3, 4); // adds edge between vertex 3 and vertex 4
        
    // Displays graph vertices
    graph.printGraph();
        
    // Displays vertices and their connections
    graph.VertexConnection();
  }
}

