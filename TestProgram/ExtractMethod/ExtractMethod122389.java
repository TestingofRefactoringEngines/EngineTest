class A extends TestCase{
	
    private int getGridY(int y) {
        int tmp = 0, res = 1;
        while (res < y) {
        	//extract here
            tmp = res;
            res += 1;
            //to here
        }
        return tmp;
    }
    
    public void testCase(){    	
    	assertEquals(getGridY(7),6);
    }
}