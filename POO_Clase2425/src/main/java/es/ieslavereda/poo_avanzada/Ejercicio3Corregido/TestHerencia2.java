package es.ieslavereda.poo_avanzada.Ejercicio3Corregido;

import java.time.LocalDate;

public class TestHerencia2 {
    public static void main(String[] args) {

        ProductoCongelado c = new ProductoCongelado(LocalDate.of(2025, 12, 01), 89754, 10);
        ProductoFresco p = new ProductoFresco(LocalDate.of(2025, 11, 25), 12345, LocalDate.of(2024, 01, 03), "España");
        ProductoRefrigerado r = new ProductoRefrigerado(LocalDate.of(2026, 12, 10), 65484, "SDFI1564");

        System.out.println(c);
        System.out.println(p);
        System.out.println(r);

    }
}
