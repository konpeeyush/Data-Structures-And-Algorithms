package Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>() ;
        list.add(10) ;
        list.add(20) ;
        list.add(30) ;
        list.add(40) ;
        list.add(50) ;
        Iterator<Integer> it= list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
