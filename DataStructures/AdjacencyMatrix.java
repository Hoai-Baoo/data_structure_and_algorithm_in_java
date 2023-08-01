import GraphAndNodeMatrixDFS.Graph;
import GraphAndNodeMatrixDFS.Node;

public class AdjacencyMatrix {
    
    public static void main(String[] args) {

        //  Adjacency matrix = a 2D array to store 1's/0's to represent edges
        //                     # of rows =  # of unique nodes
        //                     # of cols =  # of unique nodes

        //  Runtime complexity to check an Edge: O(1)
        //  Space complexity: O(v^2)


        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);    //A->B
        graph.addEdge(1, 2);    //B->C
        graph.addEdge(2, 3);    //C->D
        graph.addEdge(2, 4);    //C->E
        graph.addEdge(4, 0);    //E->A
        graph.addEdge(4, 2);    //E->C
        graph.addEdge(1, 4);    //B->E

        graph.print();

        System.out.println(graph.checkEdge(3, 2));
    }
}
