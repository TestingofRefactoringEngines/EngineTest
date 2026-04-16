class IntegerExample {
    public static void main(String[] args) {
        boolean flag = true;
        Integer iii = flag ? 1 : 2;
        byte byteValue = iii.byteValue();
        System.out.println("The byte value is: " + byteValue);
    }

    public static byte getByteValueBasedOnFlag(boolean flag) {
        Integer iii = flag ? 1 : 2;
        return iii.byteValue();
    }
}    