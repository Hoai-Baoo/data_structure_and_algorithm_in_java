package GraphAndNodeMatrix;
import java.util.ArrayList;

import GraphAndNodeMatrixDFS.Node;

public class Graph {
    
    public ArrayList<Node> nodes;
    public int[][] matrix;
    public int size;

    public Graph(int size) {
        nodes = new ArrayList<>();
        this.size = size;
        matrix = new int [size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) 
            return true;
        return false;
    }

    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i=0; i<size; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j=0; j<size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
