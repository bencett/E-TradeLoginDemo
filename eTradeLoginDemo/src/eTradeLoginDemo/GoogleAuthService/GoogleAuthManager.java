package eTradeLoginDemo.GoogleAuthService;
import eTradeLoginDemo.entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Google ile kay�t olundu." + user.getePosta());
	}
	
	public void login(User user) {
		System.out.println("Google ile giri� yap�ld�." + user.getName());
	}
}
