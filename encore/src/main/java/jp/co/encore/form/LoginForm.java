package jp.co.encore.form;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginForm
{
  @NotEmpty
  private String userID;
  @NotEmpty
  private String password;
  
  public String getUserID()
  {
    return this.userID;
  }
  
  public void setUserID(String userID)
  {
    this.userID = userID;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public void setPassword(String password)
  {
    this.password = password;
  }
}
