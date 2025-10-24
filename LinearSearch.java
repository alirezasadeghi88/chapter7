public class LinearSearch {
	
	public static void main(String[] args) {
		int[] test = new int[3];
		test[0] = 10;
		test[1] = 11;
		test[2] = 12;
		int result = linearSearch(test, 10);
		System.out.println(result);	
	}
	
	public static int linearSearch(int[] list, int key) {
		for (int i = 0; i < list.length; i++) {
			if (key == list[i])
				return i;
		}
		return -1;
	}
}