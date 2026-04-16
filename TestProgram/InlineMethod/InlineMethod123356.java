class Bug {
    static String[]field;
    public static void main(String[]args){
        add((field=args).length,field.hashCode());
    }
    static int add(int x, int y){
        return y+x;
    }
}