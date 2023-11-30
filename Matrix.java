import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please provide the order 'N' as a corresponding command-line argument");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N <= 0) {
            System.out.println("Order 'N' should be positive");
            return;
        }

        int[][] matrixA = readMatrix("Matrix A", N);
        int[][] matrixB = readMatrix("Matrix B", N);

        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);

        int[][] resultMatrix = addMatrix(matrixA, matrixB);

        System.out.println("Sum of the two matrices:");
        printMatrix(resultMatrix);
    }

    public static int[][] readMatrix(String matrixName, int N) {
        Scanner scanner =  new Scanner(System.in);
        int[][] matrix = new int[N][N];
        System.out.println("Enter the values for " + matrixName + ":");
        for (int i = 0; i < N; i++) {
            System.out.println(matrixName + "[" + i + "]:");
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        int N = matrixA.length;
        int[][] resultMatrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
