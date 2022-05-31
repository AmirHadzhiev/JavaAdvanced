package MultidimensionalArrayExersice;

import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String [] data = (scanner.nextLine().split(" "));
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int [][] matrix = new int[rows][cols];
        int counter = 1;
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col <cols ; col++) {
                matrix[row][col]=counter;
                counter++;
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")){
            String [] comands = input.split(" ");
            int rowHit = Integer.parseInt(comands[0]);
            int colHit = Integer.parseInt(comands[1]);;
            int radius = Integer.parseInt(comands[2]);
            int counterM=0;
             int [][] newmatrix = new int[rows][matrix[counterM].length];

             int counterr = 1;
            for (int row = 0; row < rows ; row++) {
                for (int col = 0; col <cols ; col++) {
                    if (row!=rowHit&& col!= colHit){
                    newmatrix[row][col]=counterr;
                    counterr++;}
                    counterM++;

                }
            }








            input= scanner.nextLine();
        }


        System.out.println();
    }
}
