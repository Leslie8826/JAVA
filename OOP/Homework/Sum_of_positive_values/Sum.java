public class Sum {
	int sum(int[] array) {
		int sum =0;
		
		for(int l = 0; l < array.length; l++) {
			if (array[l] > 0) {
				sum = sum + array[l];
			}
		}
		return sum;
	}
}

