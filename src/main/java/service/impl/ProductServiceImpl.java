package service.impl;

import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import model.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService
{
    ProductDao productDao = new ProductDaoImpl();
    Product product;

    @Override
    public boolean addProduct(Product product)
    {
        productDao.saveNewProduct(product);
    }

    @Override
    public boolean deleteProduct(Product product)
    {
        productDao.deleteExistingProduct(product.getId());
    }

    @Override
    public Product getProduct(long id)
    {
        return productDao.getProductById(id);
    }

    @Override
    public boolean modifyProduct(Product product)
    {
        productDao.updateExistingProduct(product);
    }

    @Override
    public void showAllProducts()
    {
        for (long i = 0; i <= Product.getCounter(); i++)
        {
            Product product = productDao.getProductById(i);
            if (product != null)
            {
                System.out.println(product);
            }
        }
    }
}
