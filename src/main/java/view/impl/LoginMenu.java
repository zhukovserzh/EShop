package view.impl;

import service.UserService;
import service.impl.UserServiceImpl;
import view.Menu;

import java.util.Scanner;

public class LoginMenu implements Menu
{
    private static String[] menuItems = {"****User Login****"};
    private static LoginMenu instance;

    private LoginMenu() {}

    synchronized public static LoginMenu getInstance()
    {
        if(instance == null)
            instance = new LoginMenu();

        return instance;
    }

    @Override
    public void show()
    {
        showItems(menuItems);
        input();
        MainMenu.getInstance().show();
    }

    @Override
    public void input()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user login:");
        String login = input.nextLine();

        System.out.println("Enter user password:");
        String password = input.nextLine();

        //input.close();

        UserService userService = new UserServiceImpl();

        if(!userService.login(login, password))
        {
            System.out.println("Repeat, please!");
            show();
        }
    }
}
