package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Test{
public static void main(String args[]){
List<String> list=Arrays.asList("Lars","Simon");
List<String> anotherList= new ArrayList<>();
anotherList.add("Lars");
anotherList.add("Simon");
list.forEach(System.out::println);
anotherList.forEach(System.out::println);
}
}