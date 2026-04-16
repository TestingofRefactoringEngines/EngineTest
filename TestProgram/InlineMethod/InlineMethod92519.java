class InlineMethodBug {
    private Object data;

    InlineMethodBug(Object data){
		this.setData(data);
    }

    //inline this method, remove decl
	private void setData(Object bytes) {
		this.data= bytes;
	}
}