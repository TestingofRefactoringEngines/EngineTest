class OriginalClass {
private boolean flag = false;

public synchronized void originalMethod() throws InterruptedException {
    flag = true;
    notify();
}

public void callerMethod() throws InterruptedException {
    // inline method refactoring
	originalMethod() ;
}
}