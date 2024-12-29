import java.util.*;

public class Sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            } else if (arr[i] == 1) {
                ones++;
            } else if (arr[i] == 2) {
                twos++;
            } else if (arr[i] == 3) {
                threes++;
            }
        }
        
        int i = 0;
        
        while (zeros > 0) {
            arr[i++] = 0;
            zeros--;
        }
        
        while (ones > 0) {
            arr[i++] = 1;
            ones--;
        }
        
        while (twos > 0) {
            arr[i++] = 2;
            twos--;
        }
        
        while (threes > 0) {
            arr[i++] = 3;
            threes--;
        }

        System.out.println("Sorted array:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
