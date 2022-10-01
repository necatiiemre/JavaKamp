//Emre Ozdemir


import java.util.Scanner;

public class IfElse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int myInteger;
		
		System.out.println("Please Enter a intger number: ");
		myInteger = input.nextInt();
		
		if(myInteger<20){
			System.out.println("Your number less than 20");
		}
		else if(myInteger == 20){
			System.out.println("Your number equal to 20");
		}
		else{
			System.out.println("Your number bigger than 20");
		}
		
	}
}