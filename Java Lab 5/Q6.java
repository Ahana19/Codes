import java.util.*;

public class Q6 {
    static int noOfObjects = 0;
    {
        noOfObjects += 1;
    }

    public Q6() {
    }

    public Q6(int n) {
    }

    public Q6(String s) {
    }

    public static void main(String args[]) {
        Q6 t1 = new Q6();
        System.out.println(Q6.noOfObjects);
        Q6 t2 = new Q6(21051113);
        System.out.println(Q6.noOfObjects);
        Q6 t3 = new Q6("Ahana Basu");
        System.out.println(Q6.noOfObjects);
    }
}
