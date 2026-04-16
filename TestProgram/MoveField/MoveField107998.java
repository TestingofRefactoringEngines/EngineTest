class Bug {
    public static int field;
    class Inner{
        int number=field;
        int method(){return field;}
    }
}