package view.impl;

import view.Menu;

import java.util.Scanner;

public class MainMenu implements Menu
{
    private static String[] menuItems = {"****Product Store****",
                                    "Make your choise:",
                                    "1. Login",
                                    "2. Register",
                                    "0. Exit"};
    private static MainMenu instance;

    private MainMenu ()
    {

    }

    synchronized public static MainMenu getInstance()
    {
        if (instance == null)
            instance = new MainMenu();

        return instance;
    }

    @Override
    public void show()
    {
        showItems(menuItems);
        input();
    }

    public void input()
    {
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();
        //input.close();

        switch(choise)
        {
            case 1:
                LoginMenu.getInstance().show();
                break;
            case 2:
                RegisterMenu.getInstance().show();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Repeat your choice, please!");
                show();
                break;
        }
    }

}
