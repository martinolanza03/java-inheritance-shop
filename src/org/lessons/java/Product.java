package org.lessons.java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    public Product(String name, String brand, BigDecimal price) {
        Random randomCode = new Random();
        this.code = randomCode.nextInt(999999999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = new BigDecimal(0.22);
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIva() {
        if (price != null && iva != null) {
            return price.multiply(iva.add(BigDecimal.ONE)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    @Override
    public String toString() {
        if (name != null) {
            return String.format("Prodotto: %s - Brand: %s - Prezzo: %s euro",
                    this.getName(),
                    this.getBrand(),
                    this.getPrice().setScale(2, RoundingMode.HALF_UP));
        }
        return "Prodotto non valido";
    }

}
