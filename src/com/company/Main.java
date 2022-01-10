package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args)   {

        Repository repo = new Repository();
        Service service = new Service();

        try {
        List<Offerte> listeOfferte = repo.readFromFile("C:\\Users\\orosc\\Desktop\\Problema1_Offerten\\src\\com\\company\\offerten.txt", "&");

        System.out.println(service.sortListeOffertePrice(listeOfferte));

        repo.writeToFile("C:\\Users\\orosc\\Desktop\\Problema1_Offerten\\src\\com\\company\\offertensortiert.txt", listeOfferte, "&");



    } catch (
    IOException e) {
        e.printStackTrace();
    }
}
}
