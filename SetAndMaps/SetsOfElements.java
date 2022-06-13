package SetAndMapsExercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int [] lengthSets = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int furstSetLenght = lengthSets[0];
        int secondSetLengh = lengthSets[1];
        Set<Integer> furstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        for (int i = 0; i < furstSetLenght; i++) {
            furstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < secondSetLengh; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (Integer intt : furstSet) {
            if (secondSet.contains(intt)){
                System.out.print(intt+" ");
            }

        }


    }
}
