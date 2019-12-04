package dao;

import model.Product;

public interface ProductDao
{
    Product getProductById(long id);
    void updateExistingProduct(Product product);
    void saveNewProduct(Product product);
    void deleteExistingProduct(long id);
}
