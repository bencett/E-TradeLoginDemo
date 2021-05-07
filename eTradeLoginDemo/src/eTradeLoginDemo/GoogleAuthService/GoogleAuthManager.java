package eTradeLoginDemo.GoogleAuthService;
import eTradeLoginDemo.entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println("Google ile kayýt olundu." + user.getePosta());
	}
	
	public void login(User user) {
		System.out.println("Google ile giriþ yapýldý." + user.getName());
	}
}
