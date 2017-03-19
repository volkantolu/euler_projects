package Sum_Of_Even_Fibonacci_Euler_Project_2;

public class evenFibonacci {

	public static void main(String[] args) {
		
		int arrSize = 13;
		
		int[] evenFibonacci = new int[arrSize];
		
		evenFibonacci[0] = 0;
		evenFibonacci[1] = 2;
		
		int i=2, x=0 ;
		int sum = evenFibonacci[0] + evenFibonacci[1];		
		
		int limitValue = 4000000;
		
		do{
			x = (4 * evenFibonacci[i-1]) + evenFibonacci[i-2];
			
			evenFibonacci[i] = x;
			
			if (evenFibonacci[i] >= limitValue){
				System.out.println(i + "th element of the evenFibonacci list has the greatest value before " + limitValue);
				System.out.println("While Loop - Sum of the even numbers at fibonacci list: "+ sum);
				break;
			}
			else{
				sum += evenFibonacci[i];
			}
			
		}while(evenFibonacci[i++] <= limitValue);
		
		
		evenFibonacci = new int[arrSize];
		
		evenFibonacci[0] = 0;
		evenFibonacci[1] = 2;
		sum = evenFibonacci[0] + evenFibonacci[1];	
		
		System.out.println();
		
		for(i=2; evenFibonacci[i] <= limitValue; i++){
			
			//this formula also guarantees the result is even with the mathematical criteria,
			x = (4 * evenFibonacci[i-1]) + evenFibonacci[i-2];
			
			//so it is not necessary to check that it is even
			//if (x % 2 == 0) {
				
				evenFibonacci[i] = x;
				
				if (evenFibonacci[i] >= limitValue){
					System.out.println(i + "th element of the evenFibonacci list has the greatest value before " + limitValue);
					System.out.println("For-Loop Sum of the even numbers at fibonacci list: "+ sum);
					break;
				}
				else{
					//System.out.println(evenFibonacci[i]);
					sum += evenFibonacci[i];
				}
					
			//}end-of if condition
			
		}//end-of for block
				
	}

}
