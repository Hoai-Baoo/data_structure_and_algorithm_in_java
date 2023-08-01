package GraphAndNodeMatrixBFS;
import java.util.*;

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

    public void breathFirstSearch(int src) {
        
        Queue<Integer> queue = new LinkedList();
        boolean[] visited = new boolean[size];

        queue.offer(src);
        visited[src]=true;

        while (queue.size() != 0) {
            System.out.println("Queue: " + queue.size());
            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            for (int i=0; i<matrix[src].length; i++) {
                
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
