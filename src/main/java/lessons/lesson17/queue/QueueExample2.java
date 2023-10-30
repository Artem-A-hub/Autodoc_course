package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Бананы");
        queue.add("Апельсины");
        queue.add("Мандарины");
        queue.add("Яблоко");
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
    }

}
