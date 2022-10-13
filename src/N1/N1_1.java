package N1;


import java.util.Arrays;

public class N1_1 {
	public static void main(String[] args) {
		int[] array = new int[20];
		int i;
		int a = -5;
		int b = 10;
		for (i = 0; i < array.length - 1; i++) {
			array[i] = a + (int) (Math.random() * b);
		}
		System.out.println("Array: "+(Arrays.toString(array)));

		for (i = 0; i < array.length - 1; i++ ) {
			if (array[i]>0){
				if (array[i+1]<0)
					array[i]*=3;
			}
		}
		System.out.println("Update: "+(Arrays.toString(array)));
	}
}