package com.demo.jullia.springApp.dao.julliaDemo;

import com.demo.jullia.springApp.model.julliaDemo.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends CrudRepository<Product, Integer> {
    @Query(
            value = "SELECT * FROM product order by id desc",
            nativeQuery = true)
    List<Product> getListDesc();

    List<Product> findAll();
}
