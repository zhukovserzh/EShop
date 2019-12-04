package model;

public class Product
{
    private static long counter = 0;
    private long id; //unique
    private String name;
    private String description;
    private String productGroup;
    private long quantity;
    private String units;

    public Product(String name, long quantity, String units)
    {
        this.id = ++counter;
        this.name = name;
        this.description = "";
        this.productGroup = "Not Defined";
        this.quantity = quantity;
        this.units = units;
    }

    public Product(String name, String description, String productGroup, long quantity, String units)
    {
        this.id = ++counter;
        this.name = name;
        this.description = description;
        this.productGroup = productGroup;
        this.quantity = quantity;
        this.units = units;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public static long getCounter()
    {
        return counter;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getProductGroup()
    {
        return productGroup;
    }

    public void setProductGroup(String productGroup)
    {
        this.productGroup = productGroup;
    }

    public long getQuantity()
    {
        return quantity;
    }

    public void setQuantity(long quantity)
    {
        this.quantity = quantity;
    }

    public String getUnits()
    {
        return units;
    }

    public void setUnits(String units)
    {
        this.units = units;
    }

    @Override
    public String toString()
    {
        return "Product{" +
            "id=" + id + '\'' +
            "name=" + name + '\'' +
            ", description=" + description + '\'' +
            ", productGroup=" + productGroup + '\'' +
            ", quantity=" + quantity +
            ", units=" + units + '\'' +
            '}';
    }
}
