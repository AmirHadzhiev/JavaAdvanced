package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if (n<=2){
            System.out.println("1");
        }

        stack.push(1);
        stack.push(1);

        for (int i = 0; i < n; i++) {
         int furstNumber  = stack.pop();
         int secondumber  = stack.pop();

         stack.push(furstNumber+secondumber);
            stack.push(secondumber);
        }
        System.out.println(stack.peek());

    }
}
