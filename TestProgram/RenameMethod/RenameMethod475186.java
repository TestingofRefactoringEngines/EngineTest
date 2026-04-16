abstract class ViewerFilter {
	public abstract boolean selekt(String viewer, Object parentElement);
}
abstract class AbstractInformationControl {
	protected class NamePatternFilter extends jface.ViewerFilter {
		void foo() {
			selekt("", new Object());
		}
		
		@Override
		public boolean selekt(String viewer, Object parentElement) {
			return selekt(viewer, new Integer(1));
		}
		
		// rename this method:
		public boolean selekt(String viewer, Integer parentPath) {
			return false;
		}
	}
}