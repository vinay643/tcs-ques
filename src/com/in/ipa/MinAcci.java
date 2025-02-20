package com.in.ipa;

import java.util.Scanner;

public class MinAcci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<st.length();i++){

            int a=st.charAt(i);
            if(a<min){
                min=a;

            }

        }
        System.out.println((char)min);
    }

}
