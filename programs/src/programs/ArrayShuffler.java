package programs;
import java.util.Arrays;
import java.util.Random;
public class ArrayShuffler {
	public static void main(String[] args) {
		 int[] arr = {8, 12, 7, 5, 54, 60, 77};
		 shuffleArray(arr);
		 System.out.println("Shuffled array: " + Arrays.toString(arr));
		    }
 private static void shuffleArray(int[] arr) {
		     Random random = new Random();
		       for (int i = arr.length - 1; i > 0; i--) {
		          int j = random.nextInt(i + 1);
		          int temp = arr[i];
		           arr[i] = arr[j];
		           arr[j] = temp;
		 }
	}

}
