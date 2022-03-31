package collections;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main (String... args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 10; i > 0; i--) {
            queue.add(i);
        }
        // Queue: (FRONT) 10 9 8 7 6 5 4 3 2 1 (REAR)
        // PriorityQueue sorts the data for us
        // Queue: (FRONT) 1 2 3 4 5 6 7 8 9 10 (REAR)
        // Peeking --> obtaining the head of Queue
        // Polling --> remove the head of Queue

        System.out.println(queue.peek()); // Head of queue: 1
        queue.poll(); // Removing the head
        System.out.println(queue.peek()); //New Head of queue: 2

    }

}
