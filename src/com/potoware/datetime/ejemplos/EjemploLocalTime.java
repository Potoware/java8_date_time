package com.potoware.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class EjemploLocalTime {

    public static void main(String[] args) {

        LocalTime ahora = LocalTime.now();
        System.out.println("ahora = " + ahora);
        System.out.println("hora = " + ahora.getHour());
        System.out.println("minutos = " + ahora.getMinute());
        System.out.println("segundos = " + ahora.getSecond());
        System.out.println("milisegundos = " + ahora.getNano());

        LocalTime seisConTreinta = LocalTime.parse("18:30");
        System.out.println("seisConTreinta = " + seisConTreinta);
        
        LocalTime sieteConTreinta =LocalTime.from(seisConTreinta).plusHours(1);
        System.out.println("sieteConTreinta = " + sieteConTreinta);

        boolean esAnterior = LocalTime.of(6,30).isBefore( LocalTime.of(6,20));
        System.out.println("esAnterior = " + esAnterior);
    }
}
