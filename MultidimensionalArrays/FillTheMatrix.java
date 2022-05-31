package MultidimensionalArrayExersice;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] data = (line.split(", "));
        int size = Integer.parseInt(data[0]);
        String patern = data[1];
        int[][] matrix = new int[size][size];
        if (patern.equals("A")) {
            int counter = 1;
            for (int col = 0; col < size; col++) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = counter;
                    counter++;

                }

            }


        } else {
            int counter = 1;
            for (int col = 0; col < size; col++) {
                if ((col+1)  % 2 == 0) {
                    for (int row = size - 1; row >= 0; row--) {
                        matrix[row][col] = counter;
                        counter++;
                    }
                } else {
                    for (int row = 0; row < size; row++) {
                        matrix[row][col] = counter;
                        counter++;

                    }
                }


            }

        }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");

                }

                System.out.println();
            }



    }}
