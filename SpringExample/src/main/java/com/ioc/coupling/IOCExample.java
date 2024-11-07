package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCLooseCouplingExample.xml");
        UserManager userManager = (UserManager) context.getBean("userManagerWithUserDataProvider");
        System.out.println(userManager.getUserInfo());
    }
}
