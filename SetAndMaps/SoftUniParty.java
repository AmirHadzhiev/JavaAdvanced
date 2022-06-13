package SetAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String input = scanner.nextLine();
         Set<String> setVip = new TreeSet<>();
         Set<String> setRegular = new TreeSet<>();

         while (!input.equals("PARTY")){
             char number = input.charAt(0);
             if (Character.isDigit(number)){
                 setVip.add(input);

             } else {
                 setRegular.add(input);
             }
             input= scanner.nextLine();
         }
         String guestwhocome = scanner.nextLine();
         while (!guestwhocome.equals("END")){

             setVip.remove(guestwhocome);
             setRegular.remove(guestwhocome);
             guestwhocome= scanner.nextLine();
         }
        System.out.println(setVip.size()+setRegular.size());
         for (String s : setVip) {
            System.out.println(s);
        }
        for (String s : setRegular) {
            System.out.println(s);
        }


    }
}
