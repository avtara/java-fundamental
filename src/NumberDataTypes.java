public class NumberDataTypes {
    public static void main(String[] args) {
        // Integer Number
        byte iniByte = 127;         // -128 to 127; 1 byte; default 0
        short iniShort = 1000;      // -32.768 to 32.767; 2 byte; default 0
        int iniInt = 100000;        // -2.147.483.648 to 2.147.483.647; 4 byte; default 0
        long iniLong = 100000000;   // -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807; 8 byte; default 0
        long iniLong2 = 100000000L;  // -9.223.372.036.854.775.808 to 9.223.372.036.854.775.807; 8 byte; default 0

        // Floating Number
        float iniFloat = 2.2f;      // 4 bytes; default 0.0; need F/f keyword
        double iniDouble = 2.2;     // 8 bytes; default 0.0

        // Literals
        int decimalInt = 34;    // Decimal
        int hexInt = 0xAAB23F;  // Hexadecimal
        int binInt = 0b1010101; // Binary

        // Underscore - to separate groups of digits in numeric literals
        long balance = 1_000_000_200L;
        int amount = 1_000_000;
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        float pi = 	3.14_15F;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;
    }
}
