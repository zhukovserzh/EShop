package view.impl;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;
import view.Menu;

import java.util.Scanner;

public class RegisterMenu implements Menu
{
    private static String[] menuItems = {"****User Registration****"};
    private static RegisterMenu instance;

    private RegisterMenu()
    {

    }

    synchronized public static RegisterMenu getInstance()
    {
        if (instance == null)
            instance = new RegisterMenu();

        return instance;
    }

    @Override
    public void show()
    {
        showItems(menuItems);
        input();
        MainMenu.getInstance().show();
    }

    public void input()
    {
        Scanner input = new Scanner(System.in);
        UserService userService = new UserServiceImpl();
        User newUser;
        String login, password, lastName, firstName, middleName, phone, email;
        int age;

        try
        {
            while (true)
            {
                System.out.println("Enter user login:");
                login = input.nextLine();

                if (userService.checkLogin(login))
                    break;
            }

            System.out.println("Enter user password:");
            password = input.nextLine();

            System.out.println("Enter user age:");
            age = Integer.parseInt(input.nextLine());

            System.out.println("Enter user phone:");
            phone = input.nextLine();

            System.out.println("Enter user email:");
            email = input.nextLine();

            System.out.println("Do you want to add additional user's info?");
            System.out.println("Y/N");
            String additionalInfo = input.nextLine().toUpperCase();

            if (additionalInfo.equals("Y"))
            {
                System.out.println("Enter user Last Name:");
                lastName = input.nextLine();

                System.out.println("Enter user First Name:");
                firstName = input.nextLine();

                System.out.println("Enter user Middle Name:");
                middleName = input.nextLine();

                newUser = new User(login, password, lastName, firstName, middleName, age, phone, email);
            }
            else
            {
                newUser = new User(login, password, age, phone, email);
            }

            userService.register(newUser);
        }
        catch(Exception exception)
        {
            show();
        }
    }
}
