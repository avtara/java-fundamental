public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("avtara");
    }

    static void sayHello(){
        System.out.println("Hello World");
    }
    static void sayHello(String name){
        System.out.println("Hello World " + name);
    }
}
