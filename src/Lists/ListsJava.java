package Lists;

import java.util.ArrayList;
import java.util.List;



public class ListsJava {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
//        System.out.print(list.indexOf("A"));
//        System.out.print(list.size());
        //iterator
        //time complexity O(n)
        for (int i = 0 ; i < list.size(); i++){
            System.out.print(list.remove(i) + "\n");
            System.out.print(list + "\n");
        }
    }
}
