//Emre Özdemir
//20050111020
//12:36 AM  9/30/2022

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		int numbersize=0,number;
		FourOperations fourOperations = new FourOperations();
		do{
			System.out.println("Please Enter a Number or Press 0 for Addition Operation ");
			number = input.nextInt();
			numbers[numbersize] = number;
			numbersize++;
			
		}while(number != 0);
		
		System.out.println("Total : "+ fourOperations.addition(numbers));
	}
}