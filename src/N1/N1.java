package N1;

import java.util.Arrays;

public class N1 {
	public static void main(String[] args) {
		int[] array = new int[20];
		int a = -5;
		int b = 10;
		int i;
		array [0] = a + (int) (Math.random() * b);
		array [1] = a + (int) (Math.random() * b);
		array [2] = a + (int) (Math.random() * b);
		array [3] = a + (int) (Math.random() * b);
		array [4] = a + (int) (Math.random() * b);
		array [5] = a + (int) (Math.random() * b);
		array [6] = a + (int) (Math.random() * b);
		array [7] = a + (int) (Math.random() * b);
		array [8] = a + (int) (Math.random() * b);
		array [9] = a + (int) (Math.random() * b);
		array [10] = a + (int) (Math.random() * b);
		array [11] = a + (int) (Math.random() * b);
		array [12] = a + (int) (Math.random() * b);
		array [13] = a + (int) (Math.random() * b);
		array [14] = a + (int) (Math.random() * b);
		array [15] = a + (int) (Math.random() * b);
		array [16] = a + (int) (Math.random() * b);
		array [17] = a + (int) (Math.random() * b);
		array [18] = a + (int) (Math.random() * b);
		array [19] = a + (int) (Math.random() * b);
			Arrays.sort(array,0,20);
		System.out.println(Arrays.toString(array));
        int [] array2 = new int[20];
		array2 = Arrays.copyOfRange(array,0,20);
		
		System.out.println(Arrays.toString(array2));
		}
	}