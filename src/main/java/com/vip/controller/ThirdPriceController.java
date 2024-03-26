package com.vip.controller;

import com.vip.model.Price;
import com.vip.model.PriceManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/app")
@SessionAttributes("priceManager")
public class ThirdPriceController {

    @ModelAttribute("price")
    public Price price() {
        log.info("price method called");
        return new Price();
    }
    
    @GetMapping("/priceThird")
    public String priceThird() {
        return "ThirdPrice";
    }

    @PostMapping("/priceThird")
    public String postPriceThird(Price price, @ModelAttribute PriceManager priceManager, SessionStatus sessionStatus) {
        log.info("price is {}", price);
        priceManager.addPrice(price);
        log.info("price manager is {}", priceManager);
        sessionStatus.setComplete();
        return "redirect: priceFirst";
    }
}
