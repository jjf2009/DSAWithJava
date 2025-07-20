public class Array4 {
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {3, 2, 1}
        };

        int max = 0;

        for (int[] row : nums) {
            int sum = 0;
            for (int val : row) {
                sum += val;
            }
            max = Math.max(max, sum);
        }

        System.out.println("Maximum row sum = " + max);
    }
}
