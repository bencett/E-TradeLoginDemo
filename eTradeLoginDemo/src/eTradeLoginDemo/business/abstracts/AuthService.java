package eTradeLoginDemo.business.abstracts;
import eTradeLoginDemo.entities.concretes.LoginDto;
import eTradeLoginDemo.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user, String token);
	boolean userExists(String email);
	void login(LoginDto dto);
}
