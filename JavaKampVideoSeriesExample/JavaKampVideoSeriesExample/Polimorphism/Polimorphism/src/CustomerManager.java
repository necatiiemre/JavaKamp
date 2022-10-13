
public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger loger) {
		super();
		this.logger = loger;
	}

	public void add() {
		System.out.println("Customer Added");
		
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log("Log message");*/
		
		this.logger.log("Log message");
	}

}
