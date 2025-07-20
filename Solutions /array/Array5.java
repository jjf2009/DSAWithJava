public class Array5 {
       public static void main(String[] args) {
        int [] nums= {2,5,1,3,4,7};
        int n  = nums.length/2;
        int [] ans= new int[nums.length];
        for( int i=0 ;i<nums.length;i++){
            ans[i] = i % 2 == 0 ? nums[i / 2] : nums[n + (i / 2)];
        }
        
        for(int i=0 ;i<ans.length;i++){
        System.out.print(ans[i]);
    
        }

    }
}
