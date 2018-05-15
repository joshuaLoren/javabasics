import java.lang.*;

/**
   create a generic stack that implements StackADT
 */
 
 public class GenericStack<T> implements StackADT<T>
 {
   //stack will have: size, stack, and start_capacity as fields
   
   private int size; //keep track of how many items are in our stack
   private T[] stack; //create an array of generic type. To be decided when stack is instantiated
   private static final int INITIAL_CAPACITY = 10;//static means not available to outside classes...
   private static int specificCapacity;
   //constructor
   
   public GenericStack()
   {
      int size = 0;
      stack = (T[])(new Object[INITIAL_CAPACITY]);//initialize a stack of generic type with INITIAL_CAPACITY passed through array
      
   }
   
   public GenericStack(int specificCapacity)
   {
      int size = 0;
      stack = (T[])(new Object[specificCapacity]);//initialize a stack of generic type with INITIAL_CAPACITY passed through array
      
   }
   
   
   
   // push @param T element
   
   public void push(T element)
   {
      //first check if stack is full
      if(size == stack.length)
      {
         expandCapacity();
      }
      
      stack[size] = element;
      size++;
      
   }
   
   // pop @return top of stack. Also remove
   
   public T pop() throws ArrayIndexOutOfBoundsException
   {
      if(size == 0) 
      {
         throw new ArrayIndexOutOfBoundsException();
         
      }
      
      //stack is not empty. pop top of stack
      
      T result = stack[size-1];
      stack[size-1] = null;
      size--;
      
      return result;
      
   }
   
   // peek
   
   public T peek() throws ArrayIndexOutOfBoundsException
   {
      if(size == 0) 
      {
         throw new ArrayIndexOutOfBoundsException();
         
      }
      
      //stack is not empty. pop top of stack
      
      T result = stack[size-1];
      return result;
      
   }
   
   // isEmpty
   
   public Boolean isEmpty()
   {
      if(size == 0)
      {
         return true;
      }
      
      return false;
   }
   
   // showArray
   
   public void showArray()
   {
      for(int i = 0; i < stack.length; i++)
      {
         System.out.print(stack[i]);
         System.out.println(" , ");
      }
   }
   // expandCapacity
   
   public void expandCapacity()
   {
      T[] newStack = (T[])(new Object[2 * INITIAL_CAPACITY]);
      
      //copy old stack to new
      
      for(int i = 0; i < stack.length; i++)
      {
         stack[i] = newStack[i];
      }
      
      stack = newStack;
   }
   
   // length @ return stacks length
   
   public int length()
   {
      return size;
   }

   
 }