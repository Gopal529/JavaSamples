import java.util.*;
class ArrayListDemo{
public static void main(String args[]){
ArrayList<String> a1=new ArrayList<String>();
System.out.println(a1.size());
a1.add("C");
a1.add("B");
a1.add("E");
a1.add("D");
a1.add(2,"X");
System.out.println(a1.size());
System.out.println(a1);
a1.remove("X");
a1.remove("C");
System.out.println(a1.size());
System.out.println(a1);
}
}