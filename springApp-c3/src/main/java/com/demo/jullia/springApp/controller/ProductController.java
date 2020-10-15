package com.demo.jullia.springApp.controller;

import com.demo.jullia.springApp.dao.julliaDemo.ProductDao;
import com.demo.jullia.springApp.model.julliaDemo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductDao productDao;

    @GetMapping("/product")
    @ResponseBody
    public Product insertDummyProduct(){
        Product product = new Product();
        product.setName("telefon");
        product.setPrice(10);
        return productDao.save(product);
    }

    @GetMapping("/getProdcts")
    @ResponseBody
    public List<Product> getListProducts(){

        return productDao.getListDesc();
    }
}
