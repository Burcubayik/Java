package eTrade.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTrade.business.abstracts.UserCheckService;
import eTrade.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	List<String> listOfMailAdresses= new ArrayList<String>();

	@Override
	public boolean checkFirstName(User user) {
		
		if(user.getFirstName().isEmpty()) {
			System.out.println("L�tfen isim giriniz");
			return false;
		}
		
		else if(user.getFirstName().length()<2) {
			System.out.println("Hata �sim bilgisi iki karakterden az olamaz");
			return false; 
		}
		return true;
		
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastName().isEmpty()) {
			System.out.println("L�tfen soyad�n�z� giriniz");
			return false;
		}
	else if(user.getLastName().length()<2) {
			System.out.println("Hata soyad� bilgisi iki karakterden az olamaz");
			return false;
		}
		
			return true;
		
		
	}

	@Override
	public boolean checkEMail(User user) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(user.geteMail());
		
		
		if(user.geteMail().isEmpty()) {
			System.out.println("L�tfen Emailinizi giriniz");
			return false;
		}
		else if(matcher.matches()==false) {
			System.out.println("Email adresinizi kontrol ediniz. �rnek: example@example.com");
			return false;
		}
		
		return true;
		
		
	}

	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().isEmpty()) {
			System.out.println("Parola alan� bo� b�rak�lamaz. L�tfen parola giriniz.");
			return false;
		}
		else if(user.getPassword().length()<6) {
			System.out.println("L�tfen parolan�z� en az 6 karakter olacak �ekilde d�zenleyiniz.");
			return false;
		}
		return true;
		
	}

	

	@Override
	public boolean isUniqueEMail(User user) {
		if(listOfMailAdresses.contains(user.geteMail())) {
			
			System.out.println("Kullan�c� sistemimizde kay�tl�d�r. Giri� yap�n�z veya ba�ka bir email adresi ile deneyiniz..");
		return false;
		}
		else {
			listOfMailAdresses.add(user.geteMail());
			return true;
		}
		
	}

	@Override
	public boolean isValid(User user) {
		if(checkFirstName(user)&&checkLastName(user)&&checkPassword(user)&& checkEMail(user)&& isUniqueEMail(user)) {
			return true;
		}
		return false;
	}

}
