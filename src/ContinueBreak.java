public class ContinueBreak {
    public static void main(String[] args) {
        var counter = 0;
        while (true){
            System.out.println(counter);
            counter++;

            if (counter > 10) break;
        }

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0) continue;

            System.out.println("odd = " + i);
        }

    }
}
