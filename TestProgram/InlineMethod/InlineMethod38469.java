public int fred(){
		return super.hashCode();
	}
	void f(int p){
		new Ad(){
			void f(){
				int u= Ad.this.fred();
			}
		};
	}