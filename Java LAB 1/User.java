import java.util.*;

public class User{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter branch : ");
        String branch=sc.nextLine();
        System.out.print("Enter name : " );
        String name=sc.nextLine();
        System.out.print("Enter roll no : ");
        int rollno=sc.nextInt();
        System.out.print("Enter section : ");
        int sec=sc.nextInt();
        
        System.out.print("Name is : " +name+ "\n");
        System.out.print("Roll no is :" +rollno+"\n");
        System.out.print("Enter section :"+sec+"\n");
        System.out.print("Branch is :"+branch+"\n");


    }
    
}