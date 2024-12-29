public class maximumrepeatingcharacter {
   public  static char maxcons(String str){
        int n=str.length();
        char c=str.charAt(0);
        int maxcount=0;
        int count=1;
        for(int i=1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;

            }
            else{
                if(count>maxcount){
                    maxcount=count;
                    c=str.charAt(i-1);
                }
            }
            count=1;
        }
        if(count>maxcount){
            maxcount=count;
            c=str.charAt(n-1);
        }
        return c;

    }
    public static void main(String args[]){
        String str = "aaaabbcbbb";
    System.out.println(maxcons(str)); // output: a
}

    }

    

