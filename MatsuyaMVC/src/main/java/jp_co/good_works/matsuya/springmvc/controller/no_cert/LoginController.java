package jp_co.good_works.matsuya.springmvc.controller.no_cert;

import java.sql.SQLException;

import javax.security.auth.login.LoginException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp_co.good_works.matsuya.springmvc.form.LoginForm;
import jp_co.good_works.matsuya.springmvc.logic.LoginLogic;

@Controller
@Scope("session")
public class LoginController {
	
	private LoginLogic loginLogic = new LoginLogic();
	
	public boolean isLive() {
		return this.loginLogic.isLive();
	}
	
	@RequestMapping(value="/loginn",method=RequestMethod.GET)
	public String initializeLogin(Model model) {
		LoginForm form = new LoginForm();
		model.addAttribute("message","松屋へようこそ");
		model.addAttribute("loginForm",form);
		return "loginn";
	}
	
	@RequestMapping(value ="/loginn",method=RequestMethod.POST)
	public String executeLogin(Model model,@Validated @ModelAttribute LoginForm form, BindingResult result,RedirectAttributes redirectAttr) throws SQLException, ClassNotFoundException{
		if(!result.hasErrors()) {
			try {
				loginLogic.login(form.getUserId(), form.getPassword());
				return "redirect:/food";
			}catch(LoginException ex) {
				model.addAttribute("message",ex.getLocalizedMessage());
			}
		}else {
			model.addAttribute("message","ユーザID、パスワードを入力してください。");
		}
		return "loginn";
	}

}
