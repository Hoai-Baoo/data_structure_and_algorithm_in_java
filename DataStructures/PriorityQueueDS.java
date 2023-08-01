import java.util.*;
public class PriorityQueueDS {
    
    public static void main(String[] args) {

        // Priority Queue = A FIFO data structure that serve elements
        //                  with the highest priorities first
        //                  before elements with lower priority

        
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}
