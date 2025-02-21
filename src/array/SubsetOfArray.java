package array;
import java.util.Scanner;
public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        int limit=(int)Math.pow(2,arr.length);
        for(int i=0;i<limit;i++){
            int temp=i;
            String subset="";
            for(int j=arr.length-1;j>=0;j--){
                int rem=temp%2;
                temp=temp/2;
                if(rem==0){
                    subset="-\t"+subset;
                }else{
                    subset=arr[j]+"\t"+subset;
                }
            }
            System.out.println(subset);
        }

    }
}
