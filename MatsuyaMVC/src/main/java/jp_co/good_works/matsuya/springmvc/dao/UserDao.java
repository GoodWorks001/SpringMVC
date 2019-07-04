package jp_co.good_works.matsuya.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp_co.good_works.matsuya.springmvc.logic.LoginInfo;

public class UserDao {
	public UserDao() {
		
	}
	
	public LoginInfo select(String userId,String password) throws SQLException,ClassNotFoundException{
		LoginInfo loginInfo=null;
		
		String url="jdbc:mysql://localhost/lesson2018";
		String id="root";
		String pw="password";
		
		Connection cnct = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		Class.forName("com.mysql.jdbc.Driver");
		cnct= DriverManager.getConnection(url,id,pw);
		
		String quary ="SELECT * FROM user2 where userId=? and password=?";
		
		pst=cnct.prepareStatement(quary);
		pst.setString(1,userId);
		pst.setString(2,password);
		rs= pst.executeQuery();
		
		if(rs.next()) {
			loginInfo= new LoginInfo();
			loginInfo.setUserId(userId);
			loginInfo.setUserId(password);
		}
		
		if(rs!=null) rs.close();
		if(pst!=null) pst.close();
		if(cnct!=null) cnct.close();
		return loginInfo;
		
		}

}
