package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quante parole vuoi inserire?");
        int n = Integer.parseInt(scanner.nextLine());

        HashSet<String> paroleUniche = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();

        for (int i=0; i<n; i++){
            System.out.println("Inserisci una parola.");
            String parola = scanner.nextLine().trim();

            if(!paroleUniche.add(parola)){
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("\nParole duplicate: ");
        System.out.println(paroleDuplicate);

        System.out.println("\nNumero parole distinte: ");
        System.out.println(paroleUniche.size());

        System.out.println("\nParole distinte: ");
        System.out.println(paroleUniche);

    }
}
