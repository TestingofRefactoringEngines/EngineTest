import java.util.HashMap;
class Collector<E> {
	
}
 class Stats<T> extends Collector<T> {
	static <T> void countItem(HashMap<T, Integer> frequencies, T item) {
		Integer frequency = frequencies.get(item);
		if (frequency == null)
			frequency = 1;
		else
			frequency++;
		frequencies.put(item, frequency);
	}
}