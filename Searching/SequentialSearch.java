	public static int SequentialSearch(int[] a, int solution) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == solution) {
				System.out.println("Found!");
			} else {
				return -1;
		}
	}
