package com.Website.SpringPractice.views;

import com.Website.SpringPractice.config.Configuration;

/**
 * 
 * @author Matthew Arnold
 *
 * Abstract class for handling View object variables. These variables can include View names, as well as other objects.
 *
 */
public abstract class ViewHandler {
	
	public String getViewName(View view, Configuration configuration) {
		
		return configuration.getApplicationProperties().getProperty(view.getClass().toString());
	}

}
