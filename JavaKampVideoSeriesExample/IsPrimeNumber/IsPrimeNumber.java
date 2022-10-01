//Emre Ozdemir
//20050111020
//01.11 AM 9/28/2022

import java.util.Scanner;
	public class IsPrimeNumber{
		public static void main(String[] args){
			int number;
			int divisorCount=0;
			Scanner input = new Scanner(System.in);
			System.out.println("Please Enter a Number");
			number = input.nextInt();
			//Check your number 
			while(number < 2){
				System.out.println("Invalid Number! Please Enter a Number");
				number = input.nextInt();
			}
			//Calculate the number of whole divisors
			for(int i = 1 ; i <= (number/2);i++){
				if(number % i == 0){
					divisorCount+=1;
				}
			}
			//If divisorCount = 1 number is prime else number is not prime 
			if(divisorCount == 1){
				System.out.println(number+" is prime number");
			}
			else{
				System.out.println(number+" is not prime number");
			}
			
		}
	}