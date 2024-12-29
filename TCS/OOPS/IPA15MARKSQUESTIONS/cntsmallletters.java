package OOPS.IPA15MARKSQUESTIONS;

import java.util.Scanner;


public class cntsmallletters {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String input=sc.nextLine();
        int cnt=0;
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);

            if(ch>='a' && ch<='z'){
                cnt++;
            }
        }

        System.out.println(cnt);

    
}
}
