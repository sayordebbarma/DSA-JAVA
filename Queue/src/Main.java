import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // add = enqueue offer()
        // remove = dequeue pull()
        Queue<String> queue = new LinkedList<>();

        queue.offer("rahul");
        queue.offer("Anjali");
        queue.offer("Vanni");
        queue.offer("Tarun");
        queue.offer("Tarun");

        queue.poll();

        System.out.println(queue);


    }
}