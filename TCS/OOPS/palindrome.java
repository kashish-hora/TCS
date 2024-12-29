package OOPS;

public class palindrome {
    public static void main(String[] args){
        String s1="Hello";
        String s=s1.toLowerCase();
        boolean result=true;
       int left=0;
       int right=s.length()-1;
       while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
        result=false;
       
        break;
       }
       left++;
       right--;

      
    }
    
    System.out.println(result);
    
    
}
}
