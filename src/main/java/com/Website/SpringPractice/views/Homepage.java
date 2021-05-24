package com.Website.SpringPractice.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Website.SpringPractice.SpringPracticeApplication;
import com.Website.SpringPractice.config.Configuration;

@Controller
public class Homepage extends ViewHandler implements View {

	@Override
	@RequestMapping("/")
	public String clientRequest(Model model) {
		
		return getViewName(this, SpringPracticeApplication.appContext.getBean(Configuration.class));
	}

}
