package Collection_Framework;

import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>() ;
        list.add("Piyush") ;
        list.add("2") ;
        list.add("4") ;
//        list.set(4,"Hello") ;
        for (String ch:
             list) {
            System.out.println(ch);
        }
    }
}
