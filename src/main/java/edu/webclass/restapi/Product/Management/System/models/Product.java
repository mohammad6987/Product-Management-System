package edu.webclass.restapi.Product.Management.System.models;

import edu.webclass.restapi.Product.Management.System.repository.ProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;

import javax.swing.*;

@Data
public class Product {
    private String id;
    private String title;
    private String brand;
    private int price;

    public Product(String title, String brand, int price) {
        this.title = title;
        this.brand = brand;
        this.price = price;
        this.id = "PRD_" + ProductRepository.lastIndex++;
    }

    /*public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }*/
}
