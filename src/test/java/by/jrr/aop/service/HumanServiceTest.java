package by.jrr.aop.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class HumanServiceTest {

    HumanService humanService;

    @BeforeEach
    public void setUp() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        humanService = (HumanService) ctx.getBean("HumanService");
    }

    @Test
    void createUser_shouldInjectBefore() {
        humanService.createUser();
    }

    @Test
    void updateUser() {
        humanService.updateUser();
    }

    @Test
    void riskyOperationOnUser() throws Exception {
        humanService.riskyOperationOnUser();
    }

    @Test
    void simpleOperationOnUser() {
        humanService.simpleOperationOnUser("Maksim", "Shelkovich");
    }
}
