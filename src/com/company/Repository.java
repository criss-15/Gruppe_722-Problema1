package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Offerte> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;
        Offerte offerte;
        List<Offerte> listeOfferte = new ArrayList<>();
        while (line != null) {
            attributes = line.split(character);
            //offerte = new Offerte(attributes[0], attributes[1], attributes[2],attributes[3], attributes[4], Ort.valueOf(attributes[5]));
            //listeOfferte.add(offerte);

            line = bufferedReader.readLine();
        }

        return listeOfferte;
    }

    public void writeToFile(String fileName, List<Offerte> liste, String character) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (Offerte offerte : liste) {
            String line = offerte.getId() + character + offerte.getUnternehmensname() + character +
                    offerte.getPrice() + character + offerte.getMehrwertsteuer() + character + offerte.getAdresse() + character + offerte.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }

}
