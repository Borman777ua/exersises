package N1;


public class N1_1 {
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
		System.out.println("My data on Array is: [" + array[1] + "];[" + array[2] + "];[" + array[3] + "];[" + array[4] + "];[" + array[5]
				+ "];[" + array[6] + "];[" + array[7]+ "];[" + array[8]+ "];[" + array[9]+ "];[" + array[10] + "];[" + array[11]+ "];[" + array[12]
				+ "];[" + array[13]+ "];[" + array[14]+ "];[" + array[15]+ "];[" + array[16]+ "];[" + array[17]+ "];[" + array[18]+ "];[" + array[19]+"]");

		for (i = 0; i < array.length - 1; i++ ) {
			if (array[i]>array[i+1]) {
				array[i] *=3;
			}
		}
		System.out.println("Updated data on Array is: [" + array[1] + "];[" + array[2] + "];[" + array[3] + "];[" + array[4] + "];[" + array[5]
				+ "];[" + array[6] + "];[" + array[7]+ "];[" + array[8]+ "];[" + array[9]+ "];[" + array[10] + "];[" + array[11]+ "];[" + array[12]
				+ "];[" + array[13]+ "];[" + array[14]+ "];[" + array[15]+ "];[" + array[16]+ "];[" + array[17]+ "];[" + array[18]+ "];[" + array[19]+"]");
	}
}