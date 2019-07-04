package jp.co.encore.logic;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import jp.co.encore.dao.ItemDao;
import jp.co.encore.form.ItemForm;

public class ItemLogic {

	  ItemDao id = new ItemDao();
	  private ItemInfo iteminfo = null;
	  ItemForm itemform = new ItemForm();
	  
	  public void item(String name)
			  throws LoginException, SQLException, ClassNotFoundException{
		  
		  iteminfo = id.search(name);  

	    
	    if (iteminfo == null) {
	      throw new LoginException("äYìñÇ∑ÇÈè§ïiÇÕÇ≤Ç¥Ç¢Ç‹ÇπÇÒÇ≈ÇµÇΩÅB");
	    }
	  }
	
}
