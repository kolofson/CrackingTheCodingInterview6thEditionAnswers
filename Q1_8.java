package Chapter_1;
/**

  Write an Algorithm that checks if an element within a MxN matrix is 0 then its entire row and column are set to 0.

 */

import java.util.*;

public class Q1_8 {

    public static void createMatrix(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int)Math.round(Math.random() * 8);
            }
        }
    }

    public static void displayMatrix(int matrix[][]) {

        System.out.println("\n\n");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void zeroMatrix(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 0) {

                    //sets row to zero
                    for (int k = 0; k < matrix[i].length; k++) {

                        matrix[i][k] = 0;

                    }

                    //set column to zero
                    for (int k = 0; k < matrix.length; k++) {

                        matrix[j][k] = 0;
                    }
                }
            }
        }
    }

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter matrix size");
            int matrixSize_1 = s.nextInt();
        System.out.println("Enter matrix size");
            int matrixSize_2 = s.nextInt();
        int matrix[][] = new int [matrixSize_1][matrixSize_2];

        createMatrix(matrix);
        displayMatrix(matrix);
        zeroMatrix(matrix);
        displayMatrix(matrix);
        s.close();
    }
}
