public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            // Primary diagonal
            sum += mat[i][i];
            // Secondary diagonal
            sum += mat[i][n - i - 1];
        }

        // If n is odd, subtract the center element once (as it was added twice)
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {
        MatrixDiagonalSum mds = new MatrixDiagonalSum();
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(mds.diagonalSum(mat)); // Output: 25
    }
}

    

