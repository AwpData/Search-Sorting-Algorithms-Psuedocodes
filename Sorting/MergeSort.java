
	public static void mergeSort(int[] a) {
		if (a.length > 1) {
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
		}
	}

	public static void mergeSort(String[] a) {
		if (a.length > 1) {
			String[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			String[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
		}
	}

	public static void merge(String[] result, String[] left, String[] right) {
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < result.length; i++) {
			// System.out.println(Arrays.toString(result));
			if (i2 >= right.length || (i1 < left.length && left[i1].compareTo(right[i2]) <= 0)) {
				result[i] = left[i1];
				i1++;
			} else {
				result[i] = right[i2];
				i2++;
			}
		}
	}

	public static void merge(int[] result, int[] left, int[] right) {
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < result.length; i++) {
			//System.out.println(Arrays.toString(result));
			if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
				result[i] = left[i1];
				i1++;
			} else {
				result[i] = right[i2];
				i2++;
			}
		}
	}
