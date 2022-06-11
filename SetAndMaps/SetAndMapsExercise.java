package SetAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetAndMapsExercise {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int numberOfNames = Integer.parseInt(scanner.nextLine());

        Set<String> setNames = new LinkedHashSet<>();
        for (int i = 0; i < numberOfNames; i++) {
            String name = scanner.nextLine();
            setNames.add(name);
        }
        for (String name : setNames) {
            System.out.println(name);
        }

    }
}
