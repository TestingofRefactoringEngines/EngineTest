class X {
	I1 i1= (int a) -> {
		int b= 10; // Error
		return a + b;
	};
	
	class Y {
		I1 i1= (int a) -> {
			int b= 10; // Error
			return a + b;
		};
	}
	
	void foo() {
		I1 i1= (int a) -> {
			int b= 10; // Error
			return a + b;
		};
	}
	
	void bar() {
		Runnable r= new Runnable() {
			I1 i1= (int a) -> {
				int b= 10; // Error
				return a + b;
			};
			
			@Override
			public void run() {
				I1 i1= (int a) -> {
					int b= 10; // Error
					return a + b;
				};				
			}
		};
	}
}