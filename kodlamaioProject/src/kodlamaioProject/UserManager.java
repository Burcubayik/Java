package kodlamaioProject;

public class UserManager {
	public void addUser(User user) {
		System.out.println("kullanıcı eklendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	public void deleteUser(User user) {
		System.out.println("kullanıcı silindi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	public void updateUser(User user) {
		System.out.println("kullanıcı güncellendi " + user.getFirstName() +" "+ user.getLastName());
		
	}
	

}
