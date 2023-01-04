package array_2D;

public class transpose {
    public static void print_matrix(int matrix[][]){
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int rows=3,col=3;
        int matrix[][]={{2,3,4},{5,6,7},{7,8,9}};
        System.out.println("-----------matrix-------------");
        print_matrix(matrix);
        //transpose
        for(int i=0;i< matrix.length;i++){
            for (int j=0;j<i;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("transpose of matrix:");
        print_matrix(matrix);
    }
}
