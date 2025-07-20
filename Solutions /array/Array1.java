
import java.util.Scanner;



public class Array1 {
    public static void main(String[] args) {
       int [] nums= new int[6];
        int [] ans= new int[6];
       Scanner in = new Scanner(System.in);

        for(int i=0 ;i<nums.length;i++){
        System.out.print("Enter the element of the array:");
            nums[i]=in.nextInt();
        }

        in.close();
        for( int i=0 ; i<nums.length;i++){
            ans[i]=nums[nums[i]];
        }
        
        for(int i=0 ;i<ans.length;i++){
        System.out.print(ans[i]);
    
        }

    }
}
