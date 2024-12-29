public class Divsibleby4 {
    public static  int checkdv(String n){
        int size=n.length();
        if(size==0){
            return 0;
        }
        if(size==1){
            int number=Integer.parseInt(n);
            if(number%4==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        StringBuilder temp = new StringBuilder();
        temp.append(n.charAt(size - 1));
        temp.append(n.charAt(size - 2));

        int number=Integer.parseInt(temp.toString());
        if(number%4==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        String n="14567643298124";
        int result=checkdv(n);
        System.out.println(result);


    }




       


    }
    

