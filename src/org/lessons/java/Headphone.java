package org.lessons.java;

import java.math.BigDecimal;

public class Headphone extends Product {
    public String color;
    public boolean wireless;

    public Headphone(String name, String brand, BigDecimal price, String color, boolean wireless) {
        super(name, brand, price);

        this.color = color;
        this.wireless = wireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

}
