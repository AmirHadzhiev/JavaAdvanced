package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String line = scanner.nextLine();
         String [] data = (line.split(", "));
         int rows = Integer.parseInt(data[0]);
         int cols = Integer.parseInt(data[1]);

         int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt).toArray();

        }
             int maxSum = 0;
        for (int row = 0; row <matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
               maxSum += matrix[row][col];
            }


        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(maxSum);
    }
}
