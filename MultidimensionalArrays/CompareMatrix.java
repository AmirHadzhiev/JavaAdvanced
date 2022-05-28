package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [][] furstMatrix = readMatrix(scanner);
        int [][] secondMatrix = readMatrix(scanner);
        if (Arrays.deepEquals(furstMatrix, secondMatrix)){
            System.out.println("equal");

        } else {
            System.out.println("not equal");
        }


    }


    public static int [][] readMatrix(Scanner scanner) {


        String[] line = scanner.nextLine().split(" ");
        int row = Integer.parseInt(line[0]);
        int col = Integer.parseInt(line[1]);

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }


        return matrix;
    }
    public static void printMattrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
           int[] arr= matrix[i];
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(" "+ arr[j] );

            }

        }

    }
}
