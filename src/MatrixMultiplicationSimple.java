public class MatrixMultiplicationSimple {
    public static void main(String[] args) {

        int[][] matrixA = {
                {1, 7, 3},
                {4, 5, 9}
        };

        int[][] matrixB = {
                {7, 8},
                {4, 10},
                {1, 2}
        };


        if (matrixA[0].length != matrixB.length) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }


        int[][] result = new int[matrixA.length][matrixB[0].length];


        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }


        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        System.out.println("\nResult (A × B):");
        printMatrix(result);
    }


    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
