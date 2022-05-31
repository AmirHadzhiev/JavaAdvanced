package MultidimensionalArrayExersice;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

        }
        int sum1 = 0;
        for (int i = 0; i <size ; i++) {
          sum1+=  matrix[i][i];

        }
        int sum2 = 0;
        for (int row = size -1, col = 0; col < size; row--,col++) {

                sum2+=matrix[row][col];

            
        }
        int diferences = 0;
        if (sum2>sum1){
          diferences=  sum2-sum1;
        } else if (sum1>sum2){
         diferences=   sum1-sum2;
        } else{
            diferences=0;
        }
        System.out.println(diferences);
    }
}
