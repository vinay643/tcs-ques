package com.in.ipa;
import java.util.Scanner;

public class ShirtDisPrice {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shirt[] shr=new Shirt[5];
        for(int i=0;i<shr.length;i++){
            int a=sc.nextInt();
            String b=sc.next();
            double c=sc.nextDouble();
            char d=sc.next().charAt(0);
            shr[i]=new Shirt(a,b,c,d);
        }
        double pr=sc.nextDouble();
        for(int i=0;i<shr.length;i++){
            System.out.println(getDisc(shr[i]));
        }
        Shirt[] sht=sortByPrice(serchByPrice(shr,pr));
        for(int i=0;i<sht.length;i++){
            if(sht[i]!=null){
                System.out.println(sht[i].getTag()+" "+sht[i].getPrice()+" "+sht[i].getBrand());
            }
        }

    }
    //for discount
    public static double getDisc(Shirt sh){
        if(sh.getGender()=='m'){

            return (sh.getPrice()-((sh.getPrice()*10)/100));
        }
        else if(sh.getGender()=='f'){
            return  (sh.getPrice()-((sh.getPrice()*20)/100));
        } else  {
            return (sh.getPrice()-((sh.getPrice()*30)/100));

        }


    }

    //for searching based on price
    public static Shirt[] serchByPrice(Shirt[] shr,double price){
        Shirt[] sh=new Shirt[5];
        int j=0;
        for(int i=0;i<shr.length;i++){
            if(shr[i].getPrice()>price){
                sh[j]=shr[i];
                j++;
            }
        }
        return sh;
    }
    //for shorting
    public static Shirt[] sortByPrice(Shirt[] shr){
        for(int i=0;i<shr.length-1;i++){
            for(int j=0;j<shr.length-i-1;j++){
                if(shr[j]==null||shr[j+1]==null){
                    break;
                }
                if(shr[j].getPrice()>shr[j+1].getPrice()){
                    Shirt temp=shr[j];
                    shr[j]=shr[j+1];
                    shr[j+1]=temp;
                }

            }
        }
        return shr;

    }
}

class Shirt{
    private int tag;
    private String brand;
    private double price;
    private char gender;

    public int getTag(){
        return this.tag;
    }
    public String getBrand(){
        return this.brand;
    }
    public double getPrice(){
        return this.price;

    }
    public char getGender(){
        return this.gender;
    }
    Shirt(int tag,String brand,double price,char gender){
        this.tag=tag;
        this.brand=brand;
        this.price=price;
        this.gender=gender;
    }

}
