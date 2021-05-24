package com.Website.SpringPractice.views;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Website.SpringPractice.SpringPracticeApplication;
import com.Website.SpringPractice.appmodels.RegistrationModel;
import com.Website.SpringPractice.config.Configuration;

@Controller
public class Registration extends ViewHandler implements View{

	@Override
	@GetMapping("/registration")
	public String clientRequest(Model model) {
		
		model.addAttribute("registrationModel", new RegistrationModel());//add the object to the model & return it's name
		return getViewName(this, SpringPracticeApplication.appContext.getBean(Configuration.class));
	}
	
	@PostMapping("/registration")
	public String submission(@ModelAttribute RegistrationModel registrationModel, Model model) {
		
		List<RegistrationModel> registrants = new ArrayList<>();
		registrants.add(registrationModel);
		
		model.addAttribute("registrantsList", registrants);
		return "Registrants.html";
	}
}
