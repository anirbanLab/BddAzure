package com.anirban.framework.selenium.core;

public class PageObject {

	
	public PageObject(String sPage) {
		this.pageName=sPage;
	}
	private String pageName="";
	
	public String getPageName() {
		return pageName; 
	}
	
	//add loggers..
}
