public class ArrayBasedStack <T> implements StackInterface<T> {

T[] data;
int topOfStack;
final int INITIAL_CAPACITY = 5; 
boolean initialized;

//data = new T[];



/**Parameterized constructor.
**/

public ArrayBasedStack(int topOfStack){
  data = (T[]) new Object[INITIAL_CAPACITY]; 
   if (isEmpty()) {
      topOfStack = -1; 
      }
   if(topOfStack < 0) {
      throw new IllegalArgumentException("Must be greater than zero"); 
      }
}

public ArrayBasedStack(){
   data = (T[]) new Object[INITIAL_CAPACITY];
    topOfStack = 0;
    initialized = true; 
    
}


/**
   An interface for the ADT stack.
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 4.0
*/
   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry){
   }
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop(){
   }
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek(){
   }
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty(){
   return true;
   }
  
   /** Removes all entries from this stack. */
   public void clear(){
   }
   

}