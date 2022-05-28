package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        String [] numbersArray = scanner.nextLine().split(" ");
        for (String s : numbersArray) {
            numbersStack.push(Integer.parseInt(s));
        }
        while (!numbersStack.isEmpty()){
            System.out.print(numbersStack.pop()+ " ");
        }


    }
}
