package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //Count = 10
        //Sum = 41
       // System.out.println("Count = "+numbers.size());
        Function<List<Integer>,String> countFormat = n-> "Count = "+n.size();
        Function<List<Integer>,Integer> sumFormat = l-> l.stream().mapToInt(e -> e).sum();
        int sum = sumFormat.apply(numbers);
        Function<Integer,String> sumForPrint = n-> "Sum = "+sum;
        String apply1 = countFormat.apply(numbers);
        System.out.println(apply1);
        String apply2 = sumForPrint.apply(sum);
        System.out.println(apply2);

    }
}
