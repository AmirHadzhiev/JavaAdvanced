package SetAndMapsExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> words = new TreeMap<>();
        String text = scanner.nextLine();

        for (int i = 0; i <text.length() ; i++) {
            Character key = text.charAt(i);

            words.putIfAbsent(key,0);
            words.put(key,words.get(key)+1);

        }
        for (Map.Entry<Character, Integer> entry : words.entrySet()) {
            System.out.printf("%s: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
