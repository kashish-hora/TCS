package OOPS.IPA15MARKSQUESTIONS;
import java.util.*;

public class Binarysearch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of values:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("enter number to find:");
        int k=sc.nextInt();
        int ans=-1;

        int left=0;
        int right=n-1;
        int mid=(left+right)/2;
        while(left<right){
            if(arr[mid]==k){
                ans=mid;
                break;
            }
            else if(arr[mid]>k){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        System.out.println("element found at:"+ans);



    }
    
}
