/**
 *    Example of recursion in Java
 */
 
 public class recursionExample
 {
   
   /**
    *   Main Method
    */
   public static void main(String[] args)
   {
      MyLinkedList list = new MyLinkedList();
      Node node = new Node();
      
      
      list.display();
      list.add(5);
      list.add(10);
      list.add(15);
      
      System.out.print("Size using MyLinkedList's getSize() method: \n" + list.getSize());
      list.display();
      
   }
   
   /**
    *  Recusive Method for detecting number of nodes in a list
   */ 
   public int numberOfNodes(MyLinkedList l)
   {
      //store number of nodes
      int result = 0;
      
      //base case
      if(l == null)
      {
         return result + 1;
      }
      
      else
      {
         result++;
         return numberOfNodes(l.link);
      }
   }
 
 }