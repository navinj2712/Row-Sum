import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int row = scanner.nextInt();
        System.out.println("Enter the no. of column : ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[] output = findRowSum(matrix);
        System.out.println("Output : ");
        for (int i = 0; i < output.length; i++){
            System.out.print(output[i] + " ");
        }
    }

    private static int[] findRowSum(int[][] matrix) {
        int[] output = new int[matrix.length];
        int sum;
        for (int i = 0; i < matrix.length; i++){
            sum = 0;
            for (int j = 0; j < matrix[0].length; j++){
                sum += matrix[i][j];
            }
            output[i] = sum;
        }
        return output;
    }
}
