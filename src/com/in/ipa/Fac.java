package com.in.ipa;
import java.util.*;
public class Fac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        System.out.println(fac(a));
        System.out.println(fac(b));
        System.out.println(fac(c));
        System.out.println(fac(d));
        System.out.println(fac(e));

    }

    static int fac(int num){
        if(num==0){
            return 1;
        }
        if(num<0){
            return -1;
        }

        return num*fac(num-1);
    }

}
