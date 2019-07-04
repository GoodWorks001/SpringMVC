package jp.co.encore.logic;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import jp.co.encore.dao.LoginDao;
import jp.co.encore.form.LoginForm;

public class LoginLogic {

	
	LoginDao ud = new LoginDao();
	  private LoginInfo loginInfo = null;
	  LoginForm loginForm = new LoginForm();

	  public void login(String userID, String password)
			  throws LoginException, SQLException, ClassNotFoundException{
		  
		  loginInfo = ud.select(userID, password);  

	    
	    if (loginInfo == null) {
	      throw new LoginException("ユーザーIDまたは、PassWordが違います。");
	    }
	  }
	  
	  public boolean isLive(){
	    if (this.loginInfo != null) {
	      return true;
	    }
	    return false;
	  }
}

