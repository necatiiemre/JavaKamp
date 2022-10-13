
public class BaseCreditManager {
	
	public double calculate(double amount){
		
		return amount * 1.18;
	}
	
	public final void write(double totalAmount){
		
		System.out.println("Geri Ödeme Miktarı : " + totalAmount );
		
	}

}
