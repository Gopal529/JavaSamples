import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class ListOperations{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=0;i<N;i++)
        {
        int value=sc.nextInt();
        list.add(value);
        }
        int Q=sc.nextInt();
        for(int i=0;i<Q;i++)
        {
        String action=sc.next();
        if(action.equals("Insert")){
            int index=sc.nextInt();
            int value=sc.nextInt();
            list.add(index,value);
        }
        else{
            int index=sc.nextInt();
            list.remove(index);
        }
        }
        sc.close();
        for(Integer num:list)
        System.out.print(num+" ");
        
    }
}
