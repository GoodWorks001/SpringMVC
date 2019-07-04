package jp.co.encore.controller;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.encore.form.LoginForm;
import jp.co.encore.logic.LoginLogic;



@Controller
@Scope("session")
public class LoginController
{
  private LoginLogic loginLogic = new LoginLogic();
  
  public boolean isLive()
  {
    return this.loginLogic.isLive();
  }
  
  @RequestMapping(value={"/login"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
  public String initializeLogin(Model model)
  {
    LoginForm form = new LoginForm();
    model.addAttribute("message", "ユーザー情報を入力してください");
    model.addAttribute("loginForm", form);
    return "login";
  }
  
  @RequestMapping(value={"/login"},
		  method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public String executeLogin
  (Model model, @Validated @ModelAttribute
		  LoginForm form, BindingResult result, RedirectAttributes redirectAttr)
    throws SQLException, ClassNotFoundException
  {
    if (!result.hasErrors())
    {
      try
      {
        this.loginLogic.login(form.getUserID(), form.getPassword());
        return "redirect:/item";
      }
      catch (LoginException e)
      {
        model.addAttribute("message", e.getLocalizedMessage());
      }
    }
    else
    {
      System.out.println("コンニチワ！");
      model.addAttribute("message", "ユーザID、Passwordを入力してください。");
    }
    return "login";
  }
}
