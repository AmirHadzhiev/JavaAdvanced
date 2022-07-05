package Fuctionexercise;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        List<Integer> listOfIntigers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

                      
        Function<List<Integer>,Integer> func = n -> minnumber(n);

        int index = func.apply(listOfIntigers);
        System.out.println(index);

        //n -> minnumber(n)



    }

    private static int minnumber(List<Integer> list ) {
        int minNumber = 10000000;
        int index = 0;
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)<minNumber){
                minNumber=list.get(i);
                index=i;
            }

        }
        return index;


    }

}
