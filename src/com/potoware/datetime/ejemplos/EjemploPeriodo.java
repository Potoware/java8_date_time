package com.potoware.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriodo {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2014,11,23);
        LocalDate fecha2 = LocalDate.of(2021,9,07);
        fecha2.withMonth(12);

        Period periodo = Period.between(fecha1,fecha2);
        System.out.println("periodo = " + periodo);

    }
}
