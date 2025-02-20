package array;
import java.util.Scanner;
public class SubArray {

    static void subArr(char[] chr,int len){
        for(int i=0;i<chr.length;i++){
            for(int j=i;j<chr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(chr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        char[] ch=new char[len];
        for(int i=0;i<ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }

        subArr(ch,len);
    }
}
