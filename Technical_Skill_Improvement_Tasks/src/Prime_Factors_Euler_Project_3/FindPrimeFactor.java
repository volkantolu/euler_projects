package Prime_Factors_Euler_Project_3;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class FindPrimeFactor {

	public static void main(String[] args) {
		
		FindPrimeFactor instance = new FindPrimeFactor();
				
		
		//hundreds of billion digit - a huge number,,,,, so think about the performance
		long number = 600851475143L;
		int[] primeFactors = new int[5];
		int largestPrime;
		int c = 0;
		// 5 7 13 29
		
		int x =  (int) Math.ceil(Math.sqrt(number));
		System.out.println(x);
		
		//looping until x (sqrt of number)
		for (int i = 2; i < x; i++) {
			
			//here we are getting mod of the "number"
			if (number % i == 0 && instance.isPrime(i)){
				primeFactors[c] = i;
				c++;
				//System.out.println(i);
			}
			
		}
		
		instance.listArray(primeFactors);
		
		largestPrime = instance.getMaxOfArray(primeFactors);
		
		System.out.println("Largest Prime: " + largestPrime);
		
	}
	
	private int getMaxOfArray(int[] arr) {
		int length = arr.length;
		int j = 0;
		int max=arr[0];

		for (j = 1; j < length; j++) {
			
			if (arr[j] > max){
				
				max = arr[j];
			}
			
			
		}
		
		return max;
	}

	public boolean isPrime(int x){
		boolean value = true;
		int i = 2;
		
		for (i = 2; i < x; i++) {
			
			if (x % i == 0){
				value = false;
			}			
		}

		return value;
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
