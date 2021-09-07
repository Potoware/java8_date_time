package com.potoware.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class EjemploDuration {
    public static void main(String[] args) {

        LocalDateTime fecha1 = LocalDateTime.now();
        LocalDateTime fecha2 = LocalDateTime.now().plusDays(3).plusHours(11).plusMinutes(154);

        Duration lapsus = Duration.between(fecha1,fecha2);
        System.out.println("lapsus = " + lapsus);
        System.out.println("lapsus.plusHours(5) = " + lapsus.plusHours(5));


    }
}
