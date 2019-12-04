package view.impl;

import model.Product;
import model.User;
import service.ProductService;
import service.UserService;
import service.impl.ProductServiceImpl;
import service.impl.UserServiceImpl;
import view.Menu;

import java.util.Scanner;

public class ProductMenu implements Menu
{
    ProductService productService = new ProductServiceImpl();
    private static String[] menuItems = {"****Product Menu****",
                                        "Make your choise:",
                                        "1. Show all products",
                                        "2. Add product",
                                        "3. Modify product",
                                        "4. Delete product",
                                        "0. Exit"};
    private static ProductMenu instance;

    private ProductMenu()
    {

    }

    synchronized public static ProductMenu getInstance()
    {
        if (instance == null)
            instance = new ProductMenu();

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
        int choise = Integer.parseInt(input.nextLine());
        //input.close();

        switch(choise)
        {
            case 1:
                productService.showAllProducts(); //Show all products
                break;
            case 2:
                System.out.println("Adding new product.");
                addProductMenu();
                break;
            case 3:
                RegisterMenu.getInstance().show(); //Modify product
                break;
            case 4:
                RegisterMenu.getInstance().show(); //Delete product
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

    public void addProductMenu()
    {
        Scanner input = new Scanner(System.in);
        Product product;
        String name, description, productGroup, units;
        int quantity;

        try
        {
            System.out.println("Enter product name:");
            name = input.nextLine();

            System.out.println("Enter product quantity:");
            quantity = Integer.parseInt(input.nextLine());

            System.out.println("Enter product units:");
            units = input.nextLine();


            System.out.println("Do you want to add additional product's info?");
            System.out.println("Y/N");
            String additionalInfo = input.nextLine().toUpperCase();

            if (additionalInfo.equals("Y"))
            {
                System.out.println("Enter product description:");
                description = input.nextLine();

                System.out.println("Enter product group:");
                productGroup = input.nextLine();

                product = new Product(name, description, productGroup, quantity, units);
            }
            else
            {
                product = new Product(name, quantity, units);
            }

            productService.addProduct(product);
        }
        catch(Exception exception)
        {
            System.out.println("You enter incorrect data!");
            show();
        }
    }

    public void input()
    {
        Scanner input = new Scanner(System.in);
        ProductService productService = new ProductServiceImpl();
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
