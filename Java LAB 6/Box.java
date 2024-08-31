import java.util.*;
import java.util.Scanner;
import java.io.*;
public class Box{
    int length;
    int width;
    int height;
    Scanner sc=new Scanner(System.in);
    public void volume(int l,int w,int h){
System.out.println("Volume is:"+l*w*h);

    }

    public static void main(String[] args){
        
        Box obj=new Box();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimensions of the box: ");
        int len=sc.nextInt();
        int bre=sc.nextInt();
        int he=sc.nextInt();
        obj.volume(len,bre,he);



}
}