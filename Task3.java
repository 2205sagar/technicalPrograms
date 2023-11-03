package com.xworkz.things;

public class Task3 {

	public static void main(String[] args) {
		int [] arr= new int[] {2,7,11,15};
		int tar=13;
		
		System.out.println("Original array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]+arr[j]==tar) {
					System.out.println("the numbers at indices " +j+ " and " +i+ " in the nums array ( " +arr[j]+" and " +arr[i]+") add up to the target value of " +tar);
				}
			}
		}
	}

}
