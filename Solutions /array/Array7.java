public class Array7 {
    public static void main(String[] args) {
        int [] nums={1,1,1,1};
        int n=0;
        for(int i=0; i <nums.length;i++){
            for(int j=0; j<nums.length;j++){
                if(nums[i] == nums[j] && i<j){
                    n++;
                }
            }
        }
        System.out.println(n);

    }
}
