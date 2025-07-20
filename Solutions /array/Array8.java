public class Array8 {
    public static void main(String[] args) {
        int [] nums={8,1,2,2,3};
        int [] ans = new int[nums.length];
        int n;
        for(int i=0; i <nums.length;i++){
             n=0;
            for(int j=0; j<nums.length;j++){
                int max=nums[i];
                if(max>nums[j]){
                    n++;
                }
            }
            ans[i]=n;
        }
          for(int i=0 ;i<ans.length;i++){
        System.out.println(ans[i]);
    
        }

    }
}
