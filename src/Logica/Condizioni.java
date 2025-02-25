package Logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Condizioni {

	public static void main(String[] args) {

		int val = 5;

		// Inizio blocco condizionale esterno if
		if (val < 18) System.out.println("Avendo " + val + " anni, sei ancora minorenne. Non puoi votare!");
		
		// Blocco else esterno, fa riferimento all'opposto del primo blocco if
		else System.out.println("Sei maggiorenne, puoi votare!");
		

		System.out.println("Codice eseguito dopo i blocchi condizionali\n\n");

		
		
		// Possiamo valutare più condizioni con gli operatori logici (AND, OR, NOT) e di confronto.
		

		Scanner scanner = new Scanner(System.in);

        // Esempio: Gestione dell'età
        while (true) {
            try {
                System.out.println("Inserisci la tua età (-1 per uscire): ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Pulisce il buffer

                if (age == -1) {
                    System.out.println("Alla prossima!");
                    break;
                } else if (age > 0 && age < 18) {
                    System.out.println("Sei ancora minorenne. Non puoi votare!");
                } else if (age >= 18 && age < 40) {
                    System.out.println("Sei maggiorenne, puoi votare ma non essere votato!");
                } else if (age >= 40 && age < 60) {
                    System.out.println("I 40 sono i nuovi 20. Puoi anche essere votato!");
                } else if (age >= 60 && age < 90) {
                    System.out.println("I 60 sono i nuovi 30. Puoi anche fare da presidente della Repubblica Italiana.");
                } else if (age >= 90) {
                    System.out.println("A 90 puoi fare al massimo il Papa.");
                } else {
                    System.out.println("Numero non valido!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Errore: Devi inserire un numero intero!");
                scanner.nextLine(); // Ripristino scanner per evitare loop infinito
            } catch (Exception e) {
            	System.err.println("Errore durante la lettura dell'età.");
                scanner.nextLine(); // Ripristino scanner per evitare loop infinito
            }
        }

        // Esempio: Gestione del nome
        System.out.println("\nScegli il nome tra Beatrice, Filippa, Gianpiero o Ugo, oppure scrivi \"q\" per uscire.");

        while (true) {
            try {
                String name = scanner.nextLine().trim(); // Rimuove eventuali spazi superflui

                if (name.equalsIgnoreCase("q")) {
                    System.out.println("Alla prossima!");
                    break;
                } else if (name.equalsIgnoreCase("Beatrice")) {
                    System.out.println("Ciao Beatrice! Vuoi salutare qualcun altro?");
                } else if (name.equalsIgnoreCase("Gianpiero")) {
                    System.out.println("Ciao Gianpiero! Vuoi salutare qualcun altro?");
                } else if (name.equalsIgnoreCase("Ugo")) {
                    System.out.println("Ciao Ugo! Vuoi salutare qualcun altro?");
                } else if (name.equalsIgnoreCase("Filippa") || name.equalsIgnoreCase("Gianpiero")) {
                    System.out.println("Voi due potete entrare! Vuoi salutare qualcun altro?");
                } else {
                    System.out.println("Neanche Ugo ti chiami? Forse mi sto confondendo con qualcun altro.");
                }
            } catch (Exception e) {
                System.err.println("Errore durante la lettura del nome.");
                scanner.nextLine(); // Ripristino scanner per evitare loop infinito
            }
        }

        scanner.close();
    
		
		
		
	
        // --- Switch case
		
		System.out.println("\n\nSwitch case");


		String fruit = "Cocomero"; // Prova tutti i valori dei case, o anche altri che non esistono

		switch (fruit) { // Confrontiamo il valore della variabile fruit con i seguenti case

		case "Mela": // Primo confronto
			System.out.println("Il valore di fruit è Mela");
			break; // Se il valore di fruit == "Mela", il codice uscirà dallo switch.

		case "Pesca": // Secondo confronto
			System.out.println("Il valore di fruit è Pesca");
			break; // Se il valore di fruit == "Pesca", il codice uscirà dallo switch.

		// Il primo modo per attivare delle istruzioni è definire più case, e le
		// istruzioni e il break sono all'ultima
		case "Banana":
		case "Avocado":
		case "Mango":
		case "Fragola":
		case "Papaya":
			System.out.println("Il valore di fruit è un frutto tropicale");
			break;

		// Case constant list
		// Il secondo modo per è definire un unico case con più valori da confrontare
		// separati da virgole
		case "Lamponi", "Fragoline di bosco", "Mirtilli":
			System.out.println("Il valore di fruit è un frutto di bosco");
			break;

		default: // Opzionalmente possiamo aggiungere un caso base
			System.out.println("Il valore di fruit non è tra i casi previsti");
			break; // Quest'ultimo break è opzionale

		// NON È CONSIGLIATO INSERIRE ALTRI CASI DOPO IL DEFAULT, ma si potrebbe fare.
		case "Anguria":
			fruit = "Mela";
			break;
		}

		System.out.println("Siamo fuori dallo switch");
		System.out.println("Il valore finale della variabile fruit è: " + fruit);

		// -- Switch expression

		int x = 20;

		String number = switch (x) {
		case 10 -> "Dieci";
		case 20 -> "Venti";
		default -> {
			System.out.println("Opzione di default.");
			yield "Qualsiasi altro valore";
		}
		};

		System.out.println(number);

		// --- Labeled Statement

		// -- Esempio con costrutto if
		int numero = 10;

		controllo: { // Etichetta per il blocco di codice
			if (numero % 2 == 0) {
				System.out.println("Il numero è pari.");
				break controllo; // Esce dal blocco 'controllo'
			}
			System.out.println("Questo messaggio non verrà mai stampato.");
		}

		System.out.println("Fine del programma.");

		// -- Esempio con switch

		int valore = 3;

		elaborazione: {
			System.out.println("Inizio elaborazione...");

			switch (valore) {
			case 1:
				System.out.println("Caso 1");
				break;
			case 2:
				System.out.println("Caso 2");
				break;
			case 3:
				System.out.println("Caso 3, uscita dall'intero blocco elaborazione.");
				break elaborazione; // Esce dall'intero blocco
			default:
				System.out.println("Caso di default");
			}

			System.out.println("Questa parte non viene eseguita se valore = 3.");
		}

		System.out.println("Elaborazione terminata.");
	}
}
