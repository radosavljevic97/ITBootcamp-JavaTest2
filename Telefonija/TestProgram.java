package Telefonija;

public class TestProgram {
    public static void main(String[] args) {

        Broj b1 = new Broj("381","64", "6425921",false);
        Broj b2 = new Broj("381", "63", "3005001", false);

        Korisnik k1 = new Korisnik("Stefan", "Radosavljevic",b1);
        Korisnik k2 = new Korisnik("Dusan", "Tomic", b2);

        Poruka p1 = new Poruka(b1, b2, "Sta radis?");
        Poruka p2 = new Poruka(b1, b2, "Hoce neko na basket?");
        Poruka p3 = new Poruka(b2, b1, "Moze u 5?");

        Poziv poz1 = new Poziv(b1, b2, 170);
        Poziv poz2 = new Poziv(b2, b1, 10);

        System.out.println(k1);
        System.out.println(k2);

        System.out.println(k1.cenaSvihUsluga());
        System.out.println(k2.cenaSvihUsluga());
    }
}
