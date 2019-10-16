package aPackForTest;

public class SortingAlgotithm {
	public static int[] BoubleSorting(int[] toSortArray) {
		int backUpOne;
		for (int i = 0; i < toSortArray.length; i++) {
			for (int j = i; j < toSortArray.length; j++) {
				if (toSortArray[i] > toSortArray[j]) {
					backUpOne = toSortArray[i];
					toSortArray[i] = toSortArray[j];
					toSortArray[j] = backUpOne;
				}
			}
		}
		return toSortArray;
	}

	public static int[] InsertionSorting(int[] toSortArray) {
		for (int i = 1; i < toSortArray.length; i++) {
			int backUpOne = toSortArray[i];
			int j = i;
			while (j > 0 && toSortArray[j - 1] > backUpOne) {
				toSortArray[j] = toSortArray[j - 1];
				j--;
			}
			toSortArray[j] = backUpOne;
		}
		return toSortArray;
	}
}
