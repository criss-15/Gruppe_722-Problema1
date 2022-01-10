package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public List<Offerte> sortListeOffertePrice(List<Offerte> liste) {
        Comparator<Offerte> studentComparator = Comparator.comparing(Offerte::getPrice).reversed();
        return liste.stream().sorted(studentComparator).toList();
    }
}
