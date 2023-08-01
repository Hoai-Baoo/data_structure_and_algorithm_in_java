import GraphAndNodeMatrixBFS.*;

public class BreadthFristSearch {
    
    public static void main(String[] args) {
        
        // BFS =  a search algorithms for traversing  tree or graph data structure.
        //        This is done one 'level' at a time, rather than one 'branch' at a time.
        

        // Comparation to DFS
        // Breath FS = Traverse a graph level by level
        //             Uitilizes a Queue
        //             Better if destination is on average close to start
        //             Siblings are visited before children
        
        // Depth FS = Traverse a graph branch by branch
        //            Uitilizes a Stack
        //            Better if destination is on average far from the start
        //            More popular for games/puzzles
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
        graph.breathFirstSearch(4);
    }
}
