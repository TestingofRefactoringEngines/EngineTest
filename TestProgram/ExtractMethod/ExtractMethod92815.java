class ArrayPrinter {

    public void printArrayBasedOnCondition(boolean someCondition, int[] array) {
        if (someCondition) {
            assert array.length == 1;
            System.out.println(array[0]);
        } else {
            assert array.length == 0;
            System.out.println("Nothing");
        }
    }

    public static void main(String[] args) {
        ArrayPrinter printer = new ArrayPrinter();
        int[] array1 = {5};
        printer.printArrayBasedOnCondition(true, array1);
        int[] array2 = {};
        printer.printArrayBasedOnCondition(false, array2);
    }
}    