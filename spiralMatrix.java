package array_2D;

import java.util.Scanner;

public class spiralMatrix {
        private static void spiral(int matrix[][]){
            int startRow = 0;
            int endRow = matrix.length - 1;
            int startCol = 0;
            int endCol = matrix[0].length - 1;
            while (startRow <= endRow && startCol <= endCol) {
                //top
                for (int j = startCol; j <= endCol; j++) {
                    System.out.print(matrix[startRow][j] + " ");
                }
                //right
                for (int i = startRow + 1; i <= endRow; i++) {

                    System.out.print(matrix[i][endCol] + " ");
                }
                //bottom
                for (int j = endCol - 1; j >= startCol; j--) {
                    if (startRow == endRow)
                        break;
                    System.out.print(matrix[endRow][j] + " ");
                }
                //left
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    if (startCol == endCol)
                        break;
                    System.out.print(matrix[i][startCol] + " ");
                }
                startRow++;
                startCol++;
                endRow--;
                endCol--;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int m = matrix.length;
        int n = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        spiral(matrix);
    }
}
