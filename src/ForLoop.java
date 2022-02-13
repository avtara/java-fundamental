public class ForLoop {
    public static void main(String[] args) {
        // Forever Loop
        //  for(;;){
        //      System.out.println("Forever Loop!");
        //  }

        var counter = 1;
        for (;counter <= 10;){
            System.out.println(counter);
            counter++;
        }

        for (int i = 0;i <= 10;){
            System.out.println(i);
            i++;
        }

        for (int j = 0;j <= 10;j++){
            System.out.println(j);
        }
    }
}
