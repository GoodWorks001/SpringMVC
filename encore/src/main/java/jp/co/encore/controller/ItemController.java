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

import jp.co.encore.form.ItemForm;
import jp.co.encore.logic.ItemLogic;



@Controller
@Scope("session")
public class ItemController {

	
	  private ItemLogic itemlogic = new ItemLogic();
	  

	  @RequestMapping(value={"/item"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	  public String initializeLogin(Model model)
	  {
	    ItemForm form = new ItemForm();
	    model.addAttribute("message", "検索してください！");
	    model.addAttribute("itemForm", form);
	    return "item";
	  }
	  
	  @RequestMapping(value={"/item"},
			  method={org.springframework.web.bind.annotation.RequestMethod.POST})
	  public String executeI
	  (Model model, @Validated @ModelAttribute
			  ItemForm form, BindingResult result, RedirectAttributes redirectAttr)
	    throws SQLException, ClassNotFoundException
	  {
	    if (!result.hasErrors())
	    {
	      try
	      {
	        this.itemlogic.item(form.getName());
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
	    return "item";
	  }
	
}
