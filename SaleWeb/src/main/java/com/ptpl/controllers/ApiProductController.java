/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptpl.controllers;

import com.ptpl.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
@RestController
public class ApiProductController {
    @Autowired
    private ProductService proService;
    
    @DeleteMapping("/products/{productId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Model model, @PathVariable(value = "productId") int id) {
        this.proService.deleteProduct(id);
    }
}
