package OOPS.IPA15MARKSQUESTIONS;
import java.util.*;

public class findindexofelement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String input=sc.nextLine();
        char ch=sc.next().charAt(0);
        for(int i=0;i<input.length();i++){
           

            if(input.charAt(i)==ch){
                System.out.println("the position of element is:"+i);
                break;
            }

        }

    }
    
}
