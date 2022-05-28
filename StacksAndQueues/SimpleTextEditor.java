package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int numberOfOperations = Integer.parseInt(scanner.nextLine());
         StringBuilder text = new StringBuilder( );
        ArrayDeque<String>  stack = new ArrayDeque<>();
        for (int i = 0; i < numberOfOperations; i++) {
            String [] comands =  scanner.nextLine().split(" ");
            String furstcomand = comands[0];
            switch (furstcomand){
                case "1" :
                    text.append(comands[1]);
                    stack.push("1 "+comands[1]);
                break;
                case "2" :
                    stack.push("2 "+comands[1]);
                    int numberForDelite = Integer.parseInt(comands[1]);
                    for (int j = 0; j < numberForDelite; j++) {
                        text.deleteCharAt(text.length()-1);

                    }
                    break;
                case "3" :
                    int index = Integer.parseInt(comands[1])-1;
                    System.out.println(text.charAt(index));
                    break;
                case "4" :
                 String [] undocomands = stack.pop().split(" ");
                 if (undocomands[0].equals("1")){

                     for (int j = 0; j < undocomands[1].length(); j++) {
                         text.deleteCharAt(text.length()-1);

                     }

                 } else {
                    String [] cc = stack.pop().split(" ");
                     text.append(cc[1]);
                 }


                    break;
            }


        }

    }
}
