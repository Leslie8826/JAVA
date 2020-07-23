import java.util.LinkedList;

public class Graph {
	int vertex;
	LinkedList<Integer>[] list;
	
	public Graph(int vertex) {
		this.vertex = vertex;
		
		list = new LinkedList[vertex];
		
		for(int i=0; i<vertex; i++) {
			list[i] = new LinkedList<Integer>();
		}
	}
	
	
	// Adds the edges between vertices
	public void addEdge(int source, int destination) {
		list[source].add(destination);
		list[destination].add(source);
	}

	
	// Prints graph
	public void printGraph() {
		for(int i=0; i<list.length; i++)
			System.out.println(list[i]);
	}
	
	// Prints graph (way 2)
	public void print_Graph() {
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].size(); j++) {
				System.out.print(list[i].get(j) + " ");
			}
			System.out.print("\n");
		}
	}
	
	
	// Displays vertex 
	public void VertexConnections() {
		for(int i=0; i<list.length; i++) {
			System.out.print("Vertex " + i + " is connected to vertex(ices): ");
			for(int j=0; j<list[i].size(); j++) {
				System.out.print(list[i].get(j) + " ");
			}
			System.out.println(" ");
		}
	}
	
}

