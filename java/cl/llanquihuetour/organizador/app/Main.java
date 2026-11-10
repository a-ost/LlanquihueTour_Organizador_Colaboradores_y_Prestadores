package cl.llanquihuetour.organizador.app;

import cl.llanquihuetour.organizador.model.*;

public class Main {
    public static void main(String[] args){
        DIRECCION d1 = new DIRECCION("Av. Francisco Iero", "Llanquihue", 2025);
        DIRECCION d2 = new DIRECCION("Elton Charquican", "Puerto Varas", 45);
        DIRECCION d3 = new DIRECCION("Ruta v-55 km 9", "Llanquihue", 11);
        DIRECCION d4 = new DIRECCION("Fernando Acosta", "Puerto Montt", 78);

        GUIAS guia = new GUIAS("Fabiola Puentes", "19.564.231-2", "994651327", d1,"Español, Ingles", "Lago Llanquihue");
        OPERADORES operador = new OPERADORES ("Lucia Dacus", "19.785.123-2", "99785351", "Paseo en kyak", "1500 Por persona");
        PROVALOJAMIENTO alojamiento = new PROVALOJAMIENTO("Cabañas Elton Gatito", "85.246.167-8", "99544628", d3, "Cabañas", 5, 12500);
        PROVTRANSPORTE transporte = new PROVTRANSPORTE("Transportes patito", "78.124.333-6", "224568943", d4, "Bus", 55, 1000);

        System.out.println("==== COLABORADORES =====");
        System.out.println(guia);
        System.out.println(operador);

        System.out.println("\n====== PROVEEDORES ======");
        System.out.println(alojamiento);
        System.out.println(transporte);

        System.out.println("\n===== DATOS MODIFICADOS=====");
        guia.setSector("Frutillar");
        operador.setServicio("Trekking");
        System.out.println(guia);
        System.out.println(operador);














    }
}
