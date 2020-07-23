
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph = new Graph(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		
		System.out.println("Graph - PRINT 1:");
		graph.printGraph();
		
		System.out.print("\n");
		System.out.println("Graph - PRINT 2:");
		graph.print_Graph();
		
		System.out.println(" ");
		graph.VertexConnections();

	}

}

