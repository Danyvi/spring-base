package xyz.codeandlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Developer developer = context.getBean(Developer.class);

//        developer.setAge(30);
//        System.out.println("Developer age is: " + developer.getAge());
        developer.buildSoftware();
    }
}
