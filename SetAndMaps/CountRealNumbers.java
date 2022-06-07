package SetAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Map<Double,Integer> map = new LinkedHashMap<>();
        double [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        for (int i = 0; i < numbers.length; i++) {
           double number = numbers[i];
           map.putIfAbsent(number,0);
           map.put(number,map.get(number)+1);


        }

        for ( var entry : map.entrySet()) {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());

        }


    }
}
