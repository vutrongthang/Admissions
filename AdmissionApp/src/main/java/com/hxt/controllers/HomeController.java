/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hxt.controllers;

import com.hxt.pojo.Banners;
import com.hxt.service.AdmissionService;
import com.hxt.service.BannerService;
import com.hxt.service.FacultiesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;


/**
 *
 * @author vutrongthang
 */
@Controller
@Transactional
@ControllerAdvice
public class HomeController {
    @Autowired
    private FacultiesService facultiesService;
    @Autowired
    private BannerService bannerService;
    @Autowired
    private AdmissionService admissionService;
    
    @ModelAttribute
    public void commonAttributes(Model model){
        List<Banners> banners = this.bannerService.getBannerses();
        model.addAttribute("banners", banners);
    }
}
//public class HomeController {
//
//    @Autowired
//    private CategoryService categoryService;
//    @Autowired
//    private ProductService productService;
//
//    @ModelAttribute
//    public void commonAttributes(Model model) {
//        List<Category> cates = this.categoryService.getCategories();
//        model.addAttribute("categories", cates);
//
//    }
//
//    @RequestMapping("/")
//    public String index(Model model, @RequestParam Map<String, String> params) {
//        List<Products> products = this.productService.getProducts(params);
//        model.addAttribute("products", products);
//        return "index";
//    }
//
//    @GetMapping("/products/{productId}")
//    public String productDetail(Model model, @PathVariable(value = "productId") int id) {
//        model.addAttribute("products", this.productService.getProductById(id));
//        return "product-detail";
//    }
//}
