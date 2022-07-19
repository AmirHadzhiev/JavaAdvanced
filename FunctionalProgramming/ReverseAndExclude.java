package Fuctionexercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int numberForDivide = Integer.parseInt(scanner.nextLine());
       numberList= numberList.stream().filter(n -> n % numberForDivide!=0).collect(Collectors.toList());
       numberList.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n+" "));

    }
}
