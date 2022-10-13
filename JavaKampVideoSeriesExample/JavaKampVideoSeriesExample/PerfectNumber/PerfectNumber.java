//Emre Özdemir
//9.20PM 9/28/2022

import java.util.Scanner;

public class PerfectNumber{
	public static void main(String[] args){
		int number,total=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter a Number : ");
		number = input.nextInt();
		
		for(int i = 1 ; i <= (number/2);i++){
			if(number % i == 0){
				total += i;
			}
		}
		if(total == number){
			System.out.println(number + " is perfect number !");
		}
		else{
			System.out.println(number + " is not perfect number !");
		}
	}
}