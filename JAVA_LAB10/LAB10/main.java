package LAB10;

//import LAB10.General.*;
import LAB10.Marketing.*;
import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int e = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        int basic = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        sales s = new sales(e, name, basic);
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Employee ID: " + s.getEmpid());
        System.out.println("Total Earnings: " + s.earnings());
        System.out.println("Travelling Allowance: " + s.tallowance());


        sc.close();
    }
}