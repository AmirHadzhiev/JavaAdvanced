package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2X2Submatrix {
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
        int [][] miniMatrix =  new int[2][2];
        int bigestSum = -100000000;
        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c <cols - 1 ; c++) {
               int sum = matrix[r][c]+
                       matrix[r][c+1]+
                       matrix[r+1][c]+
                       matrix[r+1][c+1];
               if (bigestSum<sum){
                   miniMatrix[0][0]=matrix[r][c];
                   miniMatrix[0][1]=matrix[r][c+1];
                   miniMatrix[1][0]= matrix[r+1][c];
                   miniMatrix[1][1]=matrix[r+1][c+1];
                   bigestSum=sum;
               }
            }
        }
        for (int[] ints : miniMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");

            }
            System.out.println();


        }

        System.out.println(bigestSum);

    }
}
