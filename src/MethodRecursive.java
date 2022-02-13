public class MethodRecursive {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(4));
    }

    static int factorialRecursive(int value){
        if (value == 1){
            return 1;
        }else {
            return value * factorialRecursive(value - 1);
        }
    }
}
