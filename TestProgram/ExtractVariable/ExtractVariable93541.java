class A{
static ArrayList<? extends Number> al= new ArrayList<Integer>();
	void test () {
		al.get(0); //<-select method invocation expression and extract
	}
}
