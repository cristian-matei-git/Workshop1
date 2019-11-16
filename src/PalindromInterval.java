import java.util.Scanner;

public class PalindromInterval {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduceti inceputul intervalului: ");
		int left = sc.nextInt();
		
		System.out.print("Introduceti sfarsitul intervalului: ");
		int right = sc.nextInt();
		
		int lastDigit = 0;
		int symetric = 0;
		int copyLeft = left;
		
		sc.close();
		//The counter goes from left to right and checks each number
		for(int i = left; i <= right; i++) {
			
			//verifies if the number is a palindrom
			while(copyLeft != 0) {
				
			lastDigit = copyLeft % 10;
			symetric = (symetric * 10) + lastDigit;
			copyLeft /= 10;
			
			}
			//if it is then it prints it
			if (left == symetric) {
				
				System.out.print(left + " ");
				
				
			}
			//increments and checks again until equal to right
			left++;
			copyLeft = left;
			symetric = 0;
				
			
				
		}

	}

}
