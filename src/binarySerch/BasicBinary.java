package binarySerch;
import java.util.Scanner;
public class BasicBinary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] arr={10,20,30,40,50,60,70,80};
        int len=arr.length;
        int low=0;
        int high=len-1;
        int data=10;
        while(low<=high){
            int mid=(low+high)/2;
            if(data>arr[mid]){
                low=mid+1;

            }else if(data<arr[mid]){
                high=mid-1;
            }else{
                System.out.println(data+"---> found at index-->"+mid);
                return;
            }
        }
        System.out.println("not found");
    }
}
