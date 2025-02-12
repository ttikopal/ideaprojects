package es.ieslavereda.poo_avanzada.EjercicioHerencia3;

import java.time.LocalDate;

public class TestHerencia2 {
    public static void main(String[] args) {

        ProductoFresco p = new ProductoFresco(LocalDate.of(2025, 11, 25), 12345, LocalDate.of(2024, 01, 03), "España");

        System.out.println(p);

    }
}
