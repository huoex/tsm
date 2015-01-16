package com.mybatis.models;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("applicationContext.xml");
		TcontactosDAO tdao = (TcontactosDAO)context.getBean("TcontactosDAO");
		//c
		Tcontactos tts = new Tcontactos();
		tts.setApellidos("a1");
		tts.setNombres("a2");
		tts.setNumeros("a3");
		//r
		tdao.selectAll();
		//u
		tdao.insert(tts);
		//d
		tdao.delete(3);
		System.out.println("End...");
	}

}
