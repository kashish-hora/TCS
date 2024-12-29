import java.util.Scanner;

public class sumoffib {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ft=0;
        int st=1;
        if(n==1){
            System.out.println(ft);
            return;
        }
        if(n==2){
            System.out.println(st);
            return;
        }
        int sum=ft+st;
        for(int term=3;term<=n;term++){
            int nextterm=ft+st;
            sum+=nextterm;

            ft=st;
            st=nextterm;
        }
        System.out.println(sum);
    
}
}
