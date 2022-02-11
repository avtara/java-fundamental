public class Variable {
    public static void main(String[] args) {
        String name; // Default value is null
        name = "Avtara"; // assign value variable

        int age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Khrisna"; // re-assign value variable
        System.out.println(name);

        // var - Type inference is used in var keyword in which it detects automatically the datatype
        // of a variable based on the surrounding context
        var firstName = "avtara";
        var lastName = "khrisna";

        // var company; ERROR: cannot use 'var' on variable without initializer

        // Final - The final keyword in java is used to restrict the user, cant re-assign / constant
        final double PHI = 3.14;
    }
}
