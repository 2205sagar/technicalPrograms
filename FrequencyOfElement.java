package com.xworkz.things;

public class FrequencyOfElement {
	static void frequency(int numbers[], int num) {
		int count=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==num) {
				count=count+1;
			}
		}
		System.out.println("Frequency of " +num+ " is: "+count);
	}
	
	public static void main(String[] args) {
		int numbers[]= {1,7,7,5,2,4,4,7,9,2,2,1};
		frequency(numbers, 7);
		
	}
}
