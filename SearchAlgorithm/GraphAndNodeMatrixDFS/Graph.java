package GraphAndNodeMatrixDFS;
import java.util.ArrayList;

// import GraphAndNodeMatrix.Node;

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

    public void depthFristSearch(int src) {
        boolean[] visited = new boolean[size];
        dFSHelper(src, visited);

    }

    private void dFSHelper(int src, boolean[] visited) {

        if (visited[src] == true) {
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited ");
        }

        for (int i=0; i<matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited);
                 System.out.println(nodes.get(i).data + " back to " + nodes.get(src).data);
            }
        }

        return;
    }
}
