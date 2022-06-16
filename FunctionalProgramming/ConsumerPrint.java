package Fuctionexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsumerPrint {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" ")).forEach(n -> System.out.println(n));
    }
}
