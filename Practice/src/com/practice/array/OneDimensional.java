package com.practice.array;

//Calculating Average 

public class OneDimensional {

	public static void main(String[] args){
		
//		int nums[] = {20, 30, 20, 30, 25 };
		
		int a = 30;
		int b = 20; 
		int c = 25;
		
		double result = 0;
		int i;
		
		int nums[] = {a,b,c};
		
		
		for(i = 0; i< nums.length ; i++) {
			result = result + nums[i]  ;
			
			System.out.println("i = " + i);	
		}
		
		
		
		System.out.println("Average is " + result / nums.length);
		System.out.println("\n");
		twoDim();
		
		
	}
	
	public static void twoDim(){
		
		int person1[] = { 5, 30 };
		int person2[] = { 6, 32 }; 
		int person3[] = { 7, 34 };
		
		int persons[][] = { person1, person2, person3 };
		
		for(int i = 0 ; i < persons.length ; i++) {
			for(int  j = 0; j < persons[i].length ; j++) {
			
				
				System.out.print(persons[i][j] + " ");
	
				}
			System.out.println("\n");
		}
	}
	
}
