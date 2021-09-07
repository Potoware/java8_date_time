package com.potoware.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now();
        System.out.println("fecha = " + fecha);
        
        fecha = LocalDateTime.of(2020,12,12,05,12,25,10);
        System.out.println("fecha = " + fecha);

        fecha = LocalDateTime.parse("2021-12-12T06:15:25.000000010");
        System.out.println("fecha = " + fecha);
        
        fecha = fecha.plusDays(25);
        System.out.println("fecha.minusDays(6000) = " + fecha.minusDays(6000));

        Month mes = fecha.getMonth();
        System.out.println("mes = " + mes.getDisplayName(TextStyle.FULL,new Locale("es","CO")));

        String formato1 = fecha.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formato1 = " + formato1);
    }
}
