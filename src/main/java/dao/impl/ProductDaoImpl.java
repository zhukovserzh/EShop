package dao.impl;

import dao.ProductDao;
import model.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductDaoImpl implements ProductDao
{
    private static Map<Long, Product> products = new HashMap();

    @Override
    public Product getProductById(long id)
    {
        return products.get(id);
    }

    @Override
    public void updateExistingProduct(Product product)
    {
        products.replace(product.getId(), product);
    }

    @Override
    public void saveNewProduct(Product product)
    {
        products.put(product.getId(), product);
    }

    @Override
    public void deleteExistingProduct(long id)
    {
        products.remove(id);
    }
}
