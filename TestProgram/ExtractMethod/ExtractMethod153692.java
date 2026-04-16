 class MethodExtraction {
    
    public final String internalValue;
    
    MethodExtraction() {
        this.internalValue = "This is my internal value";
    }
    
    void aMethod() {
        String exclaim = this.internalValue + "!";

        System.out.println(exclaim);
    }

}