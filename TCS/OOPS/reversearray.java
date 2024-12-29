package OOPS;

public class reversearray {
    public static void main(String[] args){

    
    int[] arr={76,23,41,-56,8,-98};
    for(int i=0;i<=arr.length/2;i++){
        arr[i]=arr[i]+arr[(arr.length-1)-i];//a=a+b
        arr[(arr.length-1)-i]=arr[i]-arr[(arr.length-1)-i];//b=a-b;
        arr[i]=arr[i]-arr[(arr.length-1)-i];

    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }

    
}
}
