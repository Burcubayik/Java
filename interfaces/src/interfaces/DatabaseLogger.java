package interfaces;

public class DatabaseLogger implements Logger{

	@Override//kodu ezmek i�in kullan�l�r
	public void log(String message) {
		System.out.println("database logland�"+message);
		
		
	}

}
