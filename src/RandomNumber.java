import javafx.scene.transform.MatrixType;

import java.util.Scanner;

public class RandomNumber {


    public void selector(int exercise){

        Scanner s = new Scanner(System.in);

        switch (exercise){

            case 22:
                System.out.println("Bienvenido al Ejercicio 22");
                /*
                Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
                aleatorio. La cabeza se representará con el carácter @ y se debe colocar
                exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
                el cuerpo irá serpenteando de la siguiente manera: se generará de forma
                aleatoria un valor entre tres posibles que hará que el siguiente carácter se
                coloque una posición a la izquierda del anterior, alineado con el anterior o una
                posición a la derecha del anterior. La longitud de la serpiente se pedirá por
                teclado y se supone que el usuario introducirá un dato correcto.
                 */

                System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
                int snakeLenght_22 = s.nextInt();
                int snakeAlign_22 = 12;
                snakeLenght_22--;
                for (int i = 0; i < snakeAlign_22; i++) {
                    System.out.print(" ");
                }
                System.out.println("@");
                do {
                int snakePosition_22 = (int) (Math.random()*3);
                    switch (snakePosition_22){

                        case 0:
                            snakeAlign_22 = (snakeAlign_22-1);
                            for (int i = 0; i < snakeAlign_22; i++) {
                                System.out.print(" ");
                            }
                            System.out.println("*");
                            break;

                        case 1:
                            for (int i = 0; i < snakeAlign_22; i++) {
                                System.out.print(" ");
                            }
                            System.out.println("*");
                            break;

                        case 2:
                            snakeAlign_22 = (snakeAlign_22+1);
                            for (int i = 0; i < snakeAlign_22; i++) {
                                System.out.print(" ");
                            }
                            System.out.println("*");
                            break;
                    }
                    snakeLenght_22--;
                }while(snakeLenght_22 != 0);
            break;

            case 23:
                System.out.println("Bienvenido al Ejercicio 23");
                /*
                Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
                Escribe un programa que genere de forma aleatoria la tirada de cinco dados.
                 */

                int shotCounter = 5;
                do {
                    int pokerShot_23 = (int) (Math.random()*6);

                    switch (pokerShot_23){

                        case 0:
                            System.out.print("As ");
                            break;

                        case 1:
                            System.out.print("K ");
                            break;

                        case 2:
                            System.out.print("Q ");
                            break;

                        case 3:
                            System.out.print("J ");
                            break;

                        case 4:
                            System.out.print("7 ");
                            break;

                        case 5:
                            System.out.print("8 ");
                            break;
                    }
                    shotCounter--;
                }while(shotCounter != 0);
                break;

            case 24:
                System.out.println("Bienvenido al Ejercicio 24");
                /*
                Escribe un programa que, dado un número introducido por teclado, elija al azar
                uno de sus dígitos.
                 */

                System.out.print("Por favor, introduzca un número entero positivo: ");
                long givenNumber_24 = s.nextLong();
                long givenNumber_24_copy = givenNumber_24;
                int digit_24 = 0;
                int lenghtCounter_24 = 0;

                do {
                    givenNumber_24_copy = givenNumber_24_copy /10;
                    lenghtCounter_24++;
                }while(givenNumber_24_copy != 0);

                int selector_24 = (int) (Math.random()*lenghtCounter_24);
                int selectorCounter_24 = 0;

                do{
                    digit_24 = (int)  givenNumber_24 % 10;
                    givenNumber_24 /= 10;

                    if(selector_24 == selectorCounter_24 ){
                        System.out.println(digit_24);
                        break;
                    }
                    selectorCounter_24++;
                    lenghtCounter_24--;
                }while(lenghtCounter_24 != 0);
                break;

            case 25:
                System.out.println("Bienvenido al Ejercicio 25");
                /*
                Escribe un programa que muestre por pantalla 100 números enteros separados
                por un espacio. Los números deben estar generados de forma aleatoria en
                un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
                almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).
                 */
                int randomNumber_25 = 0;
                int counterPrimo = 0;
                int counter_25 = 2;
                for (int i = 0; i < 100 ; i++) {
                    randomNumber_25 = (int) ((Math.random() * 191) + 10);

                    while((counter_25 != randomNumber_25)){
                        if (randomNumber_25 % counter_25 == 0){
                            counterPrimo++;
                        }
                        counter_25++;
                    }
                if ((counterPrimo == 0) && (counter_25 == randomNumber_25)){
                    System.out.print("#"+randomNumber_25+"# ");
                }else if(randomNumber_25 % 5 == 0){
                        System.out.print("["+randomNumber_25+"] ");
                }else{
                    System.out.print(randomNumber_25+" ");
                }
                counterPrimo = 0;
                counter_25 = 2;
                }
                break;

            case 26:
                System.out.println("Bienvenido al Ejercicio 26");
                /*
                Realiza un programa que pinte una tableta de turrón con un bocado realizado de
                forma aleatoria. El ancho y el alto de la tableta se pide por teclado. El bocado se
                da alrededor del turrón, obviamente no se puede dar un bocado por en medio
                de la tableta.
                 */
                System.out.print("Introduzca la anchura de la tableta: ");
                    int weightChocolat_26 = s.nextInt();
                System.out.print("Introduzca la altura de la tableta: ");
                    int heightChocolat_26 = s.nextInt();

                    int calcOfNumber = (weightChocolat_26 * heightChocolat_26) - ((heightChocolat_26-2)*(weightChocolat_26-2));
                    int chocolatBite = (int) (Math.random()*calcOfNumber)+1;

                    int counterChocolat = 0;

                for (int i = 0; i < weightChocolat_26; i++) {
                    counterChocolat++;
                    if (counterChocolat == chocolatBite){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println("");

                while(heightChocolat_26 != 2){
                    for (int i = 0; i < weightChocolat_26; i++) {
                        if(i == 0){
                            counterChocolat++;
                            if (counterChocolat == chocolatBite){
                                System.out.print(" ");
                            }else{
                                System.out.print("*");
                            }
                        }else if(i==weightChocolat_26-1){
                            counterChocolat++;
                            if (counterChocolat == chocolatBite){
                                System.out.print(" ");
                            }else{
                                System.out.print("*");
                            }
                        }else{
                            System.out.print("*");
                        }
                    }
                    heightChocolat_26--;
                    System.out.println("");
                }

                for (int i = 0; i < weightChocolat_26; i++) {
                    counterChocolat++;
                    if (counterChocolat == chocolatBite){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println("");
                break;

            case 27:
                System.out.println("Bienvenido al Ejercicio 27");
                /*
                Implementa el juego piedra, papel y tijera. Primero, el usuario introduce su
                jugada y luego el ordenador genera al azar una de las opciones. Si el usuario
                introduce una opción incorrecta, el programa deberá mostrar un mensaje de
                error
                 */

                System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
                    String player1_27 = s.next();

                    if(!player1_27.equals("piedra") && !player1_27.equals("papel") && !player1_27.equals("tijera")){
                        System.out.println("Error, los datos introducidos no son correctos.");
                        break;
                    }

                    int cpuPlayer_27 = (int) (Math.random()*3)+1;
                    String result_27 = "";
                System.out.print("Turno del ordenador: ");

                    switch (cpuPlayer_27){
                        case 1:
                            System.out.println("piedra");

                            if(player1_27.equals("papel")){
                                result_27 = "Gana el jugador";
                            }else if(player1_27.equals("tijera")){
                                result_27 = "Gana el ordenador";
                            }else{
                                result_27 = "Empate";
                            }
                            break;
                        case 2:
                            System.out.println("papel");

                            if(player1_27.equals("tijera")){
                                result_27 = "Gana el jugador";
                            }else if(player1_27.equals("piedra")){
                                result_27 = "Gana el ordenador";
                            }else{
                                result_27 = "Empate";
                            }
                            break;
                        case 3:
                            System.out.println("tijera");

                            if(player1_27.equals("piedra")){
                                result_27 = "Gana el jugador";
                            }else if(player1_27.equals("papel")){
                                result_27 = "Gana el ordenador";
                            }else{
                                result_27 = "Empate";
                            }
                            break;
                    }
                System.out.println(result_27);
                break;

            case 28:
                System.out.println("Bienvenido al Ejercicio 28");
                /*
                Realiza un programa que sea capaz de recolocar los números de un array de
                fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
                del array. A continuación generará un array con ese tamaño con números
                enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
                irá colocando desde fuera hacia adentro los números de tal forma que el
                primero se coloca en la primera posición, el segundo en la última, el tercero
                en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto en la
                antepenúltima, etc. Se debe mostrar por pantalla tanto el array original como
                el array resultado
                 */
                System.out.print("Introduzca el tamaño del array: ");
                int originalArray_28_lenght = s.nextInt();
                int randomValue = 0;
                int[] originalArray_28 = new int[originalArray_28_lenght];
                System.out.println("");
                System.out.println("Array original:");
                System.out.print("Indice");
                for (int i = 0; i < originalArray_28_lenght; i++) {
                    System.out.printf("%5d",i);
                }
                System.out.println("");
                System.out.print("Valor ");
                for (int i = 0; i < originalArray_28_lenght; i++) {
                    randomValue = (int) (Math.random() * 201);
                    originalArray_28[i] = randomValue;
                    System.out.printf("%5d", originalArray_28[i]);
                }
                System.out.println("");


                int [] reverseArray_28 = new int[originalArray_28_lenght];
                int endCounter_28 = originalArray_28_lenght-1;
                int startCounter_28 = 0;
                for (int i = 0; i < originalArray_28_lenght; i++) {

                    if(i % 2 == 0){
                      reverseArray_28[startCounter_28] = originalArray_28[i];
                        startCounter_28++;
                    }else{
                        reverseArray_28[endCounter_28] = originalArray_28[i];
                        endCounter_28--;
                    }
                }
                System.out.println("");
                System.out.println("Array resultado:");
                System.out.print("Indice");
                for (int i = 0; i < originalArray_28_lenght; i++) {
                    System.out.printf("%5d",i);
                }
                System.out.println("");
                System.out.print("Valor ");
                for (int i = 0; i < originalArray_28_lenght; i++) {
                    System.out.printf("%5d", reverseArray_28[i]);
                }
                System.out.println("");
                break;

            case 29:
                System.out.println("Bienvenido al Ejercicio 29");
                /*
                Realiza un programa que muestre la previsión del tiempo para mañana en
                Málaga. Las temperaturas máxima y mínima se deben generar de forma
                aleatoria entre los intervalos máximos y mínimos absolutos medidos en las
                últimas décadas para cada estación. La probabilidad de que esté soleado
                o nublado en cada estación se proporciona a continuación. Obviamente, la
                temperatura mínima deberá ser menor o igual que la temperatura máxima.
                 */

                System.out.println("1. Primavera");
                System.out.println("2. Verano");
                System.out.println("3. Otoño");
                System.out.println("4. Invierno");
                System.out.print("Seleccione la estación del año (1-4): ");
                int seasonSelection_29 = s.nextInt();
                int min = 0;
                int max = 0;
                int diff1 = 0;
                int diff2 = 0;
                int probabilidad = 0;
                String tiempo = "";

                switch (seasonSelection_29){

                    case 1://Primavera
                        min = 15;
                        max = 30;
                        probabilidad = (int) (Math.random()*10)+1;
                        diff1 = max - min;
                        diff1 += 1;
                        min = (int) (Math.random()*diff1)+min;
                        diff2 = max - min;
                        diff2 += 1;
                        max = (int) (Math.random()*diff2)+min;
                        if (probabilidad <= 6) {
                            tiempo = "Soleado";
                        }else{
                            tiempo = "Nublado";
                        }
                        break;

                    case 2://Verano
                        min = 25;
                        max = 45;
                        probabilidad = (int) (Math.random()*10)+1;
                        diff1 = max - min;
                        diff1 += 1;
                        min = (int) (Math.random()*diff1)+min;
                        diff2 = max - min;
                        diff2 += 1;
                        max = (int) (Math.random()*diff2)+min;
                        if (probabilidad <= 8) {
                            tiempo = "Soleado";
                        }else{
                            tiempo = "Nublado";
                        }
                        break;

                    case 3://Otoño
                        min = 20;
                        max = 30;
                        probabilidad = (int) (Math.random()*10)+1;
                        diff1 = max - min;
                        diff1 += 1;
                        min = (int) (Math.random()*diff1)+min;
                        diff2 = max - min;
                        diff2 += 1;
                        max = (int) (Math.random()*diff2)+min;
                        if (probabilidad <= 4) {
                            tiempo = "Soleado";
                        }else{
                            tiempo = "Nublado";
                        }
                        break;

                    case 4://Invierno
                        min = 0;
                        max = 25;
                        probabilidad = (int) (Math.random()*10)+1;
                        diff1 = max - min;
                        diff1 += 1;
                        min = (int) (Math.random()*diff1)+min;
                        diff2 = max - min;
                        diff2 += 1;
                        max = (int) (Math.random()*diff2)+min;
                        if (probabilidad <= 2) {
                            tiempo = "Soleado";
                        }else{
                            tiempo = "Nublado";
                        }
                        break;
                }
                System.out.println("");
                System.out.println("Previsión del tiempo para mañana");
                System.out.println("--------------------------------");
                System.out.println("Temperatura mínima: "+min+"ºC");
                System.out.println("Temperatura máxima: "+max+"ºC");
                System.out.println(tiempo);
                break;

            case 30:
                System.out.println("Bienvenido al Ejercicio 30");
                /*
                El pequeño Roberto tenía como mascota un pececillo dentro de una pecera. Los
                Reyes Magos le han traído un caballito de mar ($) y una caracola (@) para que
                le hagan compañía al pez. Realiza un programa que pinte por pantalla la pecera
                con los tres animalitos acuáticos colocados dentro en posiciones aleatorias. Por
                una cuestión de física elemental, ninguno de los animales puede coincidir
                en la misma posición. Se debe pedir al usuario el ancho y el alto de la pecera,
                que como mínimo serán de 4 unidades
                 */

                System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
                    int fishbowlHeight = s.nextInt();
                System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
                    int fishbowlWeight = s.nextInt();

                    if (fishbowlHeight < 4 || fishbowlWeight < 4){
                        System.out.println("Error, los datos introducidos son incorrectos.");

                    }else{

                        int calcOfNumber_30 = (fishbowlWeight-2)*(fishbowlHeight-2);
                        calcOfNumber_30 += 1;

                        int fish_30 = 0;
                        int conch_30 = 0;
                        int seahorse_30 = 0;

                        do{
                            fish_30 = (int) (Math.random()*calcOfNumber_30);
                            conch_30 = (int) (Math.random()*calcOfNumber_30);
                            seahorse_30 = (int) (Math.random()*calcOfNumber_30);
                        }while(fish_30 == conch_30 || fish_30 == seahorse_30 || conch_30 == seahorse_30);

                        int counter_30 = 0;
                        fishbowlHeight = fishbowlHeight-2;
                        int fishbowlHeight_copy = fishbowlHeight;
                        for (int i = 0; i < fishbowlWeight; i++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                        while(fishbowlHeight_copy != 0){
                            for (int i = 0; i < fishbowlWeight; i++) {

                                if (i==0){
                                    System.out.print("*");
                                }else if(i == fishbowlWeight-1){
                                    System.out.print("*");
                                }else{
                                    counter_30++;

                                    if (counter_30 == fish_30){
                                        System.out.print("&");
                                    }else if(counter_30 == conch_30){
                                        System.out.print("@");
                                    }else if(counter_30 == seahorse_30){
                                        System.out.print("$");
                                    }else{
                                        System.out.print(" ");
                                    }

                                }
                            }
                            fishbowlHeight_copy--;
                            System.out.println("");
                        }

                        for (int i = 0; i < fishbowlWeight; i++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                break;

            case 31:
                System.out.println("Bienvenido al Ejercicio 31");
                /*
                Realiza el juego del “Craps”. Las reglas son las siguientes: Al comenzar la
                partida, el jugador introduce la cantidad de dinero que quiere apostar. Se
                muestra la tirada aleatoria de dos dados. Si entre los dos dados suman 7 u
                11, el jugador gana la misma cantidad que apostó y termina la partida. Por ej.
                si apostó 1000 €, gana otros 1000 € y acaba con 2000 €. Si entre los dos dados
                suman 2, 3 o 12, el jugador pierde su dinero y termina la partida. Si no se
                da ninguno de los casos anteriores, es decir si sale 4, 5, 6, 8, 9 o 10, el juego
                entra en una segunda etapa. En esta etapa, el jugador buscará volver a obtener
                ese número en los dados. Si consigue repetir ese número, gana. Si sale un 7,
                pierde. Si sale otro número, tiene que seguir tirando.
                 */

                System.out.print("Por favor, introduzca la cantidad de dinero que quiera apostar: ");
                    int playerMoney = s.nextInt();
                System.out.println("╔══════════════════════════════════════════════════════════════╗");
                System.out.println("║   ◯ PARTIDA EN CURSO ◯                                       ║");
                System.out.println("║   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓                            ║");
                System.out.printf("║   ┃ DINERO EN JUEGO ┃ %7d € ┃                            ║\n", playerMoney);
                System.out.println("║   ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛                            ║");
                System.out.println("║   Se va a proceder con el lanzamiento de los dos dados.      ║");
                System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                int dado1_31 = (int) (Math.random()*6)+1;
                switch (dado1_31){

                    case 1:
                        System.out.println("║   Dado 1: 1                                                  ║");
                        break;

                    case 2:
                        System.out.println("║   Dado 1: 2                                                  ║");
                        break;

                    case 3:
                        System.out.println("║   Dado 1: 3                                                  ║");
                        break;

                    case 4:
                        System.out.println("║   Dado 1: 4                                                  ║");
                        break;

                    case 5:
                        System.out.println("║   Dado 1: 5                                                  ║");
                        break;

                    case 6:
                        System.out.println("║   Dado 1: 6                                                  ║");
                        break;
                }

                int dado2_31 = (int) (Math.random()*6)+1;
                switch (dado2_31){

                    case 1:
                        System.out.println("║   Dado 2: 1                                                  ║");
                        break;

                    case 2:
                        System.out.println("║   Dado 2: 2                                                  ║");
                        break;

                    case 3:
                        System.out.println("║   Dado 2: 3                                                  ║");
                        break;

                    case 4:
                        System.out.println("║   Dado 2: 4                                                  ║");
                        break;

                    case 5:
                        System.out.println("║   Dado 2: 5                                                  ║");
                        break;

                    case 6:
                        System.out.println("║   Dado 2: 6                                                  ║");
                        break;

                }

                int suma_31 = dado1_31 + dado2_31;
                System.out.printf("║   La suma de los dados es: %2d                                ║\n",suma_31);
                switch (suma_31){

                    case 7:
                    case 11:
                        System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                        System.out.printf("║   Has ganado: %7d €                                      ║\n",playerMoney);
                        System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                        playerMoney *= 2;
                        break;

                    case 2:
                    case 3:
                    case 12:
                        System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                        System.out.printf("║   Has perdido: %7d €                                     ║\n",playerMoney);
                        System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                        playerMoney = 0;
                        break;

                    default:
                        System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                        System.out.println("║   ◯ SEGUNDA ETAPA ◯                                          ║");
                        System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                        System.out.printf("║   Si la suma de los siguientes dados es %2d ganas.            ║\n",suma_31);
                        System.out.println("║   Si es 7 pierdes.                                           ║ ");
                        System.out.printf("║   Si no es %2d ni 7, repites la tirada.                       ║\n",suma_31);
                        int counter_31 = 0;
                        int suma2_31 = 0;
                        do {
                            dado1_31 = (int) (Math.random()*6)+1;
                            dado2_31 = (int) (Math.random()*6)+1;
                            suma2_31 = dado2_31 + dado1_31;
                            counter_31++;
                            if (counter_31 == 1){
                                System.out.println("╠═══════════════════╦═════════════╦═════════════╦══════════════╣ ");
                            }else{
                                System.out.println("╠═══════════════════╬═════════════╬═════════════╬══════════════╣ ");
                            }
                            System.out.printf("║   ◯ TIRADA %2d ◯   ║  Dado 1: %1d  ║  Dado 2: %1d  ║   Suma: %2d   ║\n",counter_31, dado1_31,dado2_31,suma2_31);
                        }while(suma2_31 != suma_31 && suma2_31 != 7);

                        if(suma2_31 == suma_31){
                            System.out.println("╠═══════════════════╩═════════════╩═════════════╩══════════════╣ ");
                            System.out.printf("║   Has ganado: %7d €                                      ║\n",playerMoney);
                            System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                            playerMoney *= 2;
                        }else{
                            System.out.println("╠═══════════════════╩═════════════╩═════════════╩══════════════╣ ");
                            System.out.printf("║   Has perdido: %7d €                                     ║\n",playerMoney);
                            System.out.println("╠══════════════════════════════════════════════════════════════╣ ");
                            playerMoney = 0;
                        }
                        break;

                }

                System.out.println("║   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓                           ║");
                System.out.printf("║   ┃ DINERO A RETIRAR ┃ %7d € ┃                           ║\n", playerMoney);
                System.out.println("║   ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛                           ║");
                System.out.println("║   El juego ha finalizado, gracias.                           ║");
                System.out.println("╚══════════════════════════════════════════════════════════════╝");
                break;

            case 32:
                System.out.println("Bienvenido al Ejercicio 32");
                /*
                Realiza un programa que pinte un sendero aleatorio. Los bordes se pintan con
                el carácter “|”. La anchura del sendero siempre es la misma, los dos caracteres
                del borde más cuatro caracteres en medio, en total 6 caracteres (incluyendo
                espacios). A cada metro, el sendero puede continuar recto, girar un carácter a
                la izquierda o girar un carácter a la derecha, por supuesto de forma aleatoria.
                Por cada metro de sendero - representado por una línea - puede que haya un
                obstáculo o puede que no, la probabilidad es del 50%. La posición del obstáculo
                es aleatoria dentro de la línea. En caso de existir un obstáculo en un metro de
                sendero (en una línea), puede ser una planta (carácter *) o una piedra (carácter
                O), la probabilidad de que salga uno u otro es la misma. Recuerda que nunca
                habrá más de un obstáculo por metro de sendero, habrá uno o ninguno.
                 */
                System.out.print("Introduzca la longitud del sendero en metros: ");
                    int wayLenght = s.nextInt();

                    int wayWeight = 6;
                    int habitableWayWeight = wayWeight-2;
                    int wayDirection = 2;
                    int spaceBeforeWay=10;
                    int counter_32 = 0;
                    int randomObstacle = 0;
                    int typeRandomObstacle = 0;
                    int obstaclePosition = 0;
                    String obstacle = "";
                    do {
                        randomObstacle = (int) (Math.random()*2);
                        obstaclePosition = (int) (Math.random()*4)+1;
                        if (randomObstacle == 0){
                            obstacle = " ";
                        }else{
                            typeRandomObstacle = (int) (Math.random()*2)+1;

                            if (typeRandomObstacle == 1){
                                obstacle = "*";
                            }else{
                                obstacle = "O";
                            }
                        }
                        for (int i = 0; i < spaceBeforeWay ; i++) {
                            System.out.print(" ");
                        }
                        System.out.print("|");
                        for (int i = 0; i < habitableWayWeight; i++) {
                            counter_32++;

                            if (counter_32 == obstaclePosition){
                                System.out.print(obstacle);
                            }else{
                                System.out.print(" ");
                            }

                        }
                        counter_32 = 0;
                        System.out.print("|");
                        wayLenght--;
                        wayDirection = (int) (Math.random()*3)+1;

                        switch (wayDirection){

                            case 1:
                            spaceBeforeWay--;
                                break;

                            case 2:
                                spaceBeforeWay=spaceBeforeWay;
                                break;

                            case 3:
                                spaceBeforeWay++;
                                break;
                        }
                        System.out.println("");
                    }while(wayLenght != 0);
                break;
        }
    }
}
