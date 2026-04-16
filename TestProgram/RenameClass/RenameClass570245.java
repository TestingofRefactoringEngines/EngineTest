class X2 { 
	public static void main(String[] args) {
     enum Y1 { 
		
		BLEU,
		BLANC,
		ROUGE;
		
		public static void main(String[] args) {
			for(Y1 y: Y1.values()) {
				System.out.print(y);
			}
		}
		
	  }
	  Y1.main(args);
	}
}
