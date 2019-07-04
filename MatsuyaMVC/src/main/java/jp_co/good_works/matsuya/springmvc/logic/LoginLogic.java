package jp_co.good_works.matsuya.springmvc.logic;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import jp_co.good_works.matsuya.springmvc.dao.UserDao;
import jp_co.good_works.matsuya.springmvc.form.LoginForm;

public class LoginLogic {
	
	UserDao ud = new UserDao();
	private LoginInfo loginInfo = null;
	LoginForm form = new LoginForm();
	
	public void login(String userId,String password)throws LoginException,SQLException, ClassNotFoundException{
		loginInfo = ud.select(userId, password);
		if(this.loginInfo==null){
		throw new LoginException("ユーザIDまたはパスワードが違います。");
		}
		
	}
	
	public boolean isLive() {
		if(this.loginInfo!=null) {
			return true;
		}
		return false;
	}

}
