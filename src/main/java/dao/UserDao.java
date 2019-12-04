package dao;

import model.User;

public interface UserDao
{
    User getUserByLogin(String login);
    void updateExistingUser(User user);
    void saveNewUser(User user);
    void deleteExistingUser(String login);

}
