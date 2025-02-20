package com.in.ipa;

import java.util.Scanner;

public class BookTitleSolution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book1[] bk=new Book1[4];
        for(int i=0;i<4;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String b=sc.nextLine();
            String c=sc.nextLine();

            double d=sc.nextDouble();
            sc.nextLine();
            bk[i]=new Book1(a,b,c,d);
        }
        String val=sc.next();
        Book1[] bk1=sortId(serByTitle(bk,val));
        for(int i=0;i<bk1.length;i++){
            if(bk1[i]!=null){
                System.out.println(bk1[i].getId());
            }
        }

    }
    // method for sort by id
    public static Book1[] sortId(Book1[] bk){
        for(int i=0;i<bk.length-1;i++){
            for(int j=0;j<bk.length-i-1;j++){
                if(bk[j]==null || bk[j+1]==null){
                    break;
                }
                assert bk[j] != null;
                if(bk[j].getId()>bk[j+1].getId()){
                    Book1 temp=bk[j];
                    bk[j]=bk[j+1];
                    bk[j+1]=temp;
                }
            }
        }
        return bk;

    }
    //method for search by title
    public static Book1[] serByTitle(Book1[] bk,String value){

        Book1[] bk1=new Book1[4];
        int j=0;
        for(int i=0;i<bk.length;i++){
            if(((bk[i].getTitle()).toLowerCase().contains(""+value.toLowerCase()))){
                bk1[j]=bk[i];
                j++;

            }
        }
        return bk1;
    }
}

class Book1{
    private int id;
    private String title;
    private String author;
    private double price;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book1(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
