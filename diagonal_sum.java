package array_2D;

import java.util.Scanner;

public class diagonal_sum {
        public static int diagonalSum(int matrix[][]){
            int sum=0;
            for (int i=0;i< matrix.length;i++){
                sum+=matrix[i][i];
                if (i!= matrix.length-1-i){                          //T.C.=O(n)
                    sum+=matrix[i][matrix.length-1-i];
                }
            }
            return sum;
        }
        public static void main(String[] args) {
            int matrix[][] = new int[4][4];
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

            int d=diagonalSum(matrix);
            System.out.println(d);
        }
    }

