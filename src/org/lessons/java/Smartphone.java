package org.lessons.java;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product {
    public int codeImei;
    public int memory;

    public Smartphone(String name, String brand, BigDecimal price, int memory) {
        super(name, brand, price);

        Random randomCode = new Random();
        this.codeImei = randomCode.nextInt(99999999);
        this.memory = memory;
    }

    public int getCodeIMEI() {
        return codeImei;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

}
