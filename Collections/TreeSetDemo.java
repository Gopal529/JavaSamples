import java.util.*;
class TreeSetDemo{
public static void main(String args[]){
TreeSet<String> ts=new TreeSet<String>();
ts.add("C");
ts.add("A");
ts.add("B");
ts.add("E");
ts.add("F");
System.out.println(ts);
System.out.println(ts.subSet("C","F"));
}
}