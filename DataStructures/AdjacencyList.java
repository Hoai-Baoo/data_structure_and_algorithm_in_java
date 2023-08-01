import GraphAndNodeList.Graph;
import GraphAndNodeList.Node;

public class AdjacencyList {
    
    public static void main(String[] args) {

        // Adjacgency matrix = An array/arraylist of linked lists
        //                     Each LinkedList has a unique node at the head
        //                     Add adjacency neighbors to that node are added to that 
        //                     node's linkedlist

        // Runtime Complexity to check an Edge: O(v)
        // Space Complexity: O(v+e)

        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);        
        graph.addEdge(1, 2);        
        graph.addEdge(1, 3);        
        graph.addEdge(2, 3);        
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);        
        graph.addEdge(4, 2); 
        
        graph.print();
    }
}
