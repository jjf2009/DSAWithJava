import java.util.Arrays;
import java.util.Collections;

public class Array13 {
public static void main(String[] args) {
      int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
    for (int[] row : image) {
    int left = 0, right = row.length - 1;
    while (left <= right) {
        int tempLeft = row[left] ^ 1;
        int tempRight = row[right] ^ 1;
        row[left] = tempRight;
        row[right] = tempLeft;
        left++;
        right--;
    }
}
    
}
}
