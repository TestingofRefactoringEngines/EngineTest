@interface Annot {
    int    id();
    String synopsis();
    String engineer() default "[unassigned]"; 
    String date()     default "[unimplemented]"; 
}