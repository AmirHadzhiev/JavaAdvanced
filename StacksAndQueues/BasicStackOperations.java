package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stackList = new ArrayDeque<>();
        String[] stringLine = scanner.nextLine().split(" ");
        int N = Integer.parseInt(stringLine[0]);
        int S = Integer.parseInt(stringLine[1]);
        int X = Integer.parseInt(stringLine[2]);

        String[] stringNUmber = scanner.nextLine().split(" ");
        for (String s : stringNUmber) {
            stackList.push(Integer.parseInt(s));

        }

        for (int i = 0; i < S; i++) {
            stackList.pop();

        }
        boolean findTheNumber = false;

        for (Integer integer : stackList) {
            if (integer == X) {
                findTheNumber = true;
            }
        }
        boolean ifIsZero = false;
        if (stackList.isEmpty()) {
            ifIsZero = true;
        }


           if (findTheNumber){
               System.out.println("true");
           } else if (ifIsZero){
               System.out.println("0");
           }
           else {
               int min = 1000000000;
               for (Integer n : stackList) {
                   if (min>n){
                       min=n;
                   }
               }
               System.out.println(min);
           }

    }
}
