package com.in.ipa;

import java.util.*;


public class Cordinate {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double x3=sc.nextDouble();
        double y3=sc.nextDouble();
        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);
        Point p3=new Point(x3,y3);

        Point pd=larDis(p1,p2,p3);
        System.out.println(pd.getX());
        System.out.println(pd.getY());


    }
    public static Point larDis(Point p1,Point p2,Point p3){
        double dis=0.0;
        Point p=null;
        double d1=Math.sqrt(Math.pow(p1.getX(),2)+Math.pow(p1.getY(),2));
        double d2=Math.sqrt(Math.pow(p2.getX(),2)+Math.pow(p2.getY(),2));
        double d3=Math.sqrt(Math.pow(p3.getX(),2)+Math.pow(p3.getY(),2));

        if(d1>d2&&d1>d3){
            p=p1;
        }else if(d2>d1&&d2>d3){
            p=p2;
        }else if(d3>d1&&d3>d2){
            p=p3;
        }

        return p;


    }
}

class Point{
    private double x;
    private double y;
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    Point(double x,double y){
        this.x=x;
        this.y=y;

    }
}
