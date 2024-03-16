package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Angajat> list = new ArrayList<>();

        list.add(new Angajat("Dan", "Director Sef", LocalDate.of(2021, 04, 4), 3000));
        list.add(new Angajat("Ion", "Worker", LocalDate.of(2022, 04, 02), 2501));
        list.add(new Angajat("Radu", "Worker", LocalDate.of(2022, 04, 02), 30));
        list.add(new Angajat("Vlad", "Worker", LocalDate.of(2022, 01, 02), 30));
        list.add(new Angajat("Gabi", "Sef", LocalDate.of(2021, 01, 02), 30));

        scriere(list);

        List<Angajat> readList = citire();

        for (Angajat a : readList) {
            System.out.println(a.toString());
        }

        System.out.println("=================================>2500");
        //Optional<Angajat> x = list.stream().findAny();
        list.stream()
                .filter(angajat -> angajat.getSalariu() > 2500)
                .forEach(System.out::println); //.collect(Collectors.toList());

        System.out.println("=================================April");
        List<Angajat> listApril = new ArrayList<>();
        listApril = list.stream()
                .filter(angajat -> angajat.getDataAngajarii().getMonth().getValue() == 4)
                .collect(Collectors.toList());

        for (Angajat a : listApril) {
            System.out.println(a.toString());
        }

        System.out.println("=================================Post");
        list.stream()
                .filter(angajat -> !angajat.getPostul().contains("Director") &&
                !angajat.getPostul().contains("Sef") || angajat.getPostul().contains("Director Sef"))
                .sorted(Comparator.comparing(Angajat::getSalariu).reversed())
                .forEach(System.out::println);

        System.out.println("=================================Upper");
        list.stream()
                .map(Angajat::getNume)
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }

    static void scriere(List<Angajat> lista) {
        try {

            ObjectMapper mapper = new ObjectMapper();

            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

            File file = new File("src/main/resources/angajat.json");
            mapper.writeValue(file, lista);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static @Nullable List<Angajat> citire() {
        try {
            File file = new File("src/main/resources/angajat.json");

            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

            List<Angajat> persoane = mapper.readValue(file, new TypeReference<List<Angajat>>() {
            });

            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}