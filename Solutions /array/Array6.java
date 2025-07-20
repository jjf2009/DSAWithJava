public class Array6 {
    public static void main(String[] args) {
        int [] nums= {2,3,5,1,3};
        int n = 3;
        boolean [] ans= new boolean[nums.length];
        int max=nums[0];
        for( int i=0 ; i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            nums[i]=nums[i]+n;
        }
        for( int i=0 ; i<nums.length;i++){
            ans[i] = max<=nums[i];
        }
        
        for(int i=0 ;i<ans.length;i++){
        System.out.println(ans[i]);
    
        }
    }
}
