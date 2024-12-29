package OOPS;

public class tooglestring {
    public static void main(String[] args){
        String str="HSgy_$hgh";
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(ch>='a'&& ch<='z'){
            ans.append(Character.toUpperCase(ch));

        }
      else  if(ch>='A'&& ch<='Z'){
            ans.append(Character.toLowerCase(ch));

        }
        else{
ans.append(ch);
        }
        
    }
    System.out.println("the toggle string is:"+ans);

    
    
}
}
