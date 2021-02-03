package by.jrr.aop.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserServiceI userService;

    @BeforeEach
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        userService = (UserServiceI) ctx.getBean("UserService");
    }

    @Test
    void createUser_shouldInjectBefore() {
        userService.createUser();
    }

    @Test
    void updateUser() {
        userService.updateUser();
    }

    @Test
    void riskyOperationOnUser() throws Exception {
        userService.riskyOperationOnUser();
    }

    @Test
    void simpleOperationOnUser() {
        userService.simpleOperationOnUser("Maksim", "Shelkovich");
    }
}
