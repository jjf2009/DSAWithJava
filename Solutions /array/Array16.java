public class Array16 {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        int num,count=0;

        for(int i : nums){
            num = Integer.toString(i).length();
            if(num%2==0){
                count+=1;
            }
            
        }
        System.out.println(count);

    }
    
}
