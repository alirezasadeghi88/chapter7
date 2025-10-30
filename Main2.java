public class Main2 {
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		double[] list = {2 , 8 , 4 , 6 , 1 , 5 , 9 , 3 , 7};
		sort.selectionSort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
	} 
}