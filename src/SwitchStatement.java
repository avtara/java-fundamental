public class SwitchStatement {
    public static void main(String[] args) {
        String grade = "A";
        switch (grade){
            case "A":
                System.out.println("Wow, great job");
                break;
            case "B":
                System.out.println("Good job");
            default:
                System.out.println("dont worries, mark got drop out from universities");
        }

        // Lambda expresion
        switch (grade){
            case "A" -> System.out.println("Wow, great job"); // single line
            case "B" -> System.out.println("Good job");
            default -> { // Multiple line
                System.out.println("dont worries, mark got drop out from universities");
            }
        }

        // Yield
        String res = switch (grade){
            case "A" : yield "Wow, great job"; // single line
            case "B" : yield "Good job";
            default : yield "dont worries, mark got drop out from universities";
        };

        System.out.println(res);

    }
}
