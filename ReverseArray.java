public class ReverseArray {
	
    public static void main(String[] args) {
        int[] mylist = new int[5];
        mylist[0] = 1;
        mylist[1] = 2;
        mylist[2] = 3;
		mylist[3] = 4;
		mylist[4] = 5;
		
        int[] respons = revers(mylist);
        for (int i = 0; i < respons.length; i++) {
            System.out.println(respons[i]);
        }
    }

    public static int[] revers(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; 
			i < list.length && j >= 0; 
				i++, j--) {
			result[j] = list[i];
        }

        return result;
    }
}