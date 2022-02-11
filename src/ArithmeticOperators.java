public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Augmented Assignments
        int c = 1000;

        c += 100;               // equal c = c + 100
        System.out.println(c);
        c -= 100;               // equal c = c - 100
        System.out.println(c);
        c *= 100;               // equal c = c * 100
        System.out.println(c);
        c /= 100;               // equal c = c / 100
        System.out.println(c);
        c %= 100;               // equal c = c % 100
        System.out.println(c);

        // Unary Operator
        int d = +100;           // positive value
        int e = -10;            // negative value

        d++;
        System.out.println(d);  // equal d = d + 1
        e--;
        System.out.println(e);  // equal e = e - 1
    }
}
