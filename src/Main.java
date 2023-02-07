import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		List<Integer> intSourceList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

		// Выделение положительных элементов из списка

		List<Integer> intPositiveList = new ArrayList<>();

		Iterator iterator0 = intSourceList.iterator();

		while (iterator0.hasNext()) {
			int item = (int) iterator0.next();
			if (item > 0) {
				intPositiveList.add(item);
			}
		}

		// Выделение четных элементов из списка

		List<Integer> intEvenList = new ArrayList<>();

		Iterator iterator1 = intPositiveList.iterator();

		while (iterator1.hasNext()) {
			int item = (int) iterator1.next();
			if (item % 2 == 0) {
				intEvenList.add(item);
			}
		}

		// Сортировка списка
		Collections.sort(intEvenList);

		// Вывести список
		System.out.println(intEvenList);
	}
}
