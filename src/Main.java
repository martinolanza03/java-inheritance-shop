import java.math.BigDecimal;

import org.lessons.java.Headphone;
import org.lessons.java.Smartphone;
import org.lessons.java.Television;

public class Main {
    public static void main(String[] args) {

        Headphone cuffia = new Headphone("WH-1000XM4", "Sony", new BigDecimal("349.99"), "Nero", true);
        cuffia.setColor("Blu");
        cuffia.setWireless(false);
        cuffia.setPrice(new BigDecimal("299.99"));

        Smartphone smartphone = new Smartphone("Galaxy S24", "Samsung", new BigDecimal("999.99"), 256);
        smartphone.setMemory(512);
        smartphone.setPrice(new BigDecimal("1099.99"));

        Television tv = new Television("OLED CX", "LG", new BigDecimal("1499.99"), 55.0f, true);
        tv.setInch(65.0f);
        tv.setSmart(false);
        tv.setPrice(new BigDecimal("1399.99"));

        System.out.println("----- Cuffia -----");
        System.out.println("Codice: " + cuffia.getCode());
        System.out.println("Nome: " + cuffia.getName());
        System.out.println("Marca: " + cuffia.getBrand());
        System.out.println("Prezzo: " + cuffia.getPrice());
        System.out.println("Prezzo con IVA: " + cuffia.getIva());
        System.out.println("Colore: " + cuffia.getColor());
        System.out.println("Wireless: " + (cuffia.isWireless() ? "Sì" : "No"));

        System.out.println("\n----- Smartphone -----");
        System.out.println("Codice: " + smartphone.getCode());
        System.out.println("Nome: " + smartphone.getName());
        System.out.println("Marca: " + smartphone.getBrand());
        System.out.println("Prezzo: " + smartphone.getPrice());
        System.out.println("Prezzo con IVA: " + smartphone.getIva());
        System.out.println("IMEI: " + smartphone.getCodeIMEI());
        System.out.println("Memoria: " + smartphone.getMemory() + " GB");

        System.out.println("\n----- Televisione -----");
        System.out.println("Codice: " + tv.getCode());
        System.out.println("Nome: " + tv.getName());
        System.out.println("Marca: " + tv.getBrand());
        System.out.println("Prezzo: " + tv.getPrice());
        System.out.println("Prezzo con IVA: " + tv.getIva());
        System.out.println("Pollici: " + tv.getInch());
        System.out.println("Smart TV: " + (tv.isSmart() ? "Sì" : "No"));
    }
}
