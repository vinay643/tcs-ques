package com.in.ipa;
import java.util.Scanner;


 class Movie{
     private String mn;
     private String com;
     private String gen;
     private int bud;
     public String getmn(){
         return this.mn;
     }
     public String getcom(){
         return this.com;
     }
     public String getgen(){
         return this.gen;
     }
     public int getbud(){
         return this.bud;
     }
     Movie( String mn,String com,String gen,int bud){
         this.mn=mn;
         this.com=com;
         this.gen=gen;
         this.bud=bud;

     }

 }


 class MovieX {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         Movie[] m=new Movie[4];
         for(int i=0;i<m.length;i++){
             String a=sc.nextLine();

             String b=sc.nextLine();
             String c=sc.nextLine();
             int d=sc.nextInt();
             sc.nextLine();
             m[i]=new Movie(a,b,c,d);



         }
         getMbyG(m,"action");


     }

     public static void getMbyG(Movie[] arr,String sch){

         for( int i=0;i<arr.length;i++){

             if(arr[i].getgen().equals(sch)&& arr[i].getbud()>80000000){
                 System.out.println("High Budget Movie");
             }else if(arr[i].getgen().equals(sch)&&arr[i].getbud()<80000000){

                 System.out.println("Low Budget Movie");
             }

         }


     }
}




