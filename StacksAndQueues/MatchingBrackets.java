package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        ArrayDeque<Integer> stacklist = new ArrayDeque<>();


        for (int i = 0; i < text.length(); i++) {
            char chh = text.charAt(i);
            if (chh == '(') {
                stacklist.push(i);
            } else if (chh == ')') {
                System.out.println(text.substring(stacklist.pop(), i+1));
            }

        }
    }
}
