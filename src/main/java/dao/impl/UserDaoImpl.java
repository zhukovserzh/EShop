package dao.impl;

import dao.UserDao;
import model.User;
import model.UserRole;

import java.util.HashMap;
import java.util.Map;

public class UserDaoImpl implements UserDao
{
    private static Map<String, User> users = new HashMap<>(); //user login, user
    static {
        users.put("admin", new User("admin", "admin", 0, "", "", UserRole.ADMIN));
    }

    @Override
    public User getUserByLogin(String login)
    {
        return users.get(login);
    }

    @Override
    public void updateExistingUser(User user)
    {
        users.replace(user.getLogin(), user);
    }

    @Override
    public void saveNewUser(User user)
    {
        users.put(user.getLogin(), user);
    }

    @Override
    public void deleteExistingUser(String login)
    {
        users.remove(login);
    }
}
