package Sum_Of_Multiples_Euler_Project_1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Sum_Of_Multiples {
	
	public static void main(String[] args) {
		
		//here you can define and get "multiples Of" info as an input...
		int sizeOfMultiplesOf = 2;
		int[] multiplesOfList = new int[sizeOfMultiplesOf];
		
		multiplesOfList[0] = 3;
		multiplesOfList[1] = 5;
		
		int limitValue = 1000;
		
		int[] multiplesList = new int[limitValue];
		
		int sumOfMultiples = 0;
		int i=1, j=0, c=0;
		
		Set<Integer> uniqKeys = new TreeSet<Integer>();
		
		Sum_Of_Multiples instance = new Sum_Of_Multiples();

		//first way of solution

		for(i = 1; i < limitValue; i++){
			
			for(j = 0; j < sizeOfMultiplesOf; j++){

				if (i % multiplesOfList[j] == 0){
					multiplesList[c] = i;
					uniqKeys.add(multiplesList[c]);
					c++;
					//System.out.println(i);
					break;
					/*
						break because if "i" is ok for any element of multiplesOfList,
						this means exit from loop for i
					*/
				}
				
			}// end-of inner for loop
			
		}// end-of outer for loop

		sumOfMultiples = instance.sumOfArray(multiplesList);
		System.out.println("First Solution The sum of these multiples is " + sumOfMultiples);
		
		//second way of solution
		multiplesList = instance.clearArray(multiplesList);

		int min = instance.getMinOfArray(multiplesOfList);
				
		int counter = limitValue / min;
		int result = 0;
		c = 0;
		uniqKeys.clear();
		for(i = 0; i < sizeOfMultiplesOf; i++){
			
			for (j = 1; j <= counter; j++) {
				
				result = multiplesOfList[i] * j;

				if (result < limitValue && !(instance.isExist(result,multiplesList))){
					
					multiplesList[c] = result;
					uniqKeys.add(multiplesList[c]);
					c++;
				}
				
			}// end-of inner for loop
			
		}// end-of outer for loop

		//unique values
		//System.out.println(uniqKeys);

		//instance.listArray(multiplesList);
		
		//sum of multiples
		//sumOfMultiples = IntStream.of(multiplesList).sum();
		//System.out.println("The sum of these multiples is " + sumOfMultiples);
		
		sumOfMultiples = instance.sumOfArray(multiplesList);
		System.out.println("Second Solution The sum of these multiples is " + sumOfMultiples);
		
	}

	private boolean isExist(int result, int[] arr) {
		
		boolean value = false;
		
		int length = arr.length;
		int j = 0;
		
		for (j = 0; j < length; j++) {
			
			if (arr[j] == result) {				
				value = true;
				//break;				
			}
			
		}
		
		return value;
	}

	private int[] clearArray(int[] arr) {
		int length = arr.length;
		int j = 0;
		
		for (j = 0; j < length; j++) {
			
			arr[j] = 0;
			
		}
		return arr;
		
	}

	private int getMinOfArray(int[] arr) {
		int length = arr.length;
		int j = 0;
		int min=arr[0];

		for (j = 1; j < length; j++) {
			
			if (arr[j] < min){
				
				min = arr[j];
			}
			
			
		}
		
		return min;
	}

	public int sumOfArray(int[] arr){
		
		int length = arr.length;
		int j = 0;
		int sum = 0;
		
		for (j = 0; j < length; j++) {
			sum += arr[j];
		}
		
		return sum;
	
	}
	
	public void listArray(int[] arr){
		int length = arr.length;
		int j = 0;
		
		for (j = 0; j < length; j++) {
			if (arr[j] != 0)
				System.out.println(arr[j]);
		}
	}

}
