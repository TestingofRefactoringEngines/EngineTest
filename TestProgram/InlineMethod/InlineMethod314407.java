class Try {
    Object getImage() {
	return null;
    }
    
    Object foo() {
	Object o= getImage();
	return getImage(o); 
    }
}