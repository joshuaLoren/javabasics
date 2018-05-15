public class QueueDemo
{
   public static void main(String[] args)
   {
      CircularArrayQueue<String> queue = new CircularArrayQueue();
      
      queue.enqueue("Josh");
      queue.enqueue("Christina");
      queue.enqueue("Mom");
      queue.enqueue("Jeremiah");
      
      System.out.println("Is queue empty? " + queue.isEmpty());
      System.out.println("Size of the queue: " + queue.size());
      System.out.println("poll: " + queue.poll());
      
      System.out.println("dequeuing: " + queue.dequeue());
      System.out.println("dequeuing: " + queue.dequeue());
      System.out.println("dequeuing: " + queue.dequeue());
      System.out.println("dequeuing: " + queue.dequeue());
      System.out.println("Size of the queue: " + queue.size());
      System.out.println("Is queue empty? " + queue.isEmpty());
      
   }
}