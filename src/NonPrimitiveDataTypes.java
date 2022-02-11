public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        Integer IniInteger = 100;
        Long iniLong = 10000L;
        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        // Convert from primitive to non primitive
        int age = 100;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();
        long longAge = ageObject.longValue();

        Long amount = 1_000_000L;
        int intAmount = amount.intValue();
    }
}
