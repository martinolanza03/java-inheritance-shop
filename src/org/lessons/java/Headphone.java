package org.lessons.java;

import java.math.BigDecimal;

public class Headphone extends Product {
    private String color;
    private boolean wireless;

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

    @Override
    public String toString() {
        return super.toString()
                + String.format("Cuffie color %s, Wireless: %s ", this.getColor(), this.isWireless() ? "Si" : "No");
    }

}
