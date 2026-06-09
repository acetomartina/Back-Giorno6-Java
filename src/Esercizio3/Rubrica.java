package Esercizio3;

import java.util.HashMap;

public class Rubrica {

    private HashMap<String, String> contatti = new HashMap<>();

    public void aggiungiContatto(String nome, String telefono){
        contatti.put(nome,telefono);
    }

    public void rimuoviContatto(String nome){
        contatti.remove(nome);
    }

    public String cercaNumero(String nome){
        return contatti.get(nome);
    }

    public String cercaPersona(String telefono) {
        for (String nome : contatti.keySet()) {
            if (contatti.get(nome).equals(telefono)) {
                return nome;
            }
        } return null;
    }

    public void stampaContatti() {

        for (String nome : contatti.keySet()) {
            System.out.println(nome + " - " + contatti.get(nome));
        }
    }
}
