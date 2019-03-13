	public static void upsort(int[] array) { // ascending order for numbers
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[smallest]) {
					smallest = j;
				}
			}
			swap(array, smallest, i);
		}
	}

	public static void upsort(String[] array) { // ascending order for names
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[smallest].compareTo(array[j]) > 0) {
					smallest = j;
				}
			}
			swap(array, smallest, i);
		}
	}

	public static void downsort(int[] array) { // descending order for numbers
		for (int i = 0; i < array.length - 1; i++) {
			int greatest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[greatest]) {
					greatest = j;
				}
			}
			swap(array, greatest, i);
		}
	}

	public static void downsort(String[] array) { // descending order for names
		for (int i = 0; i < array.length - 1; i++) {
			int greatest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[greatest].compareTo(array[j]) < 0) {
					greatest = j;
				}
			}
			swap(array, greatest, i);
		}
	}

	public static void swap(int[] array, int smallest, int place) { // swaps values in int array
		int temp = array[place];
		array[place] = array[smallest];
		array[smallest] = temp;
	}

	public static void swap(String[] array, int smallest, int place) { // swaps values in string array
		String temp = array[place];
		array[place] = array[smallest];
		array[smallest] = temp;
	}
