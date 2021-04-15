package JavaCodes;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int sum = 0, originalNum = 371 , rem = 0;
		int number = 0;
		
		while (originalNum > 0) {
			number = originalNum;
			rem = number%10;
			sum = sum + (rem * rem * rem);
		//	sum = sum + rem^3;
			number = number/10;
		
		}
		
		//System.out.println(number);
		System.out.println(originalNum);
		System.out.println(sum);
		*/
		
	/*if (sum == originalNum) {
		System.out.println("It is an Armstrong number");
	} else {
		System.out.println("Not an Armstrong number");
	}	*/
   
		
		
		int sum = 0, number = 371 , rem = 0;
		int org;
		org = number;
		while (number > 0) {
			
			rem = number%10;
			sum = sum + (rem * rem * rem);
			number = number/10;
		}
   System.out.println(sum);
   if (org == sum) { 
	System.out.println("Armstrong Number");
} else {
     System.out.println("Not an Armstrong Number");
}
	}
	
}
