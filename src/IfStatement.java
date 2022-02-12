public class IfStatement {
    public static void main(String[] args) {
        var nilai = 83;
        var absen = 74;

        if (nilai >= 75 && absen >= 80){
            System.out.println("Graduate!");
        }else if (nilai >= 60 && absen >= 70){
            System.out.println("Remidial!");
        }else {
            System.out.println("Drop out!");
        }
    }
}
