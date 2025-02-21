
# Operatori Java

Gli **operatori** in Java sono simboli che vengono utilizzati per eseguire specifiche operazioni su variabili e valori. Gli operatori agiscono sempre su quantità di elementi fissi, detti operandi. In base alla quantità di elementi coinvolti, avremo operatori **unari**, **binari** o **ternari**.

La maggior parte degli operatori sono binari, quindi lavorano su due operandi. Molti di meno sono unari, ed uno soltanto è ternario.

Sono suddivisi in diverse categorie:

1. **Operatori unari**
2. **Operatori aritmetici**
3. **Operatori di shift**
4. **Operatori di confronto (relazionali)**
5. **Operatori bitwise**
6. **Operatori logici**
7. **Operatori di assegnazione**
8. **Operatore ternario**
9. **Operatore istanceof**

---

## Espressione

Un'**espressione** è un'operazione che può essere semplice (tra due operandi) o composta (tra più operandi). Il risultato di questa espressione può essere assegnato ad una variabile, oppure usato come operando per un'altra espressione.

Gli operandi di un'espressione possono essere valori literal, oppure variabili che conservano un valore, o ancora dei metodi che ritornano valori.

---

## Precedenza degli operatori

La lista precedente non è posta in ordine casuale, ma in ordine di precedenza degli operatori. Cosa significa? Che le espressioni in cui intervengono uno o più di questi operatori, se hanno una precedenza maggiore degli altri, queste espressioni verranno valutate prima rispetto agli operatori con precedenza minore.

---

### Associatività

Inoltre, gli operatori con la stessa precedenza vengono valutati da sinistra a destra, eccetto per gli operatori di assegnamento. Questa caratteristica è definita associatività. In realtà, esistono due tipi di associatività: da sinistra a destra (di default) e da destra a sinistra.

La precedenza degli operatori è fondamentale, in quanto utilizzare operatori che fanno le stesse operazioni ma hanno una precedenza diversa, il risultato dell'espressione potrebbe risultare totalmente diversa.

---

### Alterare Precedenza e Associatività

Sia precedenza che associatività degli operatori cambia quando circondiamo parte di una espressione da delle parentesi tonde `()`. Tutto quello che si trova dentro questi caratteri ha la precedenza assoluta, e quindi verrà valutata l'espressione con gli operatori all'interno di queste parentesi indipendentemente dalla precedenza o associatività.

Come in molti altri linguaggi di programmazione, anche in Java esiste un concetto simile a PEMDAS, che è un acronimo per Parentheses, Exponents, Multiplication and Division, Addition and Subtraction. Questo ordine di operazioni è una convenzione standard in matematica per determinare in quale ordine si dovrebbero eseguire le operazioni in un'espressione complessa.

Il primo operatore della sigla sono le parentesi tonde (). In questo esempio, notiamo come utilizzare o meno le parentesi fa la differenza. Qualsiasi espressione inserita nelle parentesi tonde ha la precedenza su tutti gli altri operatori.

1. Nel primo caso, l'operatore `*` ha la precedenza. Quindi, viene effettuata prima la moltiplicazione (`5*2 = 10`), e poi avviene la somma (`10 +10 = 20`);
2. Nel secondo esempio, l'espressione tra le parentesi ha la precedenza. Quindi, viene effettuata prima la somma (`10 + 5 = 15`) e poi la moltiplicazione (`15 * 2 = 30`).

Ovviamente, si possono utilizzare molteplici parentesi interne, ed utilizzare altri operatori dentro le parentesi comporterà a dover rivalutare la precedenza degli operatori. Tuttavia, è consigliato evitare di rendere le espressioni troppo complesse. Meglio dividere le varie parti delle espressioni in tante variabili per rendere il codice gestibile.

---

### Tabella riassuntiva

Diamo un rapido sguardo a tutti gli operatori in questa tabella. Sono posti in ordine di precedenza discendente.

| **Categoria**             | **Operatore** | **Descrizione**                                 | **Tipo** |
| ------------------------- | ------------- | ----------------------------------------------- | -------- |
| Operatori unari           | `++`          | Incremento                                      | Unario   |
| Operatori unari           | `--`          | Decremento                                      | Unario   |
| Operatori unari           | `!`           | NOT logico                                      | Unario   |
| Operatori unari           | `~`           | NOT bitwise                                     | Unario   |
| Operatori unari           | `+`           | Positivo unario                                 | Unario   |
| Operatori unari           | `-`           | Negativo unario                                 | Unario   |
| Operatori aritmetici      | `*`           | Moltiplicazione                                 | Binario  |
| Operatori aritmetici      | `/`           | Divisione                                       | Binario  |
| Operatori aritmetici      | `%`           | Modulo                                          | Binario  |
| Operatori aritmetici      | `+`           | Addizione                                       | Binario  |
| Operatori aritmetici      | `-`           | Sottrazione                                     | Binario  |
| Operatori di shift        | `<<`          | Shift a sinistra                                | Binario  |
| Operatori di shift        | `>>`          | Shift a destra (con segno)                      | Binario  |
| Operatori di shift        | `>>>`         | Shift a destra (senza segno)                    | Binario  |
| Operatori di confronto    | `<`           | Minore di                                       | Binario  |
| Operatori di confronto    | `>`           | Maggiore di                                     | Binario  |
| Operatori di confronto    | `<=`          | Minore o uguale a                               | Binario  |
| Operatori di confronto    | `>=`          | Maggiore o uguale a                             | Binario  |
| Operatori di confronto    | `==`          | Uguale a                                        | Binario  |
| Operatori di confronto    | `!=`          | Diverso da                                      | Binario  |
| Operatori bitwise         | `&`           | AND bitwise                                     | Binario  |
| Operatori bitwise         | `^`           | XOR bitwise                                     | Binario  |
| Operatori bitwise         | `\|`          | OR bitwise                                      | Binario  |
| Operatori logici          | `&&`          | AND logico                                      | Binario  |
| Operatori logici          | `\|`          | OR logico (uno dei due deve essere vero)        | Binario  |
| Operatori di assegnazione | `=`           | Assegna un valore                               | Binario  |
| Operatori di assegnazione | `+=`          | Somma e assegna                                 | Binario  |
| Operatori di assegnazione | `-=`          | Sottrae e assegna                               | Binario  |
| Operatori di assegnazione | `*=`          | Moltiplica e assegna                            | Binario  |
| Operatori di assegnazione | `/=`          | Divide e assegna                                | Binario  |
| Operatori di assegnazione | `%=`          | Calcola il modulo e assegna                     | Binario  |
| Operatori di assegnazione | `&=`          | AND bitwise e assegna                           | Binario  |
| Operatori di assegnazione | `^=`          | XOR bitwise e assegna                           | Binario  |
| Operatori di assegnazione | `\|=`         | OR bitwise e assegna                            | Binario  |
| Operatori di assegnazione | `<<=`         | Shift a sinistra e assegna                      | Binario  |
| Operatori di assegnazione | `>>=`         | Shift a destra e assegna                        | Binario  |
| Operatori di assegnazione | `>>>=`        | Shift a destra (senza segno) e assegna          | Binario  |
| Operatore ternario        | `? :`         | Operatore condizionale                          | Ternario |
| Operatore instanceof      | `instanceof`  | Controlla se un oggetto è istanza di una classe | Binario  |

---

## Precedenza operatori

Non tutti gli operatori vengono eseguiti con la stessa priorità. Se compaiono più operatori in un istruzione, questi vengono eseguiti in ordine di precedenza come indicata nella tabella, seguendo queste regole:

1. La precedenza degli operatori va **dall'alto verso il basso** nella tabella. Quelli più in alto vengono valutati prima.
2. Se nella stessa istruzione vi sono più operatori con la **stessa precedenza**, vengono valutati da **sinistra verso destra**.
3. Si può **aumentare** la **priorità** di qualsiasi operatore "più debole" raggruppando l'espressione che lo utilizza tra **parentesi tonde**. Inoltre, questi caratteri vengono eliminati in fase di compilazione, quindi usiamoli per chiarezza.

```java
// --- Precedenza operatori
System.out.println("Precedenza operatori");

// L'operatore * (moltiplicazione) ha la precedenza
// Verrà effettuato prima 5 x 2 = 10, 
// Poi si somma 10.
System.out.println(10 + 5 * 2); // 20

// Circondare un'espressione in parentesi fa in modo che 
// le operazioni interne abbiano la precedenza, e vengano eseguite prima.
// Verrà fatta prima la somma (10 + 5 = 15), 
// e poi la moltiplicazione 15 x 2 = 30 
System.out.println((10 + 5) * 2); // 30
```

---

# Operatori unari

Gli **operatori unari** operano su un solo operando.

---

## Incremento e decremento

Gli operatori di **incremento** aumentano il valore di una variabile di 1, mentre gli operatori di **decremento** diminuiscono il valore di una variabile di 1. Si dividono ulteriormente in "**pre**" (prefissi, scritti prima della variabile) e "**post**" (postfissi, scritti dopo la variabile), in quando a quando vengono attivati.

- `++x`: **Pre-incremento** (incrementa x di uno, poi restituisce x).
- `x++`: **Post-incremento** (restituisce x, poi incrementa x di uno).
- `--x`: **Pre-decremento** (decrementa x di uno, poi restituisce x).
- `x--`: **Post-decremento** (restituisce x, poi decrementa x di uno).

- Quando il compilatore troverà gli operatori "pre", effettuerà gli incrementi o decrementi per poi stampare il valore della variabile.
- Quando il compilatore troverà gli operatori "post" invece, stamperà prima il valore di x attuale e solo successivamente lo modificherà.

Facciamo subito degli esempi di questi operatori partendo da una sola variabile `int x = 1`.

```java
 // --- Operatori unari
System.out.println("Operatori unari");

// -- Incremento e decremento (pre e post)
int x = 1; 
System.out.println(x); // 1
System.out.println(++x); // 2
System.out.println(x++); // 2
System.out.println(x); // 3
System.out.println(--x); // 2
System.out.println(x--); // 2
System.out.println(x); // 1
```

---

## Positivo unario

- `+` : L'operatore positivo unario non modifica il valore della variabile, ma può essere utilizzato per enfatizzare che un numero è positivo.

```java
// -- Positivo unario
int positive = +5; System.out.println(positive); // 5
```

==NB==: Questo operatore è **polimorfico**, significa che può comportarsi in maniera differente in base al contesto. Sappiamo che è un operatore binario quando posto tra due stringhe. In questo caso, **l'operatore `+` serve a concatenare due stringhe**, quindi ad unirle in un'unica stringa.

```java
System.out.println("Hello " + "World");
// Output: Hello World
```

---

## Negativo unario

- `-` : L'operatore negativo unario cambia il segno di un numero in negativo.

```java
// -- Negativo unario
int negative = -5; System.out.println(negative); // -5
```

---

## Not e completamento a uno

Esistono anche gli operatori logici not `!` e bitwise not `~` che sono operatori unari, ma verranno trattati nelle categorie appartenenti.

```java
// -- Not
boolean a1 = false; 
System.out.println(!a1);

// -- Completamento a uno
int bin = 5;
System.out.println(~bin); // Output: -6 (in binario: 5 = 00000101, ~5 = 11111010)
```

---

# Operatori binari

Gli **operatori binari** eseguono delle operazioni tra due operandi.

---

## Operatori aritmetici

Gli **operatori aritmetici** in Java sono utilizzati per eseguire operazioni aritmetiche come l'addizione, la sottrazione, la moltiplicazione, la divisione e il modulo. Questi operatori spesso vengono utilizzati con vari tipi di dati numerici compresi `short`, `int`, `long`, `float`, `double`. 

- `+` (**Addizione**): Questo operatore viene utilizzato per sommare due valori.
- `-` (**Sottrazione**): Questo operatore viene utilizzato per sottrarre un valore da un altro.
- `*` (**Moltiplicazione**): Questo operatore viene utilizzato per moltiplicare due valori.
- `/` (**Divisione**): Questo operatore viene utilizzato per dividere un valore per un altro. Se entrambi gli operandi sono interi, il risultato sarà la divisione intera. Se anche uno solo degli operandi ha dei decimali, il risultato viene convertito in un tipo a virgola mobile (`float` o `double`).
- `%` (**Modulo**): Questo operatore viene utilizzato per ottenere il resto di una divisione.

```java
// --- Operatori aritmetici
System.out.println("Operatori aritmetici");
System.out.println(5 + 3); // 8
System.out.println(5 - 3); // 2
System.out.println(5 * 3); // 15
System.out.println(15.0 / 3); // 5.0
System.out.println(10 % 4); // 2
```

Se gli operandi sono di tipi diversi, Java eseguirà automaticamente la **promozione del tipo di dato** al tipo superiore, in modo da poter eseguire l'operazione. Ad esempio, se un operando è un `int` e l'altro è un `double`, l'intero verrà promosso a `double` prima dell'operazione.

---

## Operatori relazionali

Gli **operatori relazionali** (detti anche di **confronto**) in Java sono utilizzati per confrontare due valori. **Il risultato di ogni confronto sarà sempre un valore booleano**: `true`, se il confronto è vero; `false` se il confronto è falso.

Questi operatori di confronto sono molto utili nei costrutti ciclici e condizionali (che vedremo in seguito), dove è necessario confrontare due valori per decidere quale percorso di esecuzione seguire.

- **Minore di** `<` : Restituisce true se il valore alla sua sinistra è minore del valore alla sua destra.
- **Maggiore di** `>` : Restituisce true se il valore alla sua sinistra è maggiore del valore alla sua destra.
- **Minore o uguale a** `<=` : Restituisce true se il valore alla sua sinistra è minore o uguale al valore alla sua destra.
- **Maggiore o uguale a** `>=` : Restituisce true se il valore alla sua sinistra è maggiore o uguale al valore alla sua destra.
- **Uguale a** `==` : Restituisce true se il valore alla sua sinistra è uguale al valore alla sua destra.
- **Diverso da** `!=` : Restituisce true se il valore alla sua sinistra è diverso dal valore alla sua destra.

```java
System.out.println("Operatori di confronto");
System.out.println(5 < 10); // true
System.out.println(5 > 3); // false
System.out.println(5 <= 3); // true
System.out.println(5 >= 10); // false
System.out.println(5 == 5); // true
System.out.println(5 != 10); // true
```

---

## Operatori logici

Gli **operatori logici** sono utilizzati per creare espressioni booleane che possono poi essere usate nei costrutti condizionali e ciclici. Gli operatori logici valutano un'espressione tra due operandi e, in base alla logica dell'operatore, il risultato finale sarà un dato booleano con valori true o false.

---

### Logica booleana

- Logical AND `&&` : Questo operatore restituisce true solo se entrambi gli operandi sono true. In tutte le altre combinazioni, il valore ritornato sarà false.

- Logical OR `||` : Questo operatore restituirà false solo se entrambi gli operandi sono false. In tutti gli altri casi, restituirà true.

- Logical NOT `!` : L'operatore di negazione logica è un operatore unario che inverte il valore booleano dell'operando.

Gli operatori logici seguono l'**algebra di Boole**. Ecco la tabella della **logica booleana** con tutti i risultati per gli operatori logici `&&`, `||` e `!`:

| **Operando A** | **Operando B** | **A && B** | **A \|\| B** | **!A**  | **!B**  |
| -------------- | -------------- | ---------- | ------------ | ------- | ------- |
| `true`         | `true`         | `true`     | `false`      | `false` | `false` |
| `true`         | `false`        | `true`     | `false`      | `false` | `true`  |
| `false`        | `true`         | `false`    | `true`       | `true`  | `false` |
| `false`        | `false`        | `false`    | `false`      | `true`  | `true`  |

Da ricordare:
- **AND (`&&`)**: Restituisce `true` solo se entrambi gli operandi sono `true`. In tutti gli altri casi, restituisce `false`.
- **OR (`||`)**: Restituisce `true` se almeno uno degli operandi è `true`. Restituisce `false` solo quando entrambi gli operandi sono `false`.
- **NOT (`!`)**: Inverte il valore booleano dell'operando (`true` diventa `false` e viceversa).

---

### Esempi di codice


```java
// --- Operatori logici
System.out.println("Operatori logici");

// Seguono la logica booleana
System.out.println(true && false); // false
System.out.println(true || false); // true
System.out.println(!true); // false
```

---

### Short-circuit evaluation

Come in altri linguaggi di programmazione, anche in Java esiste il concetto di **short-circuit evaluation**. Questo significa che l'operatore `&&` e l'operatore `||` non valuteranno il secondo operando se il risultato può essere determinato dal primo operando.

Nell'espressione `a && b`, se `a` è `false` allora l'intera espressione sarà false, indipendentemente dal valore di `b`. Pertanto, `b` non verrà valutato. Lo stesso vale anche se il primo operando è true, allora l'intera espressione verrà valutata automaticamente `true`, senza procedere a valutare il secondo operando.

Questo sistema è spesso utile per prevenire errori, come la divisione per zero o il riferimento a null, nel secondo operando.

```java
// --- Short-circuit evaluation
System.out.println("Short cicuit evaluation");
System.out.println(0 !=0 && 10 / 0 > 1); // false
```

In questo esempio, l'espressione `10 / 0` causerebbe un errore di divisione per zero. Tuttavia, a causa della valutazione short-circuit, l'espressione `10 / 0` non viene mai valutata, a causa del primo operando `0 != 0` è false, quindi l'errore è evitato.

---

## Operatori di assegnamento

Gli **operatori di assegnamento** sono utilizzati per assegnare un valore a una variabile. Il più semplice operatore di assegnamento è `=` che è **unario**, e serve ad assegnare un valore ad una variabile.

---

### Assegnamento aritmetici

Esistono anche altri **operatori di assegnamento** che sono binari e eseguono un'operazione algebrica sul valore corrente della variabile prima di assegnarle il risultato. 

- `=` : Assegna il valore alla sua destra alla variabile alla sua sinistra.
- `+=` : Aggiunge il valore alla sua destra al valore corrente della variabile e assegna il risultato alla variabile.
- `-=` : Sottrae il valore alla sua destra dal valore corrente della variabile e assegna il risultato alla variabile.
- `*=` : Moltiplica il valore corrente della variabile per il valore alla sua destra e assegna il risultato alla variabile.
- `/=` : Divide il valore corrente della variabile per il valore alla sua destra e assegna il risultato alla variabile.
- `%=` : Calcola il modulo del valore corrente della variabile per il valore alla sua destra e assegna il risultato alla variabile.

```java
// --- Operatori di confronto
System.out.println("Operatori di confronto");
System.out.println(5 < 10); // true
System.out.println(5 > 3); // false
System.out.println(5 <= 3); // true
System.out.println(5 >= 10); // false
System.out.println(5 == 5); // true
System.out.println(5 != 10); // true
```

==PS==: Gli operatori di assegnamento combinati sono un modo comodo e compatto per modificare il valore di una variabile. Ad esempio, `a += 3` è più breve e più leggibile di `a = a + 3`, e queste due istruzioni hanno lo stesso effetto.

---

## Operatori bitwise logici

Gli **operatori bitwise logici** in Java operano sui bit di un numero. Gli operatori bitwise operano a livello di bit, quindi possono avere effetti non immediatamente intuitivi se non siamo abituati a lavorare con la rappresentazione binaria dei numeri. Sono usati principalmente per operazioni a basso livello, come la manipolazione diretta di bit o l'ottimizzazione delle prestazioni.

- Bitwise AND `&` : Questo operatore restituisce 1 se entrambi i bit corrispondenti sono 1, altrimenti restituisce 0. In questo esempio, a & b restituisce 1 perché solo l'ultimo bit in a e b sono entrambi 1.

- Bitwise OR `|` : Questo operatore restituisce 1 se almeno uno dei bit corrispondenti è 1, altrimenti restituisce 0. In questo esempio, a | b restituisce 7 perché ogni coppia di bit in a e b ha almeno un bit 1.

- Bitwise XOR `^` : Questo operatore restituisce 1 se esattamente uno dei bit corrispondenti è 1, altrimenti restituisce 0. In questo esempio, a ^ b restituisce 6 perché solo la prima e la seconda coppia di bit in a e b hanno uno e solo uno bit 1.

- Bitwise NOT `~` : Questo è un operatore unario che inverte tutti i bit del numero. L'operatore NOT bitwise esegue il complemento di tutti i bit di un valore intero. Cambia ogni bit 1 in 0 e ogni bit 0 in 1. Per capire come funziona, è importante prima capire come i numeri sono rappresentati in binario e come funziona la rappresentazione di complemento a due. Questo operatore può essere considerato sia bitwise che unario.

```java
// --- Operatori bitwise logici
System.out.println("Operatori bitwise");
System.out.println(5 & 3); // 1
System.out.println(5 | 3); // 7
System.out.println(5 ^ 3); // 6
System.out.println(~5); // -6

int x1 = 5; // 0101 in binario
x1 &= 3;    // 0011 in binario
System.out.println(x1); // Output: 1 (0101 & 0011 = 0001)
```

---

## Operatori Shift

Gli **operatori shift** in Java sono utilizzati per lavorare a basso livello, spostando i bit di un numero da una parte all'altra. Gli operatori di shift lavorano a livello di **bit**, quindi i loro effetti possono non essere immediatamente intuitivi se non siamo abituati a lavorare con la rappresentazione binaria dei numeri.

```java
// --- Operatori shift
System.out.println("Operatori shift");

int e = 2;
System.out.println(e << 1); // 4, in binario: 100

int f = 4;
System.out.println(f << 1); // Output: 8

int g = -4;
System.out.println(g >>> 1); //
```

- Shift a sinistra `<<`: L'operatore di shift a sinistra sposta i bit del numero verso sinistra. Ogni spostamento a sinistra raddoppia il numero. In questo esempio, stiamo spostando i bit di a di una posizione a sinistra. Questo ha l'effetto di raddoppiare il valore di a.

- Shift a destra con segno `>>`: L'operatore di shift a destra con segno sposta i bit del numero verso destra, mantenendo il segno (positivo o negativo) del numero. Ogni spostamento a destra dimezza il numero. In questo esempio, stiamo spostando i bit di a di una posizione a destra. Questo ha l'effetto di dimezzare il valore di a.

- Shift a destra senza segno `>>>`: L'operatore di shift a destra senza segno funziona come l'operatore di shift a destra con segno, ma riempie gli spazi vuoti con zeri indipendentemente dal segno del numero. Questo operatore è rilevante solo per i numeri negativi. In questo esempio, stiamo spostando i bit di a di una posizione a destra. Poiché a è un numero negativo, l'operatore `>>>` riempie lo spazio vuoto con uno zero, cambiando il segno del numero.

---

### Assegnamento e bitwise

Ci sono anche **operatori di assegnamento bitwise** funzionano allo stesso modo degli operatori di assegnamento aritmetici, ma eseguono operazioni bitwise invece di operazioni aritmetiche.

- `&=` : Esegue un AND bitwise sul valore corrente della variabile e il valore alla sua destra e assegna il risultato alla variabile.
- `|=` : Esegue un OR bitwise sul valore corrente della variabile e il valore alla sua destra e assegna il risultato alla variabile.
- `^=` : Esegue un XOR bitwise sul valore corrente della variabile e il valore alla sua destra e assegna il risultato alla variabile.
- `<<=` : Sposta i bit del valore corrente della variabile a sinistra per il numero di posizioni specificato e assegna il risultato alla variabile.
- `>>=` : Sposta i bit del valore corrente della variabile a destra per il numero di posizioni specificato e assegna il risultato alla variabile.
- `>>>=` : Sposta i bit del valore corrente della variabile a destra per il numero di posizioni specificato, riempiendo con zeri a sinistra, e assegna il risultato alla variabile. Questo operatore è rilevante solo per i numeri negativi.

```java
// -- Operatori di assegnamento shift
System.out.println("Operatori di assegnamento shift");
int b = 5;
System.out.println(b &= 5); // 0
System.out.println(b |= 5); // 5
System.out.println(b <<= 5); // 160
System.out.println(b >>= 5); // 5
System.out.println(b >>>= 5); // 0     
```

---

## Altri operatori

Quelli che abbiamo visto sono molti operatori genericamente utilizzabili in Java, ma non sono la totalità. Ci mancano alcuni operatori come i ternari`? e :`, `istanceof`, e molti altri che in realtà sono operatori, tipo la parola chiave `new`. Tuttavia, incontreremo altri operatori che verranno spiegati solo quando ce ne sarà bisogno.

```java
// --- Operatori ternari
System.out.println("Operatori ternari");

int numero = 10;
String risultato = (numero > 5) ? "Maggiore di 5" : "Minore o uguale a 5";
System.out.println(risultato); // Output: Maggiore di 5
```