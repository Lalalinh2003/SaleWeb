/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ptpl.controllers;

import com.ptpl.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author admin
 */
public class HomeController {
    @Autowired
    private CategoryService cateServices;
    
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("categories", this.cateServices.getCates());
        return "index";
    }
    
}