package jp_co.good_works.matsuya.springmvc.controller.no_cert;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp_co.good_works.matsuya.springmvc.logic.FoodInfo;

@Controller
public class ProductController {
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public String hello(Model model) {
		
		FoodInfo fd = new FoodInfo();
		
		
		model.addAttribute("foodInfo",fd);
		model.addAttribute("message","è§ïiàÍóó");
		return "product";

}
}
