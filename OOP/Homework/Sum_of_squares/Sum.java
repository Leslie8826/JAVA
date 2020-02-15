public class Sum {
	int sum(int[] array) {
		int sum = 0;
		
		for (int i=0; i<array.length; i++) {
			sum = sum + array[i]*array[i];
		}
		return sum;
	}
}

