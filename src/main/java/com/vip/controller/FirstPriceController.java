package com.vip.controller;

import com.vip.model.Price;
import com.vip.model.PriceManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/app")
@SessionAttributes("priceManager")
public class FirstPriceController {

    @ModelAttribute("priceManager")
    public PriceManager priceManager() {
        log.info("price manager called");
        PriceManager priceManager = new PriceManager();
        priceManager.setName("Vishal Mega Mart");
        return priceManager;
    }

    @ModelAttribute("price")
    public Price price() {
        log.info("price method called");
        return new Price();
    }

    @GetMapping("/priceFirst")
    public String priceFirst() {
        return "FirstPrice";
    }

    @PostMapping("/priceFirst")
    public String postPriceFirst(Price price, @ModelAttribute PriceManager priceManager) {
        log.info("price is {}", price);
        priceManager.addPrice(price);
        return "redirect: priceSecond";
    }
}
