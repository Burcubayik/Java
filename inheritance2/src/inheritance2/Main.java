package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//birbirinin LTERNAT�F� OLAN KODLAR ���N �F KULLAILMAZ
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());
	}

}
