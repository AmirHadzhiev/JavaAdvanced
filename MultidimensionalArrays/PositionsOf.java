package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         boolean cantFoundNumber = true;
        int[][] matrix =readMatrix(scanner);
        int numberToFind = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < matrix.length; row++) {
            int [] arr = matrix[row];
            for (int coll = 0; coll < arr.length; coll++) {
              int  element = arr[coll];
              if (element==numberToFind){
                  System.out.println(row+" "+coll);
                  cantFoundNumber=false;
              }

            }

        }
        if (cantFoundNumber){
            System.out.println("not found");
        }


    }
    public static int [][] readMatrix(Scanner scanner) {



        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = arr;
        }


        return matrix;
    }
}
