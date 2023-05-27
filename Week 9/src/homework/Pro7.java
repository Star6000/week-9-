package homework;

import java.util.HashMap;

public class Pro7 {
    public static void main(String[] args) {
        HashMap<String,Integer> language = new HashMap<>();
        language.put("Javascript",6);
        language.put("Ruby",3);
        language.put("Python",4);
        language.put("C++",3);
        language.put("Java",8);
        //iterate through only value
        System.out.println("Value :");
        for(Integer value : language.values()){
            System.out.println(value);
            System.out.println(",");
        }


    }
}
