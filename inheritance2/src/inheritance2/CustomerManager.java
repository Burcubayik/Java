package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		System.out.println("m��teri eklendi");
		//somut s�n�flar� nwleme bir kodun i�inde ba�ka i� yapan s�n�f newleniyorsa o koddan hay�r bekleme
		logger.log();//sistemlerde ne olup bitti�ini kontrol etmek
	}

}
