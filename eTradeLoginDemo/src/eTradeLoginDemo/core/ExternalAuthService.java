package eTradeLoginDemo.core;
import eTradeLoginDemo.entities.concretes.LoginDto;

public interface ExternalAuthService {
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
}
