class SuperType<ELEM extends Number> {

	void add(ELEM e) {

	}

	ELEM get() {

		return null;

	}

}
class SubType<ELEM> extends SuperType<Integer> {

	void sub(Integer i) {

		add(i);

	}



}
