package N1;

import java.util.Arrays;

public class N1 {
	public static void main(String[] args) {
		int[] array = new int[20];
		int a = -5;
		int b = 10;
		int i;
		array[0] = a + (int) (Math.random() * b);
		array[1] = a + (int) (Math.random() * b);
		array[2] = a + (int) (Math.random() * b);
		array[3] = a + (int) (Math.random() * b);
		array[4] = a + (int) (Math.random() * b);
		array[5] = a + (int) (Math.random() * b);
		array[6] = a + (int) (Math.random() * b);
		array[7] = a + (int) (Math.random() * b);
		array[8] = a + (int) (Math.random() * b);
		array[9] = a + (int) (Math.random() * b);
		array[10] = a + (int) (Math.random() * b);
		array[11] = a + (int) (Math.random() * b);
		array[12] = a + (int) (Math.random() * b);
		array[13] = a + (int) (Math.random() * b);
		array[14] = a + (int) (Math.random() * b);
		array[15] = a + (int) (Math.random() * b);
		array[16] = a + (int) (Math.random() * b);
		array[17] = a + (int) (Math.random() * b);
		array[18] = a + (int) (Math.random() * b);
		array[19] = a + (int) (Math.random() * b);
		Arrays.sort(array, 0, 20);
		System.out.println(Arrays.toString(array));
		int[] array2;
		array2 = Arrays.copyOfRange(array, 0, 20);
			if (array2[1] > 0) {
				array2[1] *= 3;
			}
			if (array2[2] > 0) {
				array2[2] *= 3;
			}
			if (array2[3] > 0) {
				array2[3] *= 3;
			}
			if (array2[4] > 0) {
				array2[4] *= 3;
			}
			if (array2[5] > 0) {
				array2[5] *= 3;
			}
			if (array2[6] > 0) {
				array2[6] *= 3;
			}
			if (array2[7] > 0) {
				array2[7] *= 3;
			}
			if (array2[8] > 0) {
				array2[8] *= 3;
			}
			if (array2[9] > 0) {
				array2[9] *= 3;
			}
			if (array2[10] > 0) {
				array2[10] *= 3;
			}
			if (array2[11] > 0) {
				array2[11] *= 3;
			}
			if (array2[12] > 0) {
				array2[12] *= 3;
			}
			if (array2[13] > 0) {
				array2[13] *= 3;
			}
			if (array2[14] > 0) {
				array2[14] *= 3;
			}
			if (array2[15] > 0) {
				array2[15] *= 3;
			}
			if (array2[16] > 0) {
				array2[16] *= 3;
			}
			if (array2[17] > 0) {
				array2[17] *= 3;
			}
			if (array2[18] > 0) {
				array2[18] *= 3;
			}
			if (array2[19] > 0) {
				array2[19] *= 3;
			}
		System.out.println(Arrays.toString(array2));
		}
	}