
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your Number:");
        num = in.nextInt();

        System.out.println("Table of "+num);
        for(int i =1 ; i <=10;i++){
        System.out.printf("%d x %d = %d \n",num,i,num*i);
        }
    }
    
}
