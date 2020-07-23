# Implementation of a graph with its adjacency list
We need 2 classes:
  - a graph class that defines the graph with its methods
  - a main class to test the graph class and its methods
  
The idea is to represent the adjacency list with an array of LinkedLists, where the size of the array is same as the number of vertices in the graph. 

Each slot in the array represents a vertex of the graph. Every vertex has a LinkedList. 

Each node of the LinkedList represents the reference to the other vertex(ices) that have an edge with the current vertex.
