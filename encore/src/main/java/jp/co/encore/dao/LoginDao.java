package jp.co.encore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.encore.logic.LoginInfo;

public class LoginDao {
	public LoginInfo select(String userID, String password)
	        throws SQLException, ClassNotFoundException
	    {
	        LoginInfo loginInfo=null;
	        
	        String url ="jdbc:mysql://localhost/lesson2018" ;
			String id = "root";
	        String pass = "password";
	       
	        Connection cnct = null;
	        ResultSet rs  = null;
	        PreparedStatement pst = null;
	        
	        
	        Class.forName("com.mysql.jdbc.Driver");
	        cnct = DriverManager.getConnection(url, id, pass);
	        
	        
	        String quary = "select * from user where userId = ? and password = ?";
	        
	        pst = cnct.prepareStatement(quary);
	        pst.setString(1, userID);
	        pst.setString(2, password);
	        rs = pst.executeQuery();
	        
	        if(rs.next()){
	            loginInfo = new LoginInfo();
	            loginInfo.setUserID(userID);
	            loginInfo.setUserID(password);

	            System.out.println(userID);
	            System.out.println("--------------------");
	            System.out.println(password);
	        }
	        
	        	if(cnct != null)
	        		cnct.close();
	        	
	        	if(rs != null)
	        		rs.close();
	        	
	        	if(pst != null)
	        		pst.close();
	        
	       
	        return loginInfo;
	    }
	}

