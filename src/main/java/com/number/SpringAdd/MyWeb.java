package com.number.SpringAdd;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//alternate of web.xml file
public class MyWeb extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {AdditionServlet.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"} ;
		
	}

}
