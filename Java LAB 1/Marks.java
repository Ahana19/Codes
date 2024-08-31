import java.util.Scanner;

public class Marks{
    public static void main(String[] args){
        System.out.print("Enter the marks of chemistry:");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        char grade;
        if(m>=90){
            grade='A';
        }
        else if(m>=80 && m<90){
            grade='B';
        }
        else if(m>=70 && m<80){
            grade='C';
        }
        else if(m>=60 && m<70){
            grade='D';
        }
        else if(m>=50 && m<60){
            grade='E';
        }
        else if(m>=40 && m<50){
            grade='F';
        }
        else{
            grade='f';
        }
        System.out.print("Grade:"+grade);
    }
}