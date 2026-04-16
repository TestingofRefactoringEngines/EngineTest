class OriginalClass{
	TargetClass t;
	public static class StaticInnerClass{
		
	}
	public void originalMethod(){
		StaticInnerClass inner = new  StaticInnerClass();
	}
}
class TargetClass{}