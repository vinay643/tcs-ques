

import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int a=sc.nextInt();

        int res=0;
        for(int i=2;i<a;i++){
            if(a%i==0){
                res++;
            }
        }

        if(res==0&&(a>1)){
            System.out.println(a+" is a prime number");
        }else{
            System.out.println(a+" it is not prime number");
        }
    }
}
