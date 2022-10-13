
public class Main {

	public static void main(String[] args) {
		/*EmailLogger logger = new EmailLogger();
		logger.log("Logged");
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger()};
		
		for (BaseLogger baseLogger : loggers) {
			baseLogger.log("Log message");
		}
		*/
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
