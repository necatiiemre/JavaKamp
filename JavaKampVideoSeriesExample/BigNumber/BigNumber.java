//Emre Ozdemir

import java.util.Scanner;

public class BigNumber{
	public static void main(String[] args){
		int number1,
		number2,
		number3,
		biggerNumber;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a number1 : ");
		number1=input.nextInt();
		System.out.println("Please enter a number2 : ");
		number2=input.nextInt();
		System.out.println("Please enter a number3 : ");
		number3=input.nextInt();
		
		biggerNumber=number1;
		
		if(biggerNumber<number2){
		biggerNumber = number2;
		}
		if(biggerNumber<number3){
		biggerNumber = number3;
		}
		
		System.out.println("BigNumber is :" + biggerNumber);
		
		
	}
}
