import java.util.*;
class Number
{
    int num1, num2, num3;
    Scanner sc = new Scanner(System.in);

    void inputnum(){
        try{
            System.out.println("\nEnter three integer numbers : ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            num3 = sc.nextInt();
        }

        catch(InputMismatchException e){
            System.out.println("\nEnter valid integers !");
            System.exit(0);
        }
    }

    void checking(){
        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Greatest integer is : " + max);
    }
}

class Q1
{
    public static void main(String[] args)
    {
        Number ob = new Number();
        ob.inputnum();
        ob.checking();
    }
}