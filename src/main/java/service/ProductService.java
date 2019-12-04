package service;

import model.Product;

public interface ProductService
{
    boolean addProduct(Product product);
    boolean deleteProduct(Product product);
    Product getProduct(long id);
    boolean modifyProduct(Product product);
    void showAllProducts();
}
