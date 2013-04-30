package com.erj.practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleniumException;

public class SeleniumHelloWorldITCase {
	private DefaultSelenium selenium;
	

	@Before
	public void setUp() throws Exception {
		selenium = createSeleniumClient("http://localhost:8888/");
		selenium.start();
	}
	
	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
	
	@Test
	public void helloWorldTest() throws Exception {
		try{
			selenium.open("http://localhost:8888/AcceptanceTesting/index.jsp");
			assertEquals("Hello, World!", selenium.getText("//h1"));
		}catch(SeleniumException e){
			fail(e.getMessage());
			throw e;
		}
	}
	
	protected DefaultSelenium createSeleniumClient(String url) throws Exception{
		return new DefaultSelenium("localhost", 4444, "*firefox", url);
	}

}
