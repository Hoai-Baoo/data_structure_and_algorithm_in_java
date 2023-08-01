package GraphAndNodeList;
import java.util.*;

public class Graph {
    
    public ArrayList<LinkedList<Node>> alist;

    public Graph() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }   
    
    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }
    
    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for (Node node:currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> currentList : alist) {
            for (Node node : currentList) {
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }
}
