package service;

import model.User;

public interface UserService
{
    boolean login(String login, String password);
    void register(User newUser);
    boolean checkLogin(String login);
}
