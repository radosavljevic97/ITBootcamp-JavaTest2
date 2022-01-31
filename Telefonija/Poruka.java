package Telefonija;

public class Poruka extends Usluga{
    protected String tekstPoruke;

    public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
        super(brojOd, brojKa);
        this.tekstPoruke = tekstPoruke;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(brojOd.toString());
        sb.append("->");
        sb.append(brojKa.toString());
        sb.append(" ");
        sb.append(tekstPoruke);

        return sb.toString();
    }


    public double cenaUsluge(){
        if(brojOd != null && brojKa != null && brojOd != brojKa && !brojOd.isFiksniBroj() && !brojKa.isFiksniBroj()){
            return 3;
        }
        else{
            return 0;
        }

    }


}
