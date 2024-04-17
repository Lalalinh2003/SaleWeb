/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptpl.services.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.ptpl.pojo.Product;
import com.ptpl.repositories.ProductRepository;
import com.ptpl.services.ProductService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository prodRepo;
    private Cloudinary cloudinary;
    @Override
    public List<Product> getProduct(Map<String, String> params) {
        return this.prodRepo.getProduct(params);
    }

    @Override
    public void addOrUpdate(Product p) {
        if (!p.getFile().isEmpty()) {
            try {
                Map res = this.cloudinary.uploader().upload(p.getFile().getBytes(), ObjectUtils.asMap("resource_type", "auto"));
                p.setImage(res.get("secure_url").toString());
            } catch (IOException ex) {
                Logger.getLogger(ProductServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.prodRepo.addOrUpdate(p);
    }

    @Override
    public Product getProductById(int id) {
        return this.prodRepo.getProductById(id);
    }

    @Override
    public void deleteProduct(int id) {
        this.prodRepo.deleteProduct(id);
    }
    
    
    
}
