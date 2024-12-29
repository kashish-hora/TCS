import java.util.*;
public class validstring{
    public static void main(String args[]){
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int cs=0;
        int ch=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='*'){
                cs++;

            }
            else{
                ch++;
            }

        }
        System.out.println(Math.abs(cs-ch));
    }
}