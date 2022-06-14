package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;


public class addVat {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Consumer<Double> print = d -> System.out.printf("%.2f%n",d);
        UnaryOperator<Double> addVat = p -> p*1.20;



        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine()
                        .split(", "))
                .map(Double::parseDouble)
                .map(addVat).forEach(print);
    }
}
