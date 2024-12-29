package OOPS;

import java.util.Scanner;

public class sumofpostiventegers {

    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    int cnt=0;
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            sum=sum+arr[i];
            cnt++;
        }
    }
    if(cnt>0){
        double avg=(double) sum/cnt;
        System.out.println("Average of numbers is:"+avg);
    }
    else{
        System.out.println("No positive numbers are present");
    }

    
}
}
