package Logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Condizioni {

	public static void main(String[] args) {

		int val = 5;

		// Inizio blocco condizionale esterno if
		if (val < 18) System.out.println("Avendo " + val + " anni, sei ancora minorenne. Non puoi votare!");
		
		// Blocco else, fa riferimento all'opposto del primo blocco if
		// Verrà eseguito solo se la condizione del primo blocco if non è vera
		else System.out.println("Sei maggiorenne, puoi votare!");
		
		System.out.println("Codice eseguito dopo i blocchi condizionali\n\n");

		

		Scanner scanner = new Scanner(System.in);

        // Esempio: Gestione dell'età
		
        while (true) {
            try {
                System.out.println("Inserisci la tua età (-1 per uscire): ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Pulisce il buffer

                // Possiamo valutare più condizioni con gli operatori logici (AND, OR, NOT) e di confronto.
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


	
        // --- Switch case
		
        System.out.println("\n\nSwitch case:");
		System.out.println("Benvenuto nel mercato ortofrutticolo.\nChiedi un frutto o digita \"q\" per uscire:");
		Boolean exit = false;
		do {
			try {
				String fruit = scanner.nextLine().trim();
				
				switch (fruit) { // Confrontiamo il valore della variabile fruit con i seguenti case
			
					case "Mela": // Primo confronto
						System.out.println("Si, abbiamo le mele!");
						break; // Se il valore di fruit == "Mela", il codice uscirà dallo switch.
			
					case "Pesca": // Secondo confronto
						System.out.println("Abbiamo le pesce!");
						break; // Se il valore di fruit == "Pesca", il codice uscirà dallo switch.
			
					// Il primo modo per attivare delle istruzioni è definire più case, e le
					// istruzioni e il break sono all'ultima
					case "Banana":
					case "Avocado":
					case "Mango":
					case "Fragola":
					case "Papaya":
						System.out.println("Abbiamo qualsiasi frutto tropicale!");
						break;
			
					// Case constant list
					// Il secondo modo per è definire un unico case con più valori da confrontare
					// separati da virgole
					case "Lamponi", "Fragoline di bosco", "Mirtilli":
						System.out.println("Abbiamo qualsiasi frutto di bosco!");
						break;
			
					default: // Opzionalmente possiamo aggiungere un caso base
						System.out.println("Mi spiace, non abbiamo quel frutto!");
						break; // Quest'ultimo break è opzionale
			
					// NON È CONSIGLIATO INSERIRE ALTRI CASI DOPO IL DEFAULT, ma si potrebbe fare.
					case "Anguria":
						fruit = "Mela";
						break;
					
					// Uscita dal loop
					case "q":
						exit = true;
						break;
					}
				System.out.println("Hai scelto: " + fruit + ". Scegli un altro frutto o \"q\" per uscire:");
				
			} catch (Exception e) {
				System.err.println("Errore durante la lettura del frutto.");
	            scanner.nextLine(); // Ripristino scanner per evitare loop infinito
			}
		
		} while (!exit);
		
		System.out.println("Sono 4000 euro. Paga in contanti?");
		
		
		
		// -- Switch expression

		System.out.println("\n\nSwitch expression:");
		System.out.println("Che giorno è oggi? Indica un numero da 1 a 7 o digita -1 per uscire:");
		
		Boolean exit2 = false;
		do {
			try {
				Integer scelta = scanner.nextInt();
				scanner.nextLine();
				// Altra sintassi: switch expression
				// Consente di assegnare un valore ad una variabile utilizzando il pattern matching
				
				String giorno = switch (scelta) {
					case 1 -> "Lunedì";
					case 2 -> "Martedì";
					case 3 -> "Mercoledì";
					case 4 -> "Giovedì";
					case 5 -> "Venerdì";
					case 6 -> "Sabato";
					case 7 -> "Domenica";
					case -1 -> {
		                yield "Arrivederci!";
					}
					default -> {
						yield "Valori non validi!";
					}
				};
		
				if (giorno.equals("Arrivederci!") || giorno.equals("Valori non validi!")) {
					System.out.println(giorno);
					exit2 = true;
				}
				else System.out.println("Oggi è: " + giorno);
			} catch (Exception e) {
				System.err.println("Errore durante la lettura del numero.");
                scanner.nextLine();
			}
			System.out.println("Scegli un altro numero da 1 a 7 o -1 per uscire:");
		} while (!exit2);
		


		// --- Labeled Statement
		System.out.println("\n\nLabeled statement:");
		
		// Java consente di etichettare costrutti condizionali e ciclici in un blocco di codice.
		// Possiamo utilizzare una condizione che, una volta soddisfatta, utilizza break [etichetta]
		// In modo da uscire dal blocco specificato con l'etichetta.'
		
		
		// -- Esempio con costrutto if
		int numero = 10;

		 // Etichetta per il blocco di codice
		controllo: {
			if (numero % 2 == 0) {
				System.out.println("Il numero è pari.");
				break controllo; // Esce dal blocco 'controllo'
			}
			System.out.println("Questo messaggio non verrà mai stampato.");
		}

		System.out.println("Codice eseguito dopo esser usciti dal blocco 'controllo'.");

		
		
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

			
        scanner.close();
	}
}
