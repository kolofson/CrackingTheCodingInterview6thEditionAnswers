package Chapter_1;

/**

    Given an image represented by a NxN matrix, where each pixel is 4 bytes.
    Write a method to rotate the image 90 degrees in place.

 */

import java.util.*;

public class Q1_7 {

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

    public static void createMatrix(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int)Math.round(Math.random() * 8) + 1;
            }
        }
    }

    public static void transpose(int matrix[][]) {

        // this is the transpose operation
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < i; j++) {

                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        // this is reflection on y-axis.
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length / 2; j++) {

                int t = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = t;
            }
        }

        displayMatrix(matrix);
    }

    public static void main(String []r) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of matrix to be rotated");
        int matrixSize = s.nextInt();
        //create matrix size of user input
        int matrix[][] = new int [matrixSize][matrixSize];

        createMatrix(matrix);
        displayMatrix(matrix);
        transpose(matrix);

        s.close();

    }
}