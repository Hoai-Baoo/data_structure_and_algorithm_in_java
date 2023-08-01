
import java.util.*;

public class LinkedListDS {
    public static void main(String[] args) {
        
        // LinkedList = stores Nodes in 2 parts (data + address)
        //              Nodes are in non-consecutive memory location
        //              Elements are linked using pointers
        //              
        //                      Singly Linked List
        //              Node                Node                Node
        //          [data | address] -> [data | address]  -> [data | address]
        //
        //                      Doubly Linked List
        //                  Node                    Node
        //          [addr | data |addr] <-> [addr | data | addr]
        //
        //  advantages?
        //  1. Dynamic Data Structure (allocates needed memory while running)
        //  2. Insertion and Deletion of Nodes is easy. O(1)
        //  3. No/Low memory waste

        // disadvantages?
        //  1. Greater memory usage (addtitonal porinter)
        //  2. No random access of elements (no index [i])
        //  3. Accessing/searching elements is more time consuming.

        // uses?
        //  1. implemennt Stacks/Queues
        //  2. GPS navigation
        //  3. music playlist


        LinkedList<String> linkedList = new LinkedList<>();
        // Stack<String> linkedList = new Stack<>();

        // Treat linked list as stack
        // linkedList.push("A");
        // linkedList.push("B");
        // linkedList.push("C");
        // linkedList.push("D");
        // linkedList.push("F");
        // linkedList.pop();

        // Treat linked list as queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();

        // linkedList.add(4,"E");
        // linkedList.remove("E");
        // System.out.println(linkedList.indexOf("F"));

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.print(linkedList);
    }
}
