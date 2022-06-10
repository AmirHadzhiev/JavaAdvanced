package SetAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
        Set<String> set = new LinkedHashSet<>();

         while (!input.equals("END")){
             String [] comands = input.split(", ");
             String direction = comands[0];
             String carNumber = comands[1];
             if (direction.equals("IN")){
                 set.add(carNumber);
             } else {
                 set.remove(carNumber);
             }

             input= scanner.nextLine();
         }
         if (set.isEmpty()){
             System.out.println("Parking Lot is Empty");
         } else {
             for (String s : set) {
                 System.out.println(s);

             }

         }
    }
}
