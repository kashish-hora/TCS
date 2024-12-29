package OOPS.IPA15MARKSQUESTIONS;

import java.util.Scanner;

public class equlibirumpoint {

    public static void main(String[] args){

         Scanner sc=new Scanner(System.in);
        System.out.println("enter number of values:");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
        }
      int ans=  equilibirium(nums,n);
      System.out.println(ans);

    }
        public static int  equilibirium(int nums[],int n){
            int totalsum=0;
            for(int i=0;i<n;i++){
totalsum+=nums[i];

            }
            int leftsum=0;
            int rightsum=totalsum;
            for(int i=0;i<n;i++){
                rightsum-=nums[i];

                if(leftsum==rightsum){
                    return i;
                }
                leftsum+=nums[i];
            }
            return -1;

            
        }
    }
    

