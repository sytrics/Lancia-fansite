package com.example.lancia.controler;

import com.example.lancia.models.CartREPO;
import com.example.lancia.models.ProductREPO;
import com.example.lancia.models.Shoppingcart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Homecontroller {

    // simple mapping des pages sans backend
    @GetMapping({"/", "", "/index", "/index.html"})
    public String index() {
        return "index";
    }

    @GetMapping({"/history", "/history.html"})
    public String history() {
        return "history";
    }

    @GetMapping({"/membership", "/membership.html"})
    public String membership() {
        return "membership";
    }

    // mapping de Boutique

    @Autowired
    private ProductREPO repo;
    @Autowired
    public CartREPO cartREPO;

    @GetMapping({"/boutique", "/boutique.html"})
    public String boutique(Model model) {
        model.addAttribute("listProducts", repo.findAll());
        model.addAttribute("Cart", cartREPO.findAll() );
        model.addAttribute("repo", repo);
        int total =0;
         for (Shoppingcart cart : cartREPO.findAll()) {
             total += cart.getProduct(repo).getPrice()*cart.getQuantity();
         }
        model.addAttribute("total", total);
        return "boutique";
    }


    @GetMapping("/addToCart/{id}")
    @ResponseBody
    public Shoppingcart addCart(@PathVariable("id") int id) {   // methode pour ajouter un Product au Cart
        Shoppingcart bdditem = cartREPO.findByProductid(id);

        if (bdditem != null) {   // si l'element existe deja on modifie juste la quantité
            System.out.println("item modifié" + " " + bdditem.getProductid()+" "+ bdditem.getQuantity());
            bdditem.setQuantity(bdditem.getQuantity()+1);
            cartREPO.save(bdditem);
            return bdditem;
        }
        else {   // sinon on ajoute l'element
            Shoppingcart item = new Shoppingcart();
            item.setQuantity(1);
            item.setProductid(id);
            System.out.println("nouvel item" + " " + item.getProductid()+" "+ item.getQuantity());
            cartREPO.save(item);
            return item;
        }

    }

    @GetMapping("/remove/{id}")
    @ResponseBody
    public Shoppingcart remove(@PathVariable("id") int id) {  // methode pour enlever un Product au Cart
        Shoppingcart bdditem = cartREPO.findByProductid(id);

        if (bdditem.getQuantity()==1) {   // si il reste un seul élément, on l'enlève de Cart
            System.out.println("item à supprimer" + " " + bdditem.getProductid()+" "+ bdditem.getQuantity());
            cartREPO.delete(bdditem);
            return bdditem;
        }
        else  {  // sinon on diminue juste la quantité de 1
            System.out.println("item modifié" + " " + bdditem.getProductid()+" "+ bdditem.getQuantity());
            bdditem.setQuantity(bdditem.getQuantity()-1);
            cartREPO.save(bdditem);
            return bdditem;
        }

    }


}
