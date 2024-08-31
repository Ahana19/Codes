package LAB10.Marketing;
import LAB10.General.*;

public class sales extends employee {
    public sales(int empid, String ename, double basic) {
        super(empid, ename, basic);
    }

    public double tallowance() {
        double totalEarnings = earnings();
        double tallowance = 0.05 * totalEarnings;
        return tallowance;
    }
}