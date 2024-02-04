import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //add element
       list.add(10);
       list.add(20);
       list.add(30);
       //print ArrayList
       System.out.println(list); 
       //get eliment
       System.out.println(list.get(1));
       //add or modifiy element
       list.add(3, 1);
       list.add(0, 5);
       System.out.println(list);
       //set element
       list.set(1, 15);
       System.out.println(list);
       //delete or remove element
       list.remove(1);
       System.out.println(list);
       //array list size
       System.out.println(list.size());
       //sort array list element
       Collections.sort(list);
       System.out.println(list);
       // print array list using loop
       for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) +" ");
       }
    }
}