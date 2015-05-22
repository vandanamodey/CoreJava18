package com.practice.array;

public class MultiDimentional {

	public static void main(String[] args) {
		
		int pyramid [][] = new int [10][];
		
		pyramid[0] = new int[1];
		pyramid[1] = new int[2];
		pyramid[2] = new int[3];	
		pyramid[3] = new int[4];
		pyramid[4] = new int[5];
		pyramid[5] = new int[6];
		pyramid[6] = new int[7];
		pyramid[7] = new int[8];
		pyramid[8] = new int[9];
		pyramid[9] = new int[10];
		
		int k =0;
		
		for(int i=0; i< pyramid.length; i++)
		{	
			for(int j=0; j<pyramid.length; j++ ){
				pyramid[i][j]= k;
				
				System.out.print("i = " + i + " j = " + j + " k = " + k);
				
				k++;
			}
		}
/*		for(int i=0; i< pyramid.length; i++){

			for(int j=0; j<pyramid.length +1; j++)
				System.out.print(pyramid[i][j] + " ");
				System.out.println();		
    	}
*/
	}
}




