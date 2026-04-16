interface ITest {

	public void wrongName();

}

class Test implements ITest {
   	
   	
	public static void main(String[] args) throws Exception {
		new Test().wrongName();
	}

	
	public void wrongName() {
		
	}

	
}
