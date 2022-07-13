package Fuctionexercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int length = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Predicate<String> namesInCondition = name -> {
        if (name.length()>length){
            return false;
        }  else{
            return true;}
        };
        for (String name : names) {
           if (namesInCondition.test(name)){
               System.out.println(name);
           }
        }


    }
}
