 class MyFile extends File
{
	private String l;

	public MyFile(String parent, String child) {
		super(parent, child.toLowerCase());
		l = child.toLowerCase();
	}

}