package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[row][col];
        for (int i = 0; i < row; i++) {
             firstMatrix[i]= scanner.nextLine().replaceAll(" ","").toCharArray();

        }
        char[][] secondMatrix = new char[row][col];
        for (int i = 0; i < row; i++) {
            secondMatrix[i]= scanner.nextLine().replaceAll(" ","").toCharArray();

        }
        char[][] thirdMatrix = new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                char element = firstMatrix[i][j];
                char secondelement = secondMatrix[i][j];
                if (element== secondelement){
                    thirdMatrix[i][j]=element;
                } else {
                    thirdMatrix[i][j]='*';
                }

            }

        }


        for (char[] matrixx : thirdMatrix) {
            for (char c : matrixx) {
                System.out.print(c+" ");
            }
            System.out.println();


        }

    }

}
