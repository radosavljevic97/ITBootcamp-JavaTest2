package Telefonija;

public abstract class Usluga {
    protected Broj brojOd;
    protected Broj brojKa;

    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    public Broj getBrojOd() {
        return brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(brojOd);
        sb.append("->");
        sb.append(brojKa);
        sb.append("\n");

        return sb.toString();
    }

    public abstract double cenaUsluge();
}
