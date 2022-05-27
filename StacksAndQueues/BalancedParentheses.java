package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackList = new ArrayDeque<>();
        ArrayDeque<String> stackQueue = new ArrayDeque<>();
        String line = scanner.nextLine();
        String [] symbols = line.split("");

        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals("(") || symbols[i].equals("{") || symbols[i].equals("[")){
                stackList.push(symbols[i]);
            }
            else if (symbols[i].equals(")") || symbols[i].equals("}") || symbols[i].equals("]")){

                stackQueue.offer(symbols[i]);

            }

        }

       if (stackList.size()==stackQueue.size()) {
           for (int i = 0; i < stackList.size(); i++) {
               if (stackList.peek().equals("(") && stackQueue.peekFirst().equals(")")) {
                   stackList.pop();
                   stackQueue.poll();
                   i--;
               } else if (stackList.peek().equals("{") && stackQueue.peekFirst().equals("}")) {
                   stackList.pop();
                   stackQueue.poll();
                   i--;
               } else if (stackList.peek().equals("[") && stackQueue.peekFirst().equals("]")) {
                   stackList.pop();
                   stackQueue.poll();
                   i--;
               }

           }
       }
       else {
           System.out.println("NO");
       }
        if (stackList.isEmpty() && stackQueue.isEmpty() ){
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }


    }
}
