package SetAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class FixEmails {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String name = scanner.nextLine();
         Map<String,String> mapList = new LinkedHashMap<>();
         while (!name.equals("stop")){
             String abv = scanner.nextLine();
             String [] proverka = abv.split("\\.");
             if (!proverka[1].equals("com")&& !proverka[1].equals("uk")&& !proverka[1].equals("us")){
                 mapList.putIfAbsent(name,abv);

             }

             name= scanner.nextLine();
         }
        for (Map.Entry<String, String> entry : mapList.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue() );
        }


    }
}
