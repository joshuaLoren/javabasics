public class BinaryTree
{

   BinaryTreeNode root;
   
   //inserting elements
   //if the new node's value is lower than the current node's we go to the left child
   //if the new node's value is greater than the current node's we go to the right child
   //when the current node is null, we've reached a leaf node and we can insert the new node in that position
   
   private BinaryTreeNode addRecursive(BinaryTreeNode current, int value)
   {
      if(current == null)
      {
         return new BinaryTreeNode(value);
      }
      
      if(value < current.value)
      {
         current.left = addRecursive(current.left, value);
      }
      else if(value > current.value)
      {
         current.right = addRecursive(current.right, value);
      }
      else
      {
         //value must already exist
         return current;
      }  
      
      return current;
   }
   
   public void add(int value)
   {
      root = addRecursive(root, value);
   }
   
   /**
      Finding an element
   */
   
   private boolean containsNodeRecursive(BinaryTreeNode current, int value) {
      if (current == null) {
         return false;
      } 
      if (value == current.value) {
         return true;
      } 
      return value < current.value
         ? containsNodeRecursive(current.left, value)
         : containsNodeRecursive(current.right, value);
   }

   public boolean containsNode(int value) {
      return containsNodeRecursive(root, value);
   }


}