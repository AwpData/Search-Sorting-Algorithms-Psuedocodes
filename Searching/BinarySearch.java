	public static int binarySearch(String[] array, String target) {
		int min = 0;
		int max = array.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (target.compareTo(array[mid]) > 0) {
				min = mid + 1;
			} else if (target.compareTo(array[mid]) < 0) {
				max = mid - 1;
			} else if (target.compareTo(array[mid]) == 0) {
				return mid; // target found
			}
		}
		return -1; // target not found
	}

	public static int binarySearch(int[] array, int target) {
		int min = 0;
		int max = array.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (array[mid] < target) {
				min = mid + 1;
			} else if (array[mid] > target) {
				max = mid - 1;
			} else if (array[mid] == target) {
				return mid; // target found
			}
		}
		return -1; // target not found
	}
