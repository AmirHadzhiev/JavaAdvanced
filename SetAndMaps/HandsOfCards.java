package SetAndMapsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class HandsOfCards {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int [] num1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         int [] num2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
         if (num2.length>num1.length){
             int bigestlength= num2.length;
         } if (num2.length<num1.length){
             int bigestlength= num2.length;
         }




    }
}
