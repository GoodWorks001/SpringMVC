package jp_co.good_works.matsuya.springmvc.controller.no_cert;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {
	@RequestMapping(value="/first", method=RequestMethod.GET)
	public String first(Model model) {
	
	model.addAttribute("message","‚æ‚¤‚±‚»");
	return "first";
}


}
