package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService
{
    private UserDao userDao = new UserDaoImpl();
    private User user;

    @Override
    public boolean login(String login, String password)
    {
        user = userDao.getUserByLogin(login);

        if (user == null)
        {
            System.out.println("User \"" + login + "\" isn't registered!");
            return false;
        }
        else
        {
            if (user.getPassword().equals(password))
            {
                System.out.println("User \"" + user.getLogin() + "\" is succesfully logged in!");
                return true;
            }
            else
            {
                System.out.println("Password is wrong for user \"" + user.getLogin() + "\"!");
                return false;
            }
        }

    }

    @Override
    public void register(User newUser)
    {
        userDao.saveNewUser(newUser);
        System.out.println("New user \"" + newUser.getLogin() + "\" is succesfully registered!");
    }

    public boolean checkLogin(String login)
    {
        user = userDao.getUserByLogin(login);

        if (user == null)
        {
            System.out.println("User login is accepted.");
            return true;
        }
        else
        {
            System.out.println("User login \"" + user.getLogin() + "\" is existed.");
            System.out.println("Please, repeat.");
            return false;
        }

    }
}
