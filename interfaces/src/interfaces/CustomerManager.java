package interfaces;


	
	


public class CustomerManager {
	//neye ba��ml�ysak private alan� olarak yaz�yoruz
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	// iki  tip ba�lanma var
	//loosly or tightly
	
	public void add(Customer customer) {
		System.out.println("m��teri eklendi"+ customer.getFirstName() );
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
		
		
	}
	public void delete(Customer customer) {
		System.out.println("m��teri silindi"+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
		
		
		
	}

}
