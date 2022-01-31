package Telefonija;

import java.util.ArrayList;

public class Korisnik {
    private static int NextId = 1;
    protected int id;
    protected String ime;
    protected String prezime;
    protected Broj broj;
    protected ArrayList<Usluga> istorijaUsluga;

    public Korisnik(String ime, String prezime, Broj broj) {
        this.ime = ime;
        this.prezime = prezime;
        this.broj = broj;
        this.istorijaUsluga = new ArrayList<>();
        this.id = NextId;
        NextId++;
    }

    public static int getNextId() {
        return NextId;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Broj getBroj() {
        return broj;
    }

    public ArrayList<Usluga> getIstorijaUsluga() {
        return istorijaUsluga;
    }

    public static void setNextId(int nextId) {
        NextId = nextId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setBroj(Broj broj) {
        this.broj = broj;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" ").append(broj).append("\n");
        sb.append("Istorija usluga: ").append("\n");

        for(Usluga u : istorijaUsluga){
            sb.append(u.toString());
            sb.append("\n");
        }

        return sb.toString();
    }


    public void posaljiPoruku(Broj broj, String tekstPoruke){
        String poruka = broj.toString() + tekstPoruke.toString();
        istorijaUsluga.add(id, tekstPoruke);
    }

    /* public void pozovi(Broj broj, Poziv trajanjeUSekundam){
        String poziv = broj.toString() + trajanjeUSekundam.toString();
        istorijaUsluga.add();
    } */


    public double cenaSvihUsluga(){
        double suma = 0;
        for(Usluga u : istorijaUsluga){
            suma = suma + u.cenaUsluge();
        }
        return suma;
    }


}
