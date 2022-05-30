package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int size = Integer.parseInt(scanner.nextLine());
          int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

        }
        String [] data = (scanner.nextLine().split(" "));
        int rowsForUnvalidNumber = Integer.parseInt(data[0]);
        int colsForUnvalidNumber = Integer.parseInt(data[1]);
         int invalidNumber = matrix[rowsForUnvalidNumber][colsForUnvalidNumber];

        for (int r = 0; r < size ; r++) {
            for (int c = 0; c < size; c++) {
                if (matrix[r][c] == invalidNumber) {

                }

            }


        }}
}
