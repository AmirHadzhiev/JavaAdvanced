package Fuctionexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> add1 = listIntigers -> listIntigers.stream().map(n-> n+1).collect(Collectors.toList());
        UnaryOperator<List<Integer>>  multy = listIntigers -> listIntigers.stream().map(n-> n*2).collect(Collectors.toList());
        UnaryOperator<List<Integer>>  sub = listIntigers -> listIntigers.stream().map(n-> n-1).collect(Collectors.toList());
        Consumer<Integer> print = n -> System.out.print(n+" ");


        String comands = scanner.nextLine();
        while (!comands.equals("end")){
            switch (comands){
                case "add":
                    numbers = add1.apply(numbers);
                    break;
                case "multiply":
                    numbers = multy.apply(numbers);
                    break;
                case "subtract":
                    numbers =  sub.apply(numbers);
                    break;
                case "print":
                    numbers.forEach(print);
                    System.out.println();


                    break;
            }

            comands= scanner.nextLine();
        }


    }
}
