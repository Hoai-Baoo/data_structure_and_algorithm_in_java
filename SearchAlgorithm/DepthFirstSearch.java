import GraphAndNodeMatrixDFS.*;

public class DepthFirstSearch {
    
    public static void main(String[] args) {

        // DFS = a search algorithm for traversing
        //       a tree or graph data structure
        // 1. Pick a route
        // 2. Keep going until you reach a dead end,
        //    or a previously visited node
        // 3. Backtrack to last node that has unvisited adjacent neighbors
        
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

        // System.out.println(graph.checkEdge(3, 2));
        graph.depthFristSearch(0);
    }
}
