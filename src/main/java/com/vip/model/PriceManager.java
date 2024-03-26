package com.vip.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PriceManager {
    private String name;
    private List<Price> prices = new ArrayList<Price>();
    public void addPrice(Price price) {
        prices.add(price);
    }

}
