public class MethodParameterArgument {
    public static void main(String[] args) {
        int []values = {80,90};
        sayCongrats("avtara", values);
        congrats("avtara", values);
        congrats("avtara", 90, 80);
    }

    static void sayCongrats(String name, int[] values){
        int sum = 0;
        for (var value:
             values) {
            sum += value;
        }

        System.out.println("Total value " + name + " = " + sum);
    }

    static void congrats(String name, int... values){
        int sum = 0;
        for (var value:
                values) {
            sum += value;
        }

        System.out.println("Total value " + name + " = " + sum);
    }
}
