public class Array3 {
    
        public static void main(String[] args) {
        int [] nums= {1,2,3,4};
        int [] ans= new int[nums.length];
        int sum=0;


        for( int i=0 ; i<nums.length;i++){
            for(int j=0;j<=i;j++){
                 sum=sum+nums[j];
            }
            ans[i]=sum;
            sum=0;
        }

        for(int i=0 ;i<ans.length;i++){
        System.out.print(ans[i]);
    
        }

    }
}

