package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla() ;//hesapla imzas� olmak zorunda ama kullan�c� t�r�ne g�re de�i�ecek
	//abstarct s�n�flar asla newlenemez
	//override yap�labilir new ilw ama bunu kullanma
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
	

}
