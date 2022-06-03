package MultidimensionalArrayExersice;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] data = (line.split(" "));
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

        }
        int[][] miniMatrix = new int[3][3];
        int bigestSum = -100000000;
        for (int r = 0; r < rows - 2; r++) {
            for (int c = 0; c <cols - 2 ; c++) {
                int sum = matrix[r][c]+
                        matrix[r][c+1]+
                        matrix[r][c+2]+
                        matrix[r+1][c]+
                        matrix[r+1][c+1]+
                        matrix[r+1][c+2]+
                        matrix[r+2][c]+
                        matrix[r+2][c+1]+
                        matrix[r+2][c+2];
                if (bigestSum<sum){
                    miniMatrix[0][0]=matrix[r][c];
                    miniMatrix[0][1]=  matrix[r][c+1];
                    miniMatrix[0][2]= matrix[r][c+2];
                    miniMatrix[1][0]= matrix[r+1][c];
                    miniMatrix[1][1]=matrix[r+1][c+1];
                    miniMatrix[1][2]=matrix[r+1][c+2];
                    miniMatrix[2][0]=matrix[r+2][c];
                    miniMatrix[2][1]=matrix[r+2][c+1];
                    miniMatrix[2][2]=matrix[r+2][c+2];
                    bigestSum=sum;
                }
            }
        }
        System.out.println("Sum = "+bigestSum);
        for (int[] ints : miniMatrix) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");

            }
            System.out.println();

        }

    }
}
