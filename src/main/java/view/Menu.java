package view;

public interface Menu
{
    void show();
    void input();

    default void exit()
    {
        System.exit(0);
    }

    default void showItems(String[] items) {
        for (String item : items) {
            System.out.println(item);
        }
    }
}
