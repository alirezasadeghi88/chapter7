public class Reverse {
	
	public static void main(String[] args) {
		int[] test = new int[3];
		test[0] = 1;
		test[1] = 4;
		test[2] = 10;
		
		int[] result = reverse(test);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		for (int i = 0, j = result.length - 1;
				i < list.length; i++, j--) {
			result[j] = list[i];	
		}
		
		return result;
	} 
}