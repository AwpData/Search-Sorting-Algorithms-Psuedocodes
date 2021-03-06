	public static void insertionSort(String[] array) {
		int Samecounter = 0;
		int Sortedcounter = 0;
		if (array.length == 0) {
			System.out.println("There is nothing in the array!");
		} else if (array.length == 1) {
			System.out.println("Only one element!");
		} else {
			for (int i = 1; i < array.length; i++) {
				if ((array[i].compareTo(array[i - 1]) == 0)) {
					Samecounter++;
				} else if ((array[i].compareTo(array[i - 1]) > 0)) {
					Sortedcounter++;
				}
				for (int j = i; j > 0 && array[j].compareTo(array[j - 1]) < 0; j--) {
					String temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
			if (Samecounter == array.length - 1) {
				System.out.println("All values are equal!");
			}
			if (Sortedcounter == array.length - 1) {
				System.out.println("All values are already in ascending order!");
			}
		}
	}
