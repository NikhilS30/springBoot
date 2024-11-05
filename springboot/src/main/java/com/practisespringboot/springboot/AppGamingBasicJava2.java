package com.practisespringboot.springboot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practisespringboot.springboot.game.gameRunner;
import com.practisespringboot.springboot.game.marioGame;
import com.practisespringboot.springboot.game.pacMan;
import com.practisespringboot.springboot.game.superContraGame;

import ch.qos.logback.core.Context;

public class AppGamingBasicJava2 {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloworldBean.class);
		
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("Person2"));

	}

}
