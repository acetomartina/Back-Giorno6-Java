package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n;

        try {
            System.out.println("Quante parole vuoi inserire?");
            n = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Valore non valido.");
            return;
        }

        HashSet<String> paroleUniche = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();

        for (int i=0; i<n; i++){
            System.out.println("Inserisci una parola.");
            String parola = scanner.nextLine().trim();

            if(!paroleUniche.add(parola)){
                paroleDuplicate.add(parola);
            }
        }

        HashSet<String> paroleDistinte = new HashSet<>(paroleUniche);
        paroleDistinte.removeAll(paroleDuplicate);

        System.out.println("\nParole duplicate: ");
        System.out.println(paroleDuplicate);

        System.out.println("\nNumero parole distinte: ");
        System.out.println(paroleDistinte.size());

        System.out.println("\nParole distinte: ");
        System.out.println(paroleDistinte);

    }
}
