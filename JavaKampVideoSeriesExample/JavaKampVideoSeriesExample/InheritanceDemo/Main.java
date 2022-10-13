//Emre Özdemir
//10.11 PM 10/1/2022

public class Main{
	
	public static void main(String[] args){
	//IndividualCreditManager individualCreditManager = new IndividualCreditManager();
	//individualCreditManager.calculate();
	
	CreditUi creditUi = new CreditUi();
	creditUi.creditCalculate(new IndividualCreditManager());
	creditUi.creditCalculate(new CorporateCreditManager());
	creditUi.creditCalculate(new SoldierCreditManager());
}

}