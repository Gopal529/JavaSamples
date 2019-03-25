import java.util.*;
class LinkedListDemo{
public static void main(String args[]){
LinkedList<String> ll=new LinkedList<String>();
ll.add("F");
ll.add("B");
ll.add("D");
ll.add("C");
System.out.println(ll);
ll.addLast("Z");
ll.addFirst("A");
System.out.println(ll);
ll.remove("F");
ll.remove(2);
System.out.println(ll);
String val=ll.get(2);
ll.set(2,"Gopal");
System.out.println(val);
System.out.println(ll);
}
}