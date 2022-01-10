package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Service {

    public List<Offerte> sortListeTiereByName(List<Offerte> liste) {
        return liste.stream()
                //.sorted((offerte, otherOfferte) -> offerte.getPrice() > otherOfferte.getPrice())
                .collect(Collectors.toList());
    }
}
