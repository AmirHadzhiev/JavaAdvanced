package SetAndMaps;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
        Map<String,Double> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            OptionalDouble average = Arrays.stream(numbers).sorted().average();
            double asDouble = average.getAsDouble();
            if (map.containsKey(student)){


            } else {
                map.put(student,asDouble);

            }
            


        }
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.printf("%s is graduated with %f%n",entry.getKey(),entry.getValue());
                
            }





    }
}
