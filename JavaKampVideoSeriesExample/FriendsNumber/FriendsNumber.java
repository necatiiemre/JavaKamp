//EMRE ÖZDEMİR
//20050111020
//9:49PM 9/28/2022

import java.util.Scanner;

public class FriendsNumber{
	public static void main(String[] args){
		int firstNumber,secondNumber,firstTotal=0,secondTotal=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please Enter First Number : ");
		firstNumber = input.nextInt();
		System.out.print("Please Enter Second Number : ");
		secondNumber = input.nextInt();
		
		for(int i = 1;i<=(firstNumber/2);i++){
			if(firstNumber % i == 0){
				firstTotal +=i;
			}
		}
		for(int i = 1;i<=(secondNumber/2);i++){
			if(secondNumber % i == 0){
				secondTotal +=i;
			}
		}
		if((firstTotal == secondNumber) && (secondTotal == firstNumber)){
			System.out.println("Those numbers are friends number !");
		}
		else{
			System.out.println("Those numbers are not friends number !");
		}
	}
}