package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Pro4 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();
        color.add("pink");
        color.add("white");
        color.add("orange");
        color.add("black");
        color.add("green");

        Iterator<String> name = color.iterator();

        System.out.println("List of Color name: ");
        while (name.hasNext()){
             System.out.println(name.next());}
        }


}