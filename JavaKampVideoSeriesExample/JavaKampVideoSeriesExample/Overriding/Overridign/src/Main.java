
public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] baseCreditManagers = new BaseCreditManager[] {new TeacherCreditManager(),new FarmerCreditManager(),new StudentCreditManager()};
		
		for (BaseCreditManager baseCreditManager : baseCreditManagers) {
			baseCreditManager.write(baseCreditManager.calculate(10000));
		}
	}

}
