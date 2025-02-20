package com.in.ipa;
import java.util.Scanner;
public class SortBookSolution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book[] br=new Book[4];
        for(int i=0;i<br.length;i++){
            int a=sc.nextInt();
            String b=sc.next();
            String c=sc.next();
            double d=sc.nextDouble();

            br[i]=new Book(a,b,c,d);
        }
        br=sortByPrice(br);

        for(int i=0;i<br.length;i++){

            System.out.println(br[i].getId());
            System.out.println(br[i].getTitle());
            System.out.println(br[i].getAuthor());
            System.out.println(br[i].getPrice());
            System.out.println();
        }

    }
    public static Book[] sortByPrice(Book[] bk){
        for(int i=0;i<bk.length-1;i++){
            for(int j=0;j<bk.length-i-1;j++){
                if(bk[j].getPrice()>bk[j+1].getPrice()){
                    Book temp=bk[j];
                    bk[j]=bk[j+1];
                    bk[j+1]=temp;
                }
            }
        }
        return bk;
    }
}

class Book{
    private int id;
    private String title;
    private String author;
    private double price;
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    Book(int id,String title,String author,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
}
