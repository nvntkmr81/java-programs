package main.java.com.java_programs;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2 }, { 4, 5 },{7,8} };
		int rows = arr1.length;
		int columns = arr1[0].length;
		int[][] arrT = new int[columns][rows];

		// Converting Original matrix into Transpose Matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arrT[j][i] = arr1[i][j];
			}
		}
		
		// Printing original Matrix
		System.out.println("Original Matrix");
		printArray(arr1);
		// Printing Transposed Matrix
		System.out.println("Transposed Matrix");
		printArray(arrT);
	}
	
	static void printArray(int[][] arr){
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
