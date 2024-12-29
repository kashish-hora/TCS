package OOPS;

import java.util.HashMap;
import java.util.Scanner;

public class cntofnonrepeatingnumbers {

     public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter array elements:");

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int sum=0;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
    }
    for(int key:map.keySet()){
        if(map.get(key)==1){
            sum=sum+key;
        }
    }
    System.out.println(sum);
}
}
