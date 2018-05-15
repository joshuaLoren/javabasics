/**
 *  Data Structures Hands On 6
 *  @author Small
 */ 
 
/* Class linkedList */
public class LinkedListWithRecursiveMethod
{
   protected Node start;
   protected Node end ;
   public int size ;
 
   /*  Constructor  */
   public LinkedListWithRecursiveMethod()
   {
      start = null;
      end = null;
      size = 0;
   }
    /*  Function to check if list is empty  */
   public boolean isEmpty()
   {
      return start == null;
   }
    /*  Function to get size of list  */
   public int getSize()
   {
      return size;
   }    
    /*  Function to insert an element at begining  */
   public void insertAtStart(int val)
   {
      Node nptr = new Node(val, null);    
      size++ ;    
      if(start == null) 
      {
         start = nptr;
         end = start;
      }
      else 
      {
         nptr.setLink(start);
         start = nptr;
      }
   }
   /*  Function to insert an element at end  */
   public void add(int val)
   {
      Node nptr = new Node(val,null);    
      size++ ;    
      if(start == null) 
      {
         start = nptr;
         end = start;
      }
      else 
      {
         end.setLink(nptr);
         end = nptr;
      }
   }

    /*  Function to display elements  */
   public void printList()
   {
      System.out.print("\nSingly Linked List = ");
      if (size == 0) 
      {
         System.out.print("empty\n");
         return;
      }    
      if (start.getLink() == null) 
      {
         System.out.println(start.getData() );
         return;
      }
      Node ptr = start;
      System.out.print(start.getData()+ "->");
      ptr = start.getLink();
      while (ptr.getLink() != null)
      {
         System.out.print(ptr.getData()+ "->");
         ptr = ptr.getLink();
      }
      System.out.print(ptr.getData()+ "\n");
   }
    
   public class Node
   {
      protected int data;
      protected Node link;
   
    /*  Constructor  */
      public Node()
      {
         link = null;
         data = 0;
      }    
    /*  Constructor  */
      public Node(int d,Node n)
      {
         data = d;
         link = n;
      }    
    /*  Function to set link to next Node  */
      public void setLink(Node n)
      {
         link = n;
      }    
    /*  Function to set data to current Node  */
      public void setData(int d)
      {
         data = d;
      }    
    /*  Function to get link to next node  */
      public Node getLink()
      {
         return link;
      }    
    /*  Function to get data from current Node  */
      public int getData()
      {
         return data;
      }
   }
   
   public static void main(String[] args)
   {
      LinkedListWithRecursiveMethod list = new LinkedListWithRecursiveMethod();
      
      list.add(5);
      list.add(10);
      list.add(15);
      
      System.out.println("Contents of list: " + list.printList());
      System.out.print("Size using non-recursive method: \n" + list.getSize());
      
      
   }
}
 
