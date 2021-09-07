package com.potoware.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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

        boolean esAnterior = LocalTime.of(6,30,20).isBefore( LocalTime.of(6,20,20));
        System.out.println("esAnterior = " + esAnterior);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String ahoraFormateado = seisConTreinta.format(df);
        System.out.println("ahoraFormateado = " + ahoraFormateado);
        
        ahoraFormateado = df.format(ahora);

        System.out.println("ahoraFormateado = " + ahoraFormateado);
        
        LocalTime max = LocalTime.MAX;
        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
