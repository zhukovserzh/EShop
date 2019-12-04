package model;

public class User
{
    private String login; //unique
    private String password;
    private String lastName;
    private String firstName;
    private String middleName;
    private int age;
    private String phone;
    private String email;
    private UserRole role;

    //REGULAR User
    public User(String login, String password, int age, String phone, String email)
    {
        this.login = login;
        this.password = password;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.role = UserRole.REGULAR;
    }

    public User(String login, String password, String lastName, String firstName, String middleName,
         int age, String phone, String email)
    {
        this.login = login;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.role = UserRole.REGULAR;
    }

    //ADMIN User
    public User(String login, String password, int age, String phone, String email, UserRole role)
    {
        this.login = login;
        this.password = password;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }

    public User(String login, String password, String lastName, String firstName, String middleName,
         int age, String phone, String email, UserRole role)
    {
        this.login = login;
        this.password = password;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getMiddleName()
    {
        return middleName;
    }

    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public UserRole getRole()
    {
        return role;
    }

    public void setRole(UserRole role)
    {
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "User{" +
            "login=" + login + '\'' +
            ", password=" + password + '\'' +
            ", lastName=" + lastName + '\'' +
            ", firstName=" + firstName + '\'' +
            ", middleName=" + middleName + '\'' +
            ", age=" + age +
            ", phone=" + phone + '\'' +
            ", email=" + email + '\'' +
            ", role=" + role +
            '}';
    }
}
