package MultidimensionalArrayExersice;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String [] data = (scanner.nextLine().split(" "));
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" ");
        }
        String line = scanner.nextLine();
        while (!line.equals("END")){
            String [] comands = line.split(" ");
            if (comands.length==5) {
                String swapComand = comands[0];
                int rowl = Integer.parseInt(comands[1]);
                int coll = Integer.parseInt(comands[2]);
                int row2 = Integer.parseInt(comands[3]);
                int col2 = Integer.parseInt(comands[4]);
                if (rowl >= 0 && rowl < rows && row2 >= 0 && row2 < rows && coll >= 0 && coll < cols && col2 >= 0 && col2 < cols) {

                    String furstPosition = matrix[rowl][coll];
                    String secondPosition = matrix[row2][col2];
                    matrix[rowl][coll] = secondPosition;
                    matrix[row2][col2] = furstPosition;

                    for (String[] strings : matrix) {
                        for (String string : strings) {
                            System.out.print(string + " ");

                        }
                        System.out.println();
                    }
                } else System.out.println("Invalid input!");
            } else {
                System.out.println("Invalid input!");
            }






            line= scanner.nextLine();
        }
    }
}
