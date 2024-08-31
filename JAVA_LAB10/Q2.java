import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        try{
            if(n<10 ||n>50){
                throw new Exception("Out of range");


            }
            else{
                int square =n*n;
                System.out.println("Square of the number:" + square);
            }
        }catch(Exception e){
            System.out.println("An exception is caught" +e.getMessage());
        }

    }
}