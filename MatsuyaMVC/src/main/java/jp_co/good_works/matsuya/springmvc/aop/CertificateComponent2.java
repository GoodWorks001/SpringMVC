package jp_co.good_works.matsuya.springmvc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.WebContentGenerator;

import jp_co.good_works.matsuya.springmvc.controller.no_cert.FoodController;


@Aspect
@Component
public class CertificateComponent2 extends WebContentGenerator {
	public String checkAuthenticated(ProceedingJoinPoint joinPoint)throws Throwable{
		FoodController foodController = (FoodController)getApplicationContext().getBean(FoodController.class);
		if(foodController.isLive()) {
			return (String) joinPoint.proceed();
		}
		return "redirect:/food";
	}

}
