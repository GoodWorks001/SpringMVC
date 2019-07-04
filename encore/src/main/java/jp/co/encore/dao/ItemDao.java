package jp.co.encore.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.encore.logic.ItemInfo;


public class ItemDao {

	
	public ItemInfo search(String name)
	        throws SQLException, ClassNotFoundException
	    {
	        ItemInfo iteminfo = null;
	        
	        String url ="jdbc:mysql://localhost/lesson2018" ;
			String id = "root";
	        String pass = "password";
	       
	        Connection cnct = null;
	        ResultSet rs  = null;
	        PreparedStatement pst = null;
	        
	        
	        Class.forName("com.mysql.jdbc.Driver");
	        cnct = DriverManager.getConnection(url, id, pass);
	        
	        
	        String quary = "select * from item where name = like % ? % ";
	        
	        pst = cnct.prepareStatement(quary);
	        pst.setString(1, name);
	        rs = pst.executeQuery();
	        
	        if(rs.next()){
	            iteminfo = new ItemInfo();
	            iteminfo.setName(name);

	            System.out.println(name);
	        }
	        
	        	if(cnct != null)
	        		cnct.close();
	        	
	        	if(rs != null)
	        		rs.close();
	        	
	        	if(pst != null)
	        		pst.close();
	        
	       
	        return iteminfo;
	    }
}
