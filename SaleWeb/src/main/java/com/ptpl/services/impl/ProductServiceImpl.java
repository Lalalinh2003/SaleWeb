/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptpl.services.impl;

import com.ptpl.pojo.Product;
import com.ptpl.repositories.ProductRepository;
import com.ptpl.services.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository prodRepo;
    @Override
    public List<Product> getProduct(Map<String, String> params) {
        return this.prodRepo.getProduct(params);
    }
    
}
