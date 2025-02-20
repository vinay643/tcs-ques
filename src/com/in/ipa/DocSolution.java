package com.in.ipa;
import java.util.*;

public class DocSolution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Document[] dc=new Document[4];
        for(int i=0;i<dc.length;i++){
            int a=sc.nextInt();
//            sc.nextLine();
            String b=sc.next();
            String c=sc.next();
//            sc.nextLine();
            int d=sc.nextInt();
            dc[i]=new Document(a,b,c,d);
        }
        Document[] d1=sortById(docWithoddPage(dc));

        for(int i=0;i<d1.length;i++){
            if(d1[i]!=null){
                System.out.println(d1[i].getId()+" "+d1[i].getFolderName()+" "+d1[i].getTitle()+" "+d1[i].getPages());
            }
        }

    }
    //for sorting
    public static Document[] sortById(Document[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]==null||arr[j+1]==null){
                    break;
                }
                if(arr[j].getId()>arr[j+1].getId()){

                    Document temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;



    }
    public static  Document[] docWithoddPage(Document[] doc){
        Document[] drr=new Document[4];
        int j=0;
        for(int i=0;i<doc.length;i++){

            if(doc[i].getPages()%2==1){
                drr[j]=doc[i];
                j++;

            }
        }
        return drr;


    }
}
class Document{
    private int id;
   private String title;
    private String folderName;
    private int pages;
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getFolderName(){
       return  this.folderName;
    }
    public int getPages(){
        return this.pages;
    }
    Document(int id,String title,String folderName,int pages){
        this.id=id;
        this.title=title;
        this.folderName=folderName;
        this.pages=pages;
    }



}
