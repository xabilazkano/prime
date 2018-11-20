import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag =true;
		
		while(flag) {
			System.out.println("Give me a number and I will tell you if it is prime or not.");
			if (sc.hasNextInt()) {
				int number = sc.nextInt();
				for (int i=2;i<number;i++) {
					if (number%i==0) {
						flag=false;
						
						break;
					}
				}
				if (flag) {
					System.out.println("The number is prime");
				}
				else {
					System.out.println("The number isn't prime");
				}
				
				
				boolean flag2=true;
				while(flag2) {
					System.out.println("Do you want to play again? (1=Yes 0=No)");
					if (sc.hasNextInt()) {
					
					
						int repeat = sc.nextInt();
						if (repeat==0) {
							flag=false;
							flag2=false;
						}
						else if (repeat==1) {
							flag=true;
							flag2=false;
						}
						else {
							System.out.println("Enter a valid option");
							
						}
					}
				else {
					System.out.println("Enter a valid option");
					sc.next();
				}
				}	
				
			
			}
			else {
				System.out.println("You haven't entered a number.");
				sc.next();
			}
		}
	}

}
