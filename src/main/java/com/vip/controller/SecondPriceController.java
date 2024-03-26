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
public class SecondPriceController {

    @ModelAttribute("price")
    public Price price() {
        log.info("price method called");
        return new Price();
    }

    @GetMapping("/priceSecond")
    public String priceSecond() {
        return "SecondPrice";
    }

    @PostMapping("/priceSecond")
    public String postPriceSecond(Price price, @ModelAttribute PriceManager priceManager) {
        log.info("price is {}", price);
        priceManager.addPrice(price);
        return "redirect: priceThird";
    }
}
