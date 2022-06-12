import java.util.*;
public class ArraydequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Deque<Integer> de_que = new ArrayDeque<Integer>(10);
      //Operation1 //add() method
      //adding custom elements
      //using add method to insert
      de_que.add(10);
      de_que.add(20);
      de_que.add(30);
      de_que.add(40);
      de_que.add(50);
	 
      //iterating using for each loop
      for(Integer element: de_que) {
    	  System.out.println("element:"+element);
      }
	//operation2
    //clear()method 
      {
      System.out.println("using clear() ");
      de_que.clear();
      }
      //operation3
      //addFirst() method
      de_que.addFirst(89);
      de_que.addFirst(78);
      //operation4
      //addLast() method
      de_que.addLast(75);
      de_que.addLast(45);
      //Display message
      System.out.println("above elements are removed now");
      //iterators
      System.out.println("elements of deque using iterator :");
      for (Iterator itr = de_que.iterator();
              itr.hasNext();) {
             System.out.println(itr.next());
         }
  
         // descendingIterator()
         // To reverse the deque order
         System.out.println(
             "Elements of deque in reverse order :");
  
         for (Iterator dItr = de_que.descendingIterator();
              dItr.hasNext();) {
             System.out.println(dItr.next());
         }
  
      //operation5
      //element method to get Head element
      System.out.println("head element using element():" + de_que.element());
      //operation6
      //getFirst() method 
      System.out.println("head element using getFirst():" + de_que.getFirst());
      //operation7
      //getLast() method
      System.out.println("head element using getLast():" + de_que.getLast());
   // Operation 8
      // toArray() method :
      Object[] arr = de_que.toArray();
      System.out.println("\nArray Size : " + arr.length);

      System.out.print("Array elements : ");

      for (int i = 0; i < arr.length; i++)
          System.out.print(" " + arr[i]);

      // Operation 9
      // peek() method : to get head
      System.out.println("\nHead element : "
                         + de_que.peek());
      // Operation 11
      // push() method
      de_que.push(265);
      de_que.push(984);
      de_que.push(2365);

      // Operation 12
      // remove() method : to get head
      System.out.println("Head element remove : "
                         + de_que.remove());
      System.out.println("The final array is: " + de_que);
    }
}
        


