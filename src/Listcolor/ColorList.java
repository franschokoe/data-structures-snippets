package Listcolor;

import java.util.*;

public class ColorList {
    public static void  main(String[] args){
        List<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("red");
        colors.add("green");

        String Element = "red";
        System.out.print(colors);
        for (int i = 0 ; i < colors.size();i++){
            if(colors.get(i).equals(Element)){
                colors.remove(Element);
                i-- ;
            }
        }
        System.out.print(colors);
    }

}
