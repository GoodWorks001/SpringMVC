package jp_co.good_works.matsuya.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp_co.good_works.matsuya.springmvc.logic.FoodInfo;

public class FoodDao {
	public FoodDao(){
		
	}
	
	public FoodInfo select(String food_type)throws SQLException,ClassNotFoundException{
		FoodInfo foodInfo = null;
		
		String url = "jdbc:mysql://localhost/lesson2018";
		String id="root";
		String pw="password";
		
		Connection cnct=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		
		Class.forName("com.mysql.jdbc.Driver");
		cnct=DriverManager.getConnection(url,id,pw);
		
		String quary="select * from menu where food_type=?";
		
		pst=cnct.prepareStatement(quary);
		pst.setString(1, food_type);

			foodInfo=new FoodInfo();
			foodInfo.setFood_type(food_type);
			
			System.out.println("------------------------");
			System.out.println(food_type);

		
		if(rs!=null) rs.close();
		if(pst!=null) pst.close();
		if(cnct!=null) cnct.close();
		return foodInfo;
	}

}
