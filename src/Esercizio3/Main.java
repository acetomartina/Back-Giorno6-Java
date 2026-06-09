package Esercizio3;

public class Main {
    public static void main(String[] args){

        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto("Martina","3242893724");
        rubrica.aggiungiContatto("Giorgia","3412893729");
        rubrica.aggiungiContatto("Antonio","3203872984");
        rubrica.aggiungiContatto("Diego", "3402983721");

        rubrica.stampaContatti();
        System.out.println(rubrica.cercaNumero("Giorgia"));
        System.out.println(rubrica.cercaPersona("3402983721"));

        rubrica.rimuoviContatto("Martina");
        rubrica.stampaContatti();
    }
}
