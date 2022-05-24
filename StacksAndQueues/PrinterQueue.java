package StacksAndQueues;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> files = new ArrayDeque<>();
        String text = scanner.nextLine();

        while (!text.equals("print")){
            if (text.equals("cancel")){
                if (files.isEmpty()){
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled "+ files.poll() );
                }

            } else {
                files.offer(text);
            }

            text= scanner.nextLine();
        }

        for (String file : files) {
            System.out.println(file);

        }


    }
}
