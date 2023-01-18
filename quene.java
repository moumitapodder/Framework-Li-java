import java.util.LinkedList;
import java.util.Queue;


public class quene {
    public static void main(String[] args) {
        // Create and initialize a Queue using a LinkedList
        Queue<String> element = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        element.offer("mou");
        element.offer("urjas");
        element.add("meeeee");

        System.out.println( element);
    


        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
       
        System.out.println(element.remove()) ;

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
       
        System.out.println( element.poll());
        System.out.println( element.poll());
        System.out.println(element.peek());
        System.out.println(element);
      
    }
}