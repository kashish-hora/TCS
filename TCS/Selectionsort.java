import java.util.Scanner;
//time complexity-o(n*2)
//one swap in one interation,fixing the smallest element at first position
public class Selectionsort {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n-1;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
         }
}

}
