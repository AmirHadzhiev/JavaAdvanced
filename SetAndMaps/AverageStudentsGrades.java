package SetAndMaps;

import java.util.*;
import java.util.stream.Stream;

public class AverageStudentsGrades {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Map<String, ArrayList<Double>> mapStudents = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String [] data = scanner.nextLine().split(" ");
            String student = data[0];
            double grade = Double.parseDouble(data[1]);
           // mapStudents.putIfAbsent(student,new ArrayList<>());
            //mapStudents.put(student,mapStudents.get(student).add(grade));
            if (mapStudents.containsKey(student)){
                mapStudents.get(student).add(grade);
            } else {
                mapStudents.put(student,new ArrayList<>());
                mapStudents.get(student).add(grade);
            }
        }

        for (Map.Entry<String, ArrayList<Double>> entry : mapStudents.entrySet()) {
            System.out.printf("%s -> ",entry.getKey());
            for (Double aDouble : entry.getValue()) {
                System.out.printf("%.2f ",aDouble);

            }
            Double average = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElseThrow();

            System.out.printf("(avg: %.2f)",average);
            System.out.println();

        }

    }
}
