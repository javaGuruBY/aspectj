package by.jrr.aop.service;

public interface UserServiceI {
    String createUser();
    void updateUser();
    void riskyOperationOnUser() throws Exception;
    void simpleOperationOnUser(String firstName, String lastName);
}
