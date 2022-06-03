package MultidimensionalArrayExersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String rotationImput = scanner.nextLine();
         String input = scanner.nextLine();
         int maxlenght= -10000000;
         List<String> stringList= new ArrayList<>();
         while (!input.equals("END")){
             int length = input.length();
             if (length>maxlenght){
                 maxlenght=length;
             }
             stringList.add(input);
             input= scanner.nextLine();
         }
         int rows = stringList.size();
         int cols = maxlenght;
         String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String[] arr =stringList.get(row).split("");
                int test = stringList.get(row).length();

               if (stringList.get(row).length()>col)
               {
                   matrix[row][col]= arr[col];
               } else {
                   matrix[row][col]=" ";
               }

            }

        }


            String angleString = rotationImput.split("[()]")[1];
             int angle = Integer.parseInt(angleString) % 360;


        printMatrix(matrix,rows,angle,cols);

    }

    private static void printMatrix(String [][] matrix,int rows,int angle, int cols) {
        switch (angle){
            case 0:
                for (String[] strings : matrix) {
                    for (String s : strings) {
                        System.out.print(s);
                    }
                    System.out.println();
                }

                break;
            case 90 :
                for (int col = 0; col <cols ; col++) {
                    for (int row = rows-1; row >=0 ; row--) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }

                break;
            case 180 :
                for (int row = rows-1; row >=0 ; row--) {
                    for (int col = cols-1; col >=0 ; col--){
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }

                break;
            case 270 :
                for (int col = cols-1; col >=0 ; col--) {
                    for (int row = 0; row < rows; row++) {
                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }


                break;
        }
    }
}
