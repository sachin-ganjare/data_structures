import java.util.*;
public class LL_Class {
public static void main(String args[]) {
// Declaration
LinkedList<String>ll = new LinkedList<String>();
ll.add("Mumbai");
ll.add("Chennai");
ll.add("Kolkata");
ll.add("Delhi");
ll.add("Bangalore");
ll.add("Guwahati");
ll.add("Hyderabad");
System.out.println("Linked list : "+ ll); // Simple printing

// Printing the list using an iterator
Iterator<String>itr=ll.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}


}
}