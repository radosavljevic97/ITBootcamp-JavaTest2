package Telefonija;

public class Poziv extends Usluga{
    private int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(brojOd.toString());
        sb.append("->");
        sb.append(brojKa.toString());
        sb.append(" ");

        int minuti = trajanjeUSekundama / 60;
        int sekunde = trajanjeUSekundama % 60;

        sb.append(minuti);
        sb.append(":");
        sb.append(sekunde);

        return sb.toString();
    }

    @Override
    public double cenaUsluge() {
        double cena = (trajanjeUSekundama / 60) * 10;
        if(!brojOd.equals(null) || !brojKa.equals(null) || !brojOd.equals(brojKa)){
            return 0;
        }
        else if(trajanjeUSekundama % 60 == 0){
            return cena;
        }
        else{
            return cena + 10;
        }

    }


}
