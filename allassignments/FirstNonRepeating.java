package allassignments;

public class FirstNonRepeating {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 5, 9 };
		System.out.println(firstNonRepeating(arr, arr.length));
	}

	public static int firstNonRepeating(int[] arr, int length) {
		int j;
		for (int i = 0; i < length; i++) {
			for (j = 0; j < length; j++) {
				if (arr[i] == arr[j] && i != j) {
					break;
				}
			}
			if (j == length)
				return arr[i];
		}
		return -1;

	}

}
