package eTradeLoginDemo;
import eTradeLoginDemo.business.concretes.AuthManager;
import eTradeLoginDemo.business.concretes.UserManager;
import eTradeLoginDemo.core.AmazonMailManagerAdapter;
import eTradeLoginDemo.core.GoogleMailManagerAdapter;
import eTradeLoginDemo.dataAccess.concretes.InMemoryUserDao;
import eTradeLoginDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		//UserManager userManager=new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
				User cetin = new User(4, "Çetin", "Ürün", "cetinuru1@gmail.com", "123654", true);
				//userManager.add(cetin);
				
				InMemoryUserDao inMemoryUserDao = new InMemoryUserDao();
				GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
				AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

				
				AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));
				//authManager.register(cetin);
				authManager.register(cetin);
				UserManager userManager = new UserManager(inMemoryUserDao, amazonMailManagerAdapter);
				
				userManager.getAll();
				//userManager.getAll();		
				

	}

}
