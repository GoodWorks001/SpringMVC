package jp_co.good_works.matsuya.springmvc.controller.no_cert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp_co.good_works.matsuya.springmvc.form.UserInfoForm;

@Controller
@Scope("session")
public class UserInfoController {
	
	List<UserInfoForm> userInfoFormList = new ArrayList<UserInfoForm>();
	
	@RequestMapping(value={"/userinfo"}, method={org.springframework.web.bind.annotation.RequestMethod.GET})
	public String userInfo(Model model) {
		
	UserInfoForm form = new UserInfoForm();

	List<String> genders =new ArrayList<String>();
	List<String> birthplace=new ArrayList<String>();
	List<String> favoriteLang=new ArrayList<String>();

	model.addAttribute("message","ƒ†[ƒU[î•ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
	model.addAttribute("UserInfoFormList",userInfoFormList);
	
	genders.add("’j");
	genders.add("—");
	model.addAttribute("genders",genders);
	
	favoriteLang.add("H‚×‚é");
	favoriteLang.add("Q‚é");
	favoriteLang.add("—·s");
	favoriteLang.add("¬à‚ğ“Ç‚Ş");
	favoriteLang.add("—¿—‚ğì‚é");
	favoriteLang.add("Ê^‚ğB‚é");
	model.addAttribute("favoriteLang",favoriteLang);

	
	birthplace.add("lìÈ");
	birthplace.add("•—³]È");
	birthplace.add("–kŠC“¹");
	birthplace.add("“Œ–k");
	birthplace.add("ŠÖ“Œ");
	birthplace.add("’†•”");
	birthplace.add("‹ß‹E");
	birthplace.add("‹ãB");
	birthplace.add("l‘");
	model.addAttribute("birthplace",birthplace);
	
	model.addAttribute("message","welcome‚æ");
	model.addAttribute("userInfoForm",form);
	return "userinfo";
	}
	
	@RequestMapping(value={"/userinfo"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	public String userInfo(Model model,@Validated @ModelAttribute UserInfoForm form, BindingResult result) {
		
		 List<String> genders= new ArrayList<String>();
	     List<String> birthplace = new ArrayList<String>();
	     List<String> favoriteLangs = new ArrayList<String>();
	     
	     
	     
	     genders.add("’j");
	     genders.add("—");
	 	model.addAttribute("genders",genders);
	 	
		favoriteLangs.add("H‚×‚é");
		favoriteLangs.add("Q‚é");
		favoriteLangs.add("—·s");
		favoriteLangs.add("¬à‚ğ“Ç‚Ş");
		favoriteLangs.add("—¿—‚ğì‚é");
		favoriteLangs.add("Ê^‚ğB‚é");
		model.addAttribute("favoriteLang",favoriteLangs);

	 	
		birthplace.add("lìÈ");
		birthplace.add("•—³]È");
		birthplace.add("–kŠC“¹");
		birthplace.add("“Œ–k");
		birthplace.add("ŠÖ“Œ");
		birthplace.add("’†•”");
		birthplace.add("‹ß‹E");
		birthplace.add("‹ãB");
		birthplace.add("l‘");
		model.addAttribute("birthplace",birthplace);

	 	if(result.hasErrors()) {
	 		 System.out.println("----------------");
	            System.out.println(result.getObjectName());
	            System.out.println("----------------");
	        } else
	        {
	            model.addAttribute("message", "welcome‚æ");
	            this.userInfoFormList.add(form);
	        }
	        model.addAttribute("userInfoFormList", this.userInfoFormList);
	        model.addAttribute("userInfoForm", form);
	        return "userinfo";
	    }
	}

