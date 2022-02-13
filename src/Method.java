public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sum(2,3);
        System.out.println(calculate(1, "+",2));;
    }

    static void sayHelloWorld(){
        System.out.println("Hello world");
    }

    static void sum(int a, int b){
        System.out.println(a + b);
    }

    static int calculate(int a, String expression , int b) {
        switch (expression){
            case "+" -> {
                return a + b;
            }default -> {
                return 0;
            }
        }
    };
}
