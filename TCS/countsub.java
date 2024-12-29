public class countsub {
    public static int numSubseq(int ind,int s,int[] nums, int target,int n) {
        
        
        if(ind==n)
    {
        if(s==target)
        
            return 1;
        
        else
        return 0;
    }
    s+=nums[ind];
    int l=numSubseq(ind+1,s,nums,target,n);
     s-=nums[ind];
    int r=numSubseq(ind+1,s,nums,target,n);
return l+r;
}
public static void main(String[] args){
    int n=3;
    int nums[]={1,2,1};
int target=5;
System.out.println(numSubseq(0,0,nums,target,n));

}
}
   
