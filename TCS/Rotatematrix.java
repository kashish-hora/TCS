
import java.util.*;
public class Rotatematrix {
    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        int[][] b=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

            arr[i][j]=sc.nextInt();
        }

    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

        b[i][j]=arr[j][i];
    }

    
}
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){

System.out.print(b[i][j]);
      
    }
    System.out.println();

}

for(int i=0;i<n;i++){
    for(int j=n-1;j>=0;j--){
System.out.print(b[i][j]);
    }
    System.out.println();

}
    }
}
    


