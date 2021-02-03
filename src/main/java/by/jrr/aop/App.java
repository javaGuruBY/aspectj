package by.jrr.aop;

import by.jrr.aop.aspects.Logging;
import by.jrr.aop.service.HumanService;
import by.jrr.aop.service.UserServiceI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        UserServiceI userService = (UserServiceI) ctx.getBean("UserService");
        HumanService humanService = (HumanService) ctx.getBean("HumanService");
        Logging logging = (Logging) ctx.getBean("Log");

        userService.createUser();
        System.out.println();
//        userService.updateUser();
//        try { userService.riskyOperationOnUser();}catch (Exception ex) {}
//        userService.simpleOperationOnUser("userName", "userNic");
    }
}
