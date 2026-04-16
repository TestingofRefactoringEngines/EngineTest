class SuperType<ELEM extends Number> {

	int stat(Integer j) {

		return min(j, 42, 52, abs(32));

	}



	int min(int head, int... tail) {

		int min= head;

		for (int i : tail)

			min= min(i,min);

		return min;

	}


}
 class SubType extends SuperType {

}