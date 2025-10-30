public class SelectionSort {
	
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			
			double currentnMin = list[i];
			int currentnMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++) {
				if (currentnMin > list[j]) {
					 currentnMin = list[j];
					 currentnMinIndex = j;
				}
			}
		
		
			if (currentnMinIndex != i) {
				list[currentnMinIndex] = list[i];
				list[i] = currentnMin;
			}
		}
	}
}