public class Array9 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] ans = new int[nums.length];

        int size = 0; 
        for (int i = 0; i < nums.length; i++) {
            int insertPos = index[i];
            for (int j = size; j > insertPos; j--) {
                ans[j] = ans[j - 1];
            }
            ans[insertPos] = nums[i];
            size++;
        }
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
