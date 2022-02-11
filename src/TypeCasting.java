public class TypeCasting {
    public static void main(String[] args) {
            // Widening Casting (automatically) - converting a smaller type to a larger type size
            // byte -> short -> char -> int -> long -> float -> double

            byte iniByte = 10;
            short iniShort = iniByte;
            int iniInt = iniShort;
            long iniLong = iniInt;
            float iniFloat = iniLong;
            double iniDouble = iniFloat;

            // Narrowing Casting (manually) - converting a larger type to a smaller size type
            // double -> float -> long -> int -> char -> short -> byte
            float iniFloat2 = (float) iniDouble;
            long iniLong2 = (long) iniFloat2;
            int iniInt2 = (int) iniLong2;
            short iniShort2 = (short) iniInt2;
            byte iniByte2 = (byte) iniShort2;
    }
}
