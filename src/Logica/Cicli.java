package Logica;

public class Cicli {

	public static void main(String[] args) {

		// --- while

		int count = 1;
		System.out.println("Cicli while\n");
		
		// Questo ciclo continua fino a quando la condizione sarà true.
		// Vanno usate quindi condizioni che ritornano dei booleani come operatori logici e di confronto
		// Ciclo con condizione prefissa
		
		while (count <= 10) {
			// Istruzioni da eseguire nel ciclo
			System.out.println("\tIstruzione numero: " + count);
			count++;
		}

		System.out.println("\nSiamo fuori dal ciclo while. Yuppie! Non si è buggato tutto!\n\n");

		
		
		// --- do while
		
		int count1 = 10;
		System.out.println("Cicli do while\n");
		
		// Sono uguali al while, ma viene eseguito almeno una volta prima che la condizione sia verificata
		// Ciclo con condizione postfissa
		
		do { 
			System.out.println("\tValore count down: " + count1);
			count1--;
		} while (count1 >= 5);

		System.out.println("\nSiamo fuori dal ciclo do while. Yuppie! Non si è buggato tutto!\n\n");

		

		// --- for

		System.out.println("Cicli for\n");
		
		// Il ciclo for viene eseguito per un numero specificato di volte
		// Si inizializza una variabile contatore, indichiamo la condizione verità, 
		// modifichiamo il contantore fino a quando non raggiunge la condizione di uscita.
		// Ciclo con condizione prefissa
		
		for (int i = 2; i <= 20; i += 2) {
			if (i == 6) continue; // Salta l'iterazione corrente e continua con la successiva'
			if (i == 16) break; // Uscita dal ciclo corrente
			System.out.println("\tValore della variabile contatore i: " + i);
		}
		

		
		// --- for each
		// Il ciclo chiamato for each viene eseguito per ogni elemento di una condizione, come gli array

		System.out.println("\n\nCicli for each\n");
		String[] myArray = new String[] { "Maria", "Juan", "Pedro", "Ana", "Luis" };

		// La sintassi consente di creare una singola variabile per ogni elemento dell'array
		// Nel ciclo accediamo ad ogni elemento
		
		for (String element : myArray) {
			System.out.println("\tValore attuale dell'elemento: " + element);
		}

		
		
		// --- Labeled loops
		
		System.out.println("\n\nCicli labeled loops\n");
		System.out.println("Inizio ciclo esterno\n");
		
		// Come per le condizioni, anche i cicli possono essere annidati e possono contenere etichette
		// Le etichette possono essere usate per saltare direttamente alla parte specifica del codice che vogliamo eseguire
		// Questo è particolarmente utile quando abbiamo più cicli annidati

		OUTER_LABEL: for (int i = 0; i < 10; i++) { // Inizio ciclo esterno
			System.out.println("\tCiclo esterno -> i = " + i);

			INNER_LABEL: for (int k = 0; k <= 10; k++) { // Inizio ciclo interno
				System.out.println("\t\tCiclo interno -> k = " + k);

				if (i == 2)
					break OUTER_LABEL; // Se i è uguale a 2, usciamo da entrambi i cicli

				if (k == 2) { // Se k è uguale a 2, usciamo solo dal ciclo interno
					System.out.println("\t\tUsciamo dal ciclo interno");
					break INNER_LABEL;
				}
			} // Fine ciclo interno

			System.out.println("\tFine iterazione ciclo esterno: " + i + "\n");
		} // Fine ciclo esterno

		System.out.println("\nSei fuori dal ciclo esterno...");
		

		
		// Nested loops: Esempio tabelline
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("\nTabellina del " + i + ":");
	              
            	for (int k = 1; k <= 10; k++) {
            		System.out.println("\t" + i + " x " + k + " = " + (i * k));
            	}
	        }
        System.out.println("\nFine tabelline.");
			
	}
}
