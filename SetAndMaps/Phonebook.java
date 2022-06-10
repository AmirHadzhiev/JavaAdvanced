package SetAndMapsExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Map<String,String> map = new LinkedHashMap<>();
         String input = scanner.nextLine();
         while (!input.equals("search")) {
             String[] data = input.split("-");
             String name = data[0];
             String number = data[1];

             if (map.containsKey(name)) {
                 map.put(name, number);

             } else {
                 map.put(name, number);
             }
              input= scanner.nextLine();
         }
          String surch = scanner.nextLine();
         while (!surch.equals("stop")){

             if (map.containsKey(surch)){
             for (Map.Entry<String, String> entry : map.entrySet()) {

                     if (surch.equals(entry.getKey())){
                         System.out.println(entry.getKey()+" -> "+entry.getValue());
                     }
                 }
             } else {
                 System.out.println("Contact "+ surch+" does not exist.");
             }





             surch= scanner.nextLine();
         }

        //Samuel -> 0047123123123


    }
}
