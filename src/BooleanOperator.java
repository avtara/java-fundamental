public class BooleanOperator {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue && isTrue);
        System.out.println(isTrue && isFalse);
        System.out.println(isFalse && isTrue);
        System.out.println(isFalse && isFalse);

        System.out.println(isTrue || isTrue);
        System.out.println(isTrue || isFalse);
        System.out.println(isFalse || isTrue);
        System.out.println(isFalse || isFalse);

        System.out.println(!isTrue);
        System.out.println(!isFalse);
    }
}
