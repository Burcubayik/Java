package interfaces;

public class MySqlCustomerDal implements CustomerDal {

	@Override
	public void add() {
		System.out.println("my sql eklendi");
		
	}//veritaban� ile ilgili opersayonlarda Dal isimlendirmesi kullan�l�r.

}
