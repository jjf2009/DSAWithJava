import java.util.ArrayList;
public class Array12 {
    public static void main(String[] args) {
          ArrayList<Integer> ans = new ArrayList<>();
          int [] gain={-5,1,5,0,-7};
          int sum=0;
          int max=0;

          for(int i:gain){
            ans.add(sum);
            sum+=i;
          }
          ans.add(sum);
           for(Integer i:ans){
            if(max<i){
              max=i;
            }
          }
          System.out.println(max);
    }
}
