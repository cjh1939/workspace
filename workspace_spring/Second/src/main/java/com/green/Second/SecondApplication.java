package com.green.Second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
	 ApplicationContext context = SpringApplication.run(SecondApplication.class, args);

	 //스프링 컨테이너가 만들어준 모든객체의 이름을 배열로 가져옴
	 String[] beenNames = context.getBeanDefinitionNames();

	 for(String beenName : beenNames){
		 Object beenType = context.getBean(beenName);
		 System.out.println("객체명 : " + beenName + ", 자료형 : " + beenType);
	 }

	}

}
