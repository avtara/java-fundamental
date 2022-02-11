public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[2];

        arrayString[0] = "Avtara";
        arrayString[1] = "Khrisna";

        // Array Initializer
        int[] arrayInt = new int[]{
                10,20,30
        };

        long[] arrayLong = {
                19, 20, 90, 20000
        };

        // Operation
        arrayInt[2] = 69;                       // re-assign
        System.out.println(arrayInt.length);    // get length of array
        System.out.println(arrayInt[2]);        // get value index-2 of array

        // array 2D
        String[][] members = {
                {"avtara", "khrisna"},
                {"joko"}
        };

        System.out.println(members[0][1]);
        System.out.println(members.length);
        System.out.println(members[1].length);
    }
}
