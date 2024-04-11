package edu.webclass.restapi.Product.Management.System.repository;

import edu.webclass.restapi.Product.Management.System.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Repository
public class ProductRepository {
    public static ArrayList<Product> products= new ArrayList<>();
    public static int lastIndex=0;

    public ProductRepository(){
        products.add(new Product("Mobile","Samsung", 50000000));
        products.add(new Product("Cacke","TITOP!",10000));
    }

    public boolean createNewProduct(Product product){
        products.add(product);
        if(ProductRepository.lastIndex == ProductRepository.products.size()){
            return true;
        }else{
            return false;
        }
    }

    public List<Product> findAllProducts(){
        return products;
    }

    public Product getProductByName(String id){
        for (Product x : products) {
            if(x.getId().equals(id))
                return x;
        }
        return null;
    }
}
