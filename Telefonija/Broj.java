package Telefonija;

public class Broj {
    protected String kodDrzave;
    protected String pozivniBroj;
    protected String broj;
    protected boolean fiksniBroj;

    public Broj(String kodDrzave, String pozivniBroj, String broj, boolean fiksniBroj) {
        if(proveriBroj(kodDrzave, pozivniBroj, broj) == false){
            System.out.println("Nevalidan broj!");
        }
        else{
            this.kodDrzave = kodDrzave;
            this.pozivniBroj = pozivniBroj;
            this.broj = broj;
        }
        this.fiksniBroj = fiksniBroj;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) {
        if (kodDrzave == null || kodDrzave.length() != 3 || proveriDaLiStringSadrziSamoNumerike(kodDrzave) == false) {
            System.out.println("Nevalidan broj!");
        }
        else{
            this.kodDrzave = kodDrzave;
        }
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) {
        if (pozivniBroj == null || pozivniBroj.length() != 2 || proveriDaLiStringSadrziSamoNumerike(pozivniBroj) == false) {
            System.out.println("Nevalidan broj!");
        }
        else{
            this.pozivniBroj = pozivniBroj;
        }
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        if(broj == null || broj.length() != 7 || broj.length() != 8 || proveriDaLiStringSadrziSamoNumerike(broj) == false) {
            System.out.println("Nevalidan broj!");
        }
        else{
            this.broj = broj;
        }
    }

    public boolean isFiksniBroj() {
        return fiksniBroj;
    }

    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(kodDrzave).append(pozivniBroj).append(broj).append("\n");

        return sb.toString();
    }


    private static boolean proveriDaLiStringSadrziSamoNumerike(String s) {
        boolean sadrziSamoNumerike = true;
        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (sadrziSamoNumerike = Character.isDigit(c)) {
                    sadrziSamoNumerike = false;
                    break;
                }
            }
        }
        return sadrziSamoNumerike;
    }

    private static boolean proveriBroj(String kodDrzave, String pozivniBroj, String broj) {
        boolean dobarBroj = true;
        if (kodDrzave == null || kodDrzave.length() != 3 || proveriDaLiStringSadrziSamoNumerike(kodDrzave) == false) {
            dobarBroj = false;
            return dobarBroj;
        }

        if (pozivniBroj == null || pozivniBroj.length() != 2 || proveriDaLiStringSadrziSamoNumerike(pozivniBroj) == false) {
            dobarBroj = false;
            return dobarBroj;
        }

        if (broj == null || broj.length() != 7 || broj.length() != 8 || proveriDaLiStringSadrziSamoNumerike(broj) == false) {
            dobarBroj = false;
            return dobarBroj;
        } else {
            return dobarBroj;
        }


    }
}





