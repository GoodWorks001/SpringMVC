package jp_co.good_works.matsuya.springmvc.controller.no_cert;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp_co.good_works.matsuya.springmvc.form.FoodForm;
import jp_co.good_works.matsuya.springmvc.logic.FoodLogic;

@Controller
@Scope("session")
public class FoodController {
	
	private FoodLogic foodLogic=new FoodLogic();
	List<FoodForm> foodFormList = new ArrayList<FoodForm>();
	
	public boolean isLive() {
		return this.foodLogic.isLive();
	}
	
	@RequestMapping(value="/food", method=RequestMethod.GET)
	public String food(Model model) {
		FoodForm form = new FoodForm();
	
	
		model.addAttribute("message","åüçıÇµÇΩÇ¢óøóùÇì¸óÕÇµÇƒÇ≠ÇæÇ≥Ç¢");
		model.addAttribute("foodForm",form);
		
		return "food";
	}
	
	
	@RequestMapping(value ="/food",method=RequestMethod.POST)
	public String outfood(Model model,@Validated @ModelAttribute FoodForm form, BindingResult result,RedirectAttributes redirectAttr) throws SQLException, ClassNotFoundException{
		
			try {
				foodLogic.food(form.getFood_type());
				return "redirect:/product";
			}catch(Exception ex) {
				model.addAttribute("message","åüçıÇµÇΩÇ¢óøóùÇ™ñ≥Ç¢Ç≈Ç∑ÅB");
			}
		
		return "food";
	}

}