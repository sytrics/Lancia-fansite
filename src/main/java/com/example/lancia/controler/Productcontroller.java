package com.example.lancia.controler;

import com.example.lancia.models.ProductREPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Productcontroller {

    @Autowired
    private ProductREPO repo;

    @GetMapping("/products")              // permet de visualiser la liste des produits
    public String viewHomePage(Model model) {
        model.addAttribute("listProducts", repo.findAll());

        return "/products/list";
    }

}
