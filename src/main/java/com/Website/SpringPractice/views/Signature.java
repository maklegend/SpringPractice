package com.Website.SpringPractice.views;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Website.SpringPractice.SpringPracticeApplication;
import com.Website.SpringPractice.config.Configuration;

/**
 * Class used for routing signature requests
 * 
 * @author Matthew Arnold
 *
 */
@Controller
public class Signature extends ViewHandler implements View {

	@Override
	@RequestMapping("/signature")
	public String clientRequest(Model model) {
		
		return getViewName(this, SpringPracticeApplication.appContext.getBean(Configuration.class));
	}

}
