package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> lista = generaLista(10);
        System.out.println("\nLista ordinata: ");
        System.out.println(lista);

        ArrayList<Integer> nuovaLista = listaSpecchiata(lista);
        System.out.println("\nLista specchiata: ");
        System.out.println(nuovaLista);

        System.out.println("\nValori in posizione pari: ");
        stampa(nuovaLista,true);

        System.out.println("\nValori in posizione dispari: ");
        stampa(nuovaLista,false);


    }

    public static ArrayList<Integer> generaLista(int n) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            int numero = random.nextInt(101);
            lista.add(numero);
        }
        Collections.sort(lista);
        return lista;
    }

    public static ArrayList<Integer> listaSpecchiata(ArrayList<Integer> lista) {

        ArrayList<Integer> nuovaLista = new ArrayList<>();
        nuovaLista.addAll(lista);

        for (int i = lista.size() - 1; i >= 0; i--) {
            nuovaLista.add(lista.get(i));
        }

        return nuovaLista;
    }

    public static void stampa(ArrayList<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if ((pari && i % 2 == 0) || (!pari && i % 2 != 0)) {
                System.out.println(lista.get(i));
            }
        }
    }
}

