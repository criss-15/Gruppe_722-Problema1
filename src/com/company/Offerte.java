package com.company;

public class Offerte {

    private int id;
    private String unternehmensname;
    private int price;
    private double mehrwertsteuer;
    private String adresse;
    private Ort ort;

    public Offerte(int id, String unternehmensname, int price, double mehrwertsteuer, String adresse, Ort ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.price = price;
        this.mehrwertsteuer = mehrwertsteuer;
        this.adresse = adresse;
        this.ort = ort;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getMehrwertsteuer() {
        return mehrwertsteuer;
    }
    //

    public void setMehrwertsteuer(double mehrwertsteuer) {
        this.mehrwertsteuer = mehrwertsteuer;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Offerte{" +
                "id=" + id +
                ", unternehmensname='" + unternehmensname + '\'' +
                ", price=" + price +
                ", mehrwertsteuer=" + mehrwertsteuer +
                ", adresse='" + adresse + '\'' +
                ", ort=" + ort +
                '}';
    }
}
