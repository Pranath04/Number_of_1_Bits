package numberof1bits;

import java.util.Scanner;

public class Bits{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		scanner.close();
		System.out.print(numberof1s(number));
	}
	public static int numberof1s(int number) {
		int count = 0;
		while(number>0) {
			if((number &1)==1) {
				count++;
			}
			number=number>>1;
		}
		return count; 
	}
}