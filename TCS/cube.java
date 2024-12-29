import java.util.*;
public class cube {
    public static void main(String args[]){
        System.out.println("Enter the values");
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        long ans=((high*high)*(high+1)*(high+1)/4)-((low-1)*(low-1)*(low)*(low)/4);
        System.out.println(ans);




    }
    
}
