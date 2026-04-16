class BugTest extends TestCase{
	
	  public void testLoop(){

		int x = 0;
		
		for (int i = x; i < 10; i++)    
			//extract here...
		    assertEquals(i,x++);
			//...to here
	  }
}
