package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n  = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();

        for (int i = 0; i < n ; i++) {
            String [] line = scanner.nextLine().split(" ");
            String comand = line[0];
            if (comand.equals("1")){
                int element = Integer.parseInt(line[1]);
                stackOfNumbers.push(element);

            } else if (comand.equals("2")){
                stackOfNumbers.pop();


            } else if (comand.equals("3")){
                Integer max = Collections.max(stackOfNumbers);
                System.out.println(max);


            }

        }
    }
}

