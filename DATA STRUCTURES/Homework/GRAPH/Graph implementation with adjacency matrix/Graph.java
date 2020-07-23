
public class Graph {
	int vertex;
	int matrix[][];
	
	public Graph(int vertex){
		this.vertex = vertex;
		matrix = new int[vertex][vertex];
	}
	
	public void addEdge(int start, int end) {
	//add edges between vertices
		matrix[start][end] = 1;
		matrix[end][start] = 1;
	}
	
	
	public void printGraph() {
		System.out.println("Graph (Adjacency Matrix Way): ");
		
		for (int i = 0; i < vertex; i++) {
			for (int j = 0; j <vertex ; j++) 
				System.out.print(matrix[i][j]+ " ");
			
			System.out.println();
		}
	}
	
	// Displays each vertex and its connection
	public void VertexConnection() {
		System.out.print("\n");
		for (int i = 0; i < vertex; i++) {
			System.out.print("Vertex " + i + " is connected to: ");
			
			for (int j = 0; j <vertex ; j++) {
				if(matrix[i][j]==1)
					System.out.print(j + " ");
				}
			System.out.println();
		}
	}
	
}

