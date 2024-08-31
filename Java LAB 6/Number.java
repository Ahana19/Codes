public class Number {
    int no;

    Number(int no) {
        this.no = no;
    }


        public static void swap(Number n1, Number n2) {
            int temp = n1.no;
            n1.no = n2.no;
            n2.no = temp;
        }

        public static void main(String[] args) {
            Number n1 = new Number(1);
            Number n2 = new Number(2);
            swap(n1, n2);
            System.out.println("n1.no=" + n1.no);
            System.out.println("n2.no=" + n2.no);

        }
    }

