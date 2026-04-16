class SynchronizedCommandStack extends BasicCommandStack {
		public void execute(Command command) {
			if (command instanceof AbstractOverrideableCommand) {
				synchronized (SynchronizedCommandStack.this) {
					super.execute(command);
				}
			} else {
				super.execute(command);
			}
		}
	}
class TestClass {
    protected class SynchronizedSomething {
        public void execute() {
        	if (true) {
                synchronized (SynchronizedSomething.this) {
                    System.err.println();
                }
            }
        }
        
    }
}