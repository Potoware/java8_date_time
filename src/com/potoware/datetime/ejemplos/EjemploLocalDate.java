package com.potoware.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDate {

    public static void main(String[] args) {

        LocalDate fechaActual =  LocalDate.now();
        System.out.println(fechaActual);
        System.out.println("Dia del año = " + fechaActual.getDayOfYear());
        System.out.println("Dia de la semana = " + fechaActual.getDayOfWeek());
        System.out.println("Dia del mes = " + fechaActual.getDayOfMonth());
        System.out.println("Era = " + fechaActual.getEra());
        Month mes = fechaActual.getMonth();
        System.out.println("Numero mes = " + mes.getDisplayName(TextStyle.FULL,new Locale("es", "CO")));

        fechaActual = LocalDate.of(1998,05,02);
        System.out.println(fechaActual);

        fechaActual = LocalDate.of(2020, Month.FEBRUARY,11);
        System.out.println("fechaActual = " + fechaActual);

        fechaActual = LocalDate.parse("2020-04-01");
        System.out.println("fechaActual = " + fechaActual);
        
        LocalDate diaManiana = LocalDate.now().plusDays(1);
        System.out.println("diaManiana = " + diaManiana);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("mesAnteriorMismoDia = " + mesAnteriorMismoDia);

        String dia = LocalDate.parse("2020-11-10").getDayOfWeek().getDisplayName(TextStyle.FULL,new Locale("es","CO"));
        System.out.println("dia = " + dia);
        
        int once = LocalDate.of(2020,10,30).getDayOfMonth();
        System.out.println("once = " + once);
        
        boolean esBiciesto = LocalDate.now().isLeapYear();
        System.out.println("esBiciesto = " + esBiciesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2022-05-07"));
        System.out.println("esAntes = " + esAntes);
        

        boolean esDespues = LocalDate.now().isAfter(LocalDate.now().minusDays(10));
        System.out.println("esDespues = " + esDespues);


    }
}
