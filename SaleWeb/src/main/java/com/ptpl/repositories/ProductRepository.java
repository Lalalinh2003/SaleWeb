/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptpl.repositories;

import com.ptpl.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Linh
 */
public interface ProductRepository {
    List<Product> getProduct(Map<String, String> params);
    
}