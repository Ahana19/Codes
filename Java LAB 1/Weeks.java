import java.util.Scanner;
public class Weeks {
    public static void main(String[] args){
        System.out.print("1.Week 1"+ "\n");
        System.out.print("2.Week 2"+ "\n");
        System.out.print("3.Week 3"+ "\n");
        System.out.print("4.Week 4"+ "\n");
        System.out.print("5.Week 5"+ "\n");
        System.out.print("6.Week 6"+ "\n");
        System.out.print("7.Week 7"+ "\n");
        System.out.print("Enter the week number:");
        Scanner sc=new Scanner(System.in);
        int week=sc.nextInt();
        String w;
        switch(week){
            case 1:
            System.out.print("Monday" + "\n");
            break;
            case 2:
            System.out.print("Tuesday" + "\n");
            break;
            case 3:
            System.out.print("Wednesday"+ "\n");
            break;
            case 4:
            System.out.print("Thursday"+ "\n");
            break;
            case 5:
            System.out.print("Friday"+ "\n");
            break;
            case 6:
            System.out.print("saturday"+"\n");
            break;
            case 7:
            System.out.print("Sunday:"+"\n");
            break;
            default:
            System.out.print("You entered the wrong choice");
        }
    

    }
    
}
