package com.number.SpringAdd;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//alternate of servlet.xml file
@Configurable
@ComponentScan({"com.number.SpringAdd"})
public class AdditionServlet {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
