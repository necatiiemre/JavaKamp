//Emre Özdemir

import java.util.Scanner;

public class LetterGrade{
	public static void main(String[] args){
	int yourScore;
	char letterGrade;
	Scanner input = new Scanner(System.in);
	
		System.out.println("Please Enter your score : ");
		yourScore=input.nextInt();
		
		while(yourScore > 100 || yourScore < 0){
			System.out.println("Invalid Score Please Enter Your Score : ");
			yourScore = input.nextInt();
		}
		
		if(yourScore >= 90){
			letterGrade = 'A';
		}
		else if(yourScore >= 80 && yourScore < 90 ){
			letterGrade = 'B';
		}
		else if(yourScore >= 70 && yourScore < 80){
			letterGrade = 'C';
		}
		else if(yourScore >= 60 && yourScore <70){
			letterGrade = 'D';
		}
		else{
			letterGrade = 'F';
		}
		
		switch(letterGrade){
			case 'A':
			case 'B':
			case 'C':
			case 'D':
				System.out.println("Passed your letter grade is " + letterGrade);
				break;
			case 'F':
				System.out.println("Failed your letter grade is " + letterGrade);
				break;
		}
	}
}