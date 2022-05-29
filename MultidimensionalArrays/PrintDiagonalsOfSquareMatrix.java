package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

        }
        for (int r = 0; r < size; r++) {
            System.out.print( matrix[r][r]+" ");
        }
        System.out.println();
        int row = size - 1;
        int col = 0;
       while (row>=0&& row<size  && col>=0 && col< matrix[row].length ){
           System.out.print(matrix[row][col]+" ");
           col++;
           row--;


       }

    }
}
