package kodlamaioProject;

public class UserManager {
	public void addUser(User user) {
		System.out.println("kullan�c� eklendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	public void deleteUser(User user) {
		System.out.println("kullan�c� silindi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	public void updateUser(User user) {
		System.out.println("kullan�c� g�ncellendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	

}
