import java.util.Scanner;

public class Insertionsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //Insertion sort
        for(int i=1;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
        
        arr[j+1]=current;
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
     }
    
}
}
