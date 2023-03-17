public class Main {
    public static void main(String[] args) {
        byte byteVar = 7;
        int intVar = 13;
        double doubleVar = 2.5;
        float floatVar = 1.3F;

        byte byteVar1 = (byte) intVar;
        int intVar1 = byteVar;
        double doubleVar1 = intVar;
        int intVar2 = (int) floatVar;

        System.out.println(byteVar1);
        System.out.println(intVar1);
        System.out.println(doubleVar1);
        System.out.println(intVar2);
    }
}




