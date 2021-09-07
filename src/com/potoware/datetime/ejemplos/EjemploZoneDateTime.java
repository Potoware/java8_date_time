package com.potoware.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class EjemploZoneDateTime {
    public static void main(String[] args) {


        LocalDateTime fechaLocal = LocalDateTime.parse("2021-11-20T03:12");
        ZoneId newyork = ZoneId.of("America/New_York");
        
        ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal,newyork);
        System.out.println("zonaNy = " + zonaNy);

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid =zonaNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("zonaMadrid = " + zonaMadrid);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalles del viaje a españa = ");
        System.out.println("Partida Nueva York: "+ f.format(zonaNy) );
        System.out.println("Llegada España: "+ f.format(zonaMadrid) );

    }
}
