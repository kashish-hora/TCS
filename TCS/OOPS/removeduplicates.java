
package OOPS;
class removeduplicates{
    public static void main(String[] args){
        String input="hello";
        StringBuilder answer=new StringBuilder("");

        int[] arr=new int[26];
        for(int i=0;i<input.length();i++){

int index=input.charAt(i)-97;
arr[index]+=1;
if(arr[index]==1){
    answer.append(input.charAt(i));
}
        }
        System.out.println(answer);
    }
}