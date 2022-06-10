package SetAndMapsExercise;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Set<String> chemicals = new TreeSet<>();

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String [] data = scanner.nextLine().split(" ");
            chemicals.addAll(List.of(data));

        }
        for (String chemical : chemicals) {
            System.out.print(chemical+" ");
        }

    }
}
