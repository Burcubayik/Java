package interfaces;

public class Main {

	public static void main(String[] args) {
		//CustomerDal customerDal= new CustomerDal(); bu kullan�m yanl�� fakat customer dal onu implemente eden classn referans�n� alabilir
		CustomerDal customerDal=new OracleCustomerDal();
		

	}

}
