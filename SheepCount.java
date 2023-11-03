package com.xworkz.things;

public class SheepCount {
	public static void main(String[] args) {
		
	
	 boolean attendance[] = {true,  true,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true};
	 
	int count=0;
	for(int i=0; i<=attendance.length-1; i++) {
		if(attendance[i]==true) {
			count++;
		}
		}
	System.out.println(" number of sheep present :"+count);

}
}
