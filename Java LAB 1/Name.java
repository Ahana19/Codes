import java.util.Scanner;
public class Name{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name:");
        String fname=sc.nextLine();
        System.out.print("Enter last name:");
        String lname=sc.nextLine();
        System.out.print(lname + " " + fname);
    }

}