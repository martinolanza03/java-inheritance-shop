package org.lessons.java;

import java.math.BigDecimal;

public class Television extends Product {
    private float inch;
    private boolean smart;

    public Television(String name, String brand, BigDecimal price, float inch, boolean smart) {
        super(name, brand, price);

        this.inch = inch;
        this.smart = smart;
    }

    public float getInch() {
        return inch;
    }

    public void setInch(float inch) {
        this.inch = inch;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Pollici: %.1f\", Smart: %s", this.getInch(), this.isSmart() ? "Si" : "No");
    }
}
