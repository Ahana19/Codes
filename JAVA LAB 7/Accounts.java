class Account {
    protected int acc_no;
    protected double balance;
    
    public Account(int acc_no, double balance) {
        this.acc_no = acc_no;
        this.balance = balance;
    }
    
    public void disp() {
        System.out.println("Account number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;
    
    public Person(int acc_no, double balance, String name, String aadhar_no) {
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }
    
    @Override
    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar number: " + aadhar_no);
        super.disp();
    }
}

public class Accounts
 {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person(1001, 5000.0, "John Doe", "1234 5678 9012");
        persons[1] = new Person(1002, 7000.0, "Jane Doe", "3456 7890 1234");
        persons[2] = new Person(1003, 10000.0, "Bob Smith", "5678 9012 3456");
        persons[3] = new Person(1004, 15000.0, "Alice Jones", "7890 1234 5678");
        persons[4] = new Person(1005, 20000.0, "Tom Brown", "9012 3456 7890");
        
        for (Person person : persons) {
            person.disp();
            System.out.println();
        }
    }
}
