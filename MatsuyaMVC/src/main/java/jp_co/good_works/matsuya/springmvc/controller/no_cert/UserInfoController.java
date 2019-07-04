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

	model.addAttribute("message","���[�U�[������͂��Ă�������");
	model.addAttribute("UserInfoFormList",userInfoFormList);
	
	genders.add("�j");
	genders.add("��");
	model.addAttribute("genders",genders);
	
	favoriteLang.add("�H�ׂ�");
	favoriteLang.add("�Q��");
	favoriteLang.add("���s");
	favoriteLang.add("������ǂ�");
	favoriteLang.add("���������");
	favoriteLang.add("�ʐ^���B��");
	model.addAttribute("favoriteLang",favoriteLang);

	
	birthplace.add("�l���");
	birthplace.add("�����]��");
	birthplace.add("�k�C��");
	birthplace.add("���k");
	birthplace.add("�֓�");
	birthplace.add("����");
	birthplace.add("�ߋE");
	birthplace.add("��B");
	birthplace.add("�l��");
	model.addAttribute("birthplace",birthplace);
	
	model.addAttribute("message","welcome��");
	model.addAttribute("userInfoForm",form);
	return "userinfo";
	}
	
	@RequestMapping(value={"/userinfo"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
	public String userInfo(Model model,@Validated @ModelAttribute UserInfoForm form, BindingResult result) {
		
		 List<String> genders= new ArrayList<String>();
	     List<String> birthplace = new ArrayList<String>();
	     List<String> favoriteLangs = new ArrayList<String>();
	     
	     
	     
	     genders.add("�j");
	     genders.add("��");
	 	model.addAttribute("genders",genders);
	 	
		favoriteLangs.add("�H�ׂ�");
		favoriteLangs.add("�Q��");
		favoriteLangs.add("���s");
		favoriteLangs.add("������ǂ�");
		favoriteLangs.add("���������");
		favoriteLangs.add("�ʐ^���B��");
		model.addAttribute("favoriteLang",favoriteLangs);

	 	
		birthplace.add("�l���");
		birthplace.add("�����]��");
		birthplace.add("�k�C��");
		birthplace.add("���k");
		birthplace.add("�֓�");
		birthplace.add("����");
		birthplace.add("�ߋE");
		birthplace.add("��B");
		birthplace.add("�l��");
		model.addAttribute("birthplace",birthplace);

	 	if(result.hasErrors()) {
	 		 System.out.println("----------------");
	            System.out.println(result.getObjectName());
	            System.out.println("----------------");
	        } else
	        {
	            model.addAttribute("message", "welcome��");
	            this.userInfoFormList.add(form);
	        }
	        model.addAttribute("userInfoFormList", this.userInfoFormList);
	        model.addAttribute("userInfoForm", form);
	        return "userinfo";
	    }
	}

