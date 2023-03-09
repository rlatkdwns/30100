package test;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {94,85,95,88,90};
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

}
