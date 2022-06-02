package MultidimensionalArrayExersice;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] data = (line.split(" "));
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        String matrix[][] =new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
               char outside = (char) ('a'+ row);
               char inside = (char) (outside + col);

                matrix[row][col]= String.valueOf(outside)+inside+outside;

            }

        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.printf("%s ",string);

            }
            System.out.println();
        }

    }
}
