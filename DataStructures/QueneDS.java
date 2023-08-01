import java.util.LinkedList;
import java.util.Queue;
public class QueneDS {
    
    public static void main(String[] args) {

        // Queue = FIFO data structure. First-in First-out
        //         A collection designed for holding elements prior to processing
        //         Linear data structures

        //         add = enqueue, offer()
        //         remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();
        System.out.println(queue.isEmpty());

        queue.add("Karen");
        queue.offer("Chad");
        queue.add("Steve");
        queue.offer("Harold");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        
        // Where are queues useful?
        // 1. Keyboard buffer (letters should appear on the screen in the orther they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in Linked List, Priority Queues, Breadth-first search
        
    }
}
