package OOPS.IPA15MARKSQUESTIONS;

public class checkarrissubsetofother {
    public static void main(String [] args){

        int arr1[]={1,2,3,5,6,7,10,11,20};
        int arr2[]={1,2,6,3,5,6,7,9};

        int m=arr1.length;
        int n=arr2.length;

        boolean ans=issubset(arr1,m,arr2,n);
        System.out.println(ans);

    }
        static boolean issubset(int arr1[],int m,int arr2[],int n){
        if(m>n){
            return false;
        }
        for(int i=0;i<m;i++){
            boolean present=false;
            for(int j=0;j<n;j++){
                if(arr2[j]==arr1[i]){
                    present=true;
                    break;
                }
            }
            if(present==false){
                return false;
            }

        }
        return true;
    }
    
}
