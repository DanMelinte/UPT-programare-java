package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PerecheNumere> list = new ArrayList<>();

        list.add(new PerecheNumere(1,2));
        list.add(new PerecheNumere(3,4));
        list.add(new PerecheNumere(5,6));

        scriere(list);


        //List<PerecheNumere> readList = citire();

        //for ( PerecheNumere a : readList ) {
        //     System.out.println(a.toString());
        //}
    }

    static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("src/main/resources/PerecheNumere.json");
            mapper.writeValue(file, lista);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<PerecheNumere> citire() {
        try {
            File file = new File("src/main/resources/PerecheNumere.json");

            ObjectMapper mapper = new ObjectMapper();

            List<PerecheNumere> persoane = mapper.readValue(file, new TypeReference<List<PerecheNumere>>() {
            });

            return persoane;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
