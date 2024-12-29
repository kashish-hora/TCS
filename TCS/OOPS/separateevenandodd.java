package OOPS;

import java.util.Scanner;

public class separateevenandodd {

     public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int j=0;
    for(int i=0;i<n;i++){
        
        

        if(arr[i] %2 == 0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            
            
        }

    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");



    
}
    
}
}
