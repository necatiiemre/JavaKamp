//Emre Ozdemir
//1.30 AM  09/28/2022

import java.util.Scanner;
public class Vowels{
	public static void main(String[] args){
	char[] boldVovels ={'a','o','u'};
	char[] vowels ={'a','e','i','o','u'};
	char vowel;
	boolean isVowel;
	Scanner input=new Scanner(System.in);
	
	
	//Check user imput isvowel
	do{
		System.out.print("Please Ente a Vowel : ");
		vowel = input.next().charAt(0);
		isVowel=false;
		for(int i = 0 ; i < 5; i++){
			if(vowel == vowels[i]){
				isVowel=true;
			}
		}
		
		
	}while(isVowel == false);
	
	for(int i = 0;i < 3; i++){
		if(vowel == boldVovels[0]){
			System.out.println(vowel + " is bold vowel.");
			break;
		}
		else{
			System.out.println(vowel + " is thin vowel.");
			break;
		}
	}
	
	}
}