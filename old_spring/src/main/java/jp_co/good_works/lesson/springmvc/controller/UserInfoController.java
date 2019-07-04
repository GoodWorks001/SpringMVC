package jp_co.good_works.lesson.springmvc.controller;

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

import jp_co.good_works.lesson.springmvc.form.UserInfoForm;
@Controller
@Scope("session")
public class UserInfoController {
	private List<UserInfoForm> userinfoList= new ArrayList<UserInfoForm>();
	@RequestMapping(value = "/userinfo,method=RequestMethod.GET")
	public String UserInfo(Model model) {
		UserInfoForm form = new UserInfoForm();
		model.addAttribute("information","ユーザ情報を入力してください");
		model.addAttribute("userInfoForm");
		return"userinfo";
	}
	@RequestMapping(value="/userinfo",method= RequestMethod.POST)
	public String userinfo(Model model,
			@Validated@ModelAttribute UserInfoForm form,BindingResult result) {
		if(form.getName()==null||form.getAge()==null) {
			model.addAttribute("information","ユーザ情報が空です");
		}else {
			model.addAttribute("ユーザ情報を入力されました。");
			userinfoList.add(form);
			
		}
		if(result.hasErrors()) {
			model.addAttribute("information","エラーがあります");
		}else {
			model.addAttribute("information","ユーザ情報を入力されました。");
			userinfoList.add(form);
		}
		model.addAttribute("userInfoForm",form);
		model.addAttribute("userinfoList","userinfoList");
		return"prosuct";
	}
}
