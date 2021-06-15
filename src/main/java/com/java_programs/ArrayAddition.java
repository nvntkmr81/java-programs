package main.java.com.java_programs;

public class ArrayAddition {
	static int len;
	static int[] arr3 =null;
	public static void main(String[] args) {
		int[] arr1= new int[]{1,2,3,4,5};
		
		int[] arr2= new int[]{3,4,5,6,8};
		if(arr1.length==arr2.length){
			 len = arr1.length;
			arr3 = new int[len];
		}
		else System.out.println("Size of arrays are not matching ");
	

	for (int i=0;i<len;i++){
		arr3[i]=arr1[i]+arr2[i];
		System.out.print(arr3[i]+" ");
	}
}
}
