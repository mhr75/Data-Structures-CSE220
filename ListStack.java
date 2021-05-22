public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size()
{
return size;
}
// Returns true if the stack is empty
    public boolean isEmpty()
    {
      if(size>0)return false;
      else return true;
    }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException
    {
      if(size==0){top=new Node(e,null);size++;}
      else
      {
        Node n=new Node (e,top);
        top=n;
        size++;
      }
    }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException
    {  Object elem=null;
      if(size<=0)throw new StackUnderflowException();
      else
      {
        elem=top.val;
        top=top.next;
        size--;
      }
      return elem;
    }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException
    {
      Object elem=null;
      if(size<=0)throw new StackUnderflowException();
      else
      {
        elem=top.val;
      }
      return elem;
    }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString()
    {
    String s="";
   for(Node n=top;n!=null;n=n.next) s=s+n.val+" ";
   return s;
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray()
    {Object []a=new Object[size];
      int j=0;
      for(Node n=top;n!=null;n=n.next){a[j]=n.val;j++;}
    return a;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e)
    {
      int j=0;
      for(Node n=top;n!=null;n=n.next){if(n.val.equals(e))return j;j++;}
    return -1;
    }
    

}