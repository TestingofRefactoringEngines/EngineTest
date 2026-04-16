class Test {
    enum Color {WHITE, BLACK}
    
    public static void main(String[] args) {
        Color c = BLACK;
        switch(c) {
        case BLACK:
            System.out.println("Black");
            break;
        case WHITE:
            System.out.println("White");
            break;
        }
    }

}