package array;
import java.util.Arrays;
import java.util.Scanner;
public class InverseOfArray {


    static int[] inversOfArray(int arr[],int len){
      int arr1[]=new int[len];
      for(int i=0;i<arr.length;i++){
          int val=arr[i];
          arr1[val]=i;
      }
      return arr1;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(inversOfArray(arr,len)));
    }
}
