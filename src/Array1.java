import java.rmi.MarshalException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Array1 {

    public void selector(int exercise){

            Scanner s = new Scanner(System.in);

            switch (exercise){

                case 10:
                    System.out.println("Bienvenido al Ejercicio 10");
                    /*
                    Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
                    y que los almacene en un array. El programa debe ser capaz de pasar todos
                    los números pares a las primeras posiciones del array (del 0 en adelante) y
                    todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
                    necesario.
                     */

                    int [] startedArray_10 = new int[20] ;
                    int [] endArray_10 = new int[20] ;
                    int randomNumber_10 = 0;
                    int parCounter_10 = 0;
                    int counter_10 = 0;

                    System.out.println("");
                    System.out.println("Array original:");
                    System.out.print("Indice");
                    for (int i = 0; i < 20; i++) {
                        System.out.printf("%5d",i);
                    }
                    System.out.println("");
                    System.out.print("Valor ");
                    for (int i = 0; i < 20; i++) {
                        randomNumber_10 = (int) (Math.random() * 101);
                        if (randomNumber_10 % 2 == 0){
                            parCounter_10++;
                        }
                        startedArray_10[i] = randomNumber_10;
                        System.out.printf("%5d", startedArray_10[i]);
                    }
                    System.out.println("");
                    System.out.println("");

                    System.out.println("Array Resultado:");
                    System.out.print("Indice");
                    for (int i = 0; i < 20; i++) {
                        System.out.printf("%5d",i);
                    }
                    System.out.println("");
                    System.out.print("Valor ");
                    for (int i = 0; i < 20; i++) {

                        if (startedArray_10[i] % 2 == 0){
                            endArray_10[counter_10] = startedArray_10[i];
                            counter_10++;
                        }else{
                            endArray_10[parCounter_10] = startedArray_10[i];
                            parCounter_10++;
                        }
                    }
                    for (int i = 0; i < 20; i++) {
                        System.out.printf("%5d", endArray_10[i]);
                    }
                    System.out.println("");
                    break;

                case 11:
                    System.out.println("Bienvenido al Ejercicio 11");
                    /*
                    Realiza un programa que pida 10 números por teclado y que los almacene en
                    un array. A continuación se mostrará el contenido de ese array junto al índice
                    (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
                    primos a las primeras posiciones, desplazando el resto de números (los que no
                    son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
                    array resultante.
                     */

                    int [] startedArray_11 = new int[10];
                    int [] endArray_11 = new int[10];
                    int counter_11=0;
                    int counter_0_11 = 0;
                    int counter_primo_11 = 0;

                    System.out.println("Introduzca 10 números");
                    System.out.println("");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Número "+(i+1)+": ");
                        startedArray_11[i] = s.nextInt();
                    }
                    System.out.println("");
                    System.out.println("Array original:");
                    System.out.print("Indice");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d",i);
                    }
                    System.out.println("");
                    System.out.print("Valor ");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d", startedArray_11[i]);
                    }
                    System.out.println("");
                    System.out.println("");

                    for (int i = 0; i < 10; i++) {

                        do {
                            counter_11++;
                           if (startedArray_11[i] % counter_11 == 0){
                               counter_0_11++;
                           }

                        }while (startedArray_11[i] != counter_11);

                        if (counter_0_11 == 2 && startedArray_11[i] != 1){
                            endArray_11[counter_primo_11] = startedArray_11[i];
                            counter_primo_11++;
                        }
                    counter_11 = 0;
                    counter_0_11 = 0;
                    }

                    for (int i = 0; i < 10; i++) {
                        do {
                            counter_11++;
                            if (startedArray_11[i] % counter_11 == 0){
                                counter_0_11++;
                            }

                        }while (startedArray_11[i] != counter_11);

                        if (counter_0_11 != 2){
                            endArray_11[counter_primo_11] = startedArray_11[i];
                            counter_primo_11++;
                        }
                        counter_11 = 0;
                        counter_0_11 = 0;
                    }


                    System.out.println("Array resultado:");
                    System.out.print("Indice");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d",i);
                    }
                    System.out.println("");
                    System.out.print("Valor ");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d", endArray_11[i]);
                    }
                    System.out.println("");
                    System.out.println("");

                    break;
                case 12:
                    System.out.println("Bienvenido al Ejercicio 12");
                    /*
                    Realiza un programa que pida 10 números por teclado y que los almacene en
                    un array. A continuación se mostrará el contenido de ese array junto al índice
                    (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
                    “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
                    números están entre 0 y 9. El programa deberá colocar el número de la posición
                    inicial en la posición final, rotando el resto de números para que no se pierda
                    ninguno. Al final se debe mostrar el array resultante.
                     */

                    int [] startedArray_12 = new int[10];
                    int [] endArray_12 = new int[10];

                    System.out.println("Introduzca 10 números");
                    System.out.println("");
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Número "+i+": ");
                        startedArray_12[i] = s.nextInt();
                    }

                    System.out.println("");

                    System.out.println("Array original:");
                    System.out.print("Indice");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d",i);
                    }
                    System.out.println("");
                    System.out.print("Valor ");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d", startedArray_12[i]);
                    }
                    
                    System.out.println("");
                    System.out.println("");

                    System.out.print("Posición inicial: ");
                    int initialPosition_12 = s.nextInt();
                    System.out.print("Posición final: ");
                    int endPosition_12 = s.nextInt();
                    System.out.println("");

                    if (initialPosition_12 >= endPosition_12 || initialPosition_12 < 0 || endPosition_12 > 9){
                        System.out.println("Error, los datos introducidos no son correctos.");
                        break;
                    }
                    for (int i = 0; i < 10; i++) {
                        if (i == 0){
                            endArray_12[i]= startedArray_12[9];
                        }else if( i <= initialPosition_12){
                            endArray_12[i]= startedArray_12[i-1];
                        }else if (i < endPosition_12){
                            endArray_12[i]= startedArray_12[i];
                        }else if (i == endPosition_12){
                            endArray_12[endPosition_12] = startedArray_12[initialPosition_12];
                        }else if ( i > endPosition_12 && i != 9){
                           endArray_12[i]= startedArray_12[i-1];
                        }else {
                            endArray_12[0] = startedArray_12[9];
                            endArray_12[i] = startedArray_12[i-1];
                        }
                    }

                    System.out.println("Array resultado:");
                    System.out.print("Indice");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d",i);
                    }
                    System.out.println("");
                    System.out.print("Valor ");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%5d", endArray_12[i]);
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
                case 13:
                    System.out.println("Bienvenido al Ejercicio 13");
                    /*
                    Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
                    el programa mostrará el array y preguntará si el usuario quiere destacar el
                    máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
                    el número destacado entre dobles asteriscos.
                     */

                    int [] initialArray_13 = new int[100];
                    int randomNumber_13 = 0;
                    int lowerNumber = 0;
                    int higherNumber = 0;
                    int counter_13 = 1;
                    int arrayLineCalc = initialArray_13.length/5;
                    for (int i = 0; i < initialArray_13.length; i++) {

                        randomNumber_13 = (int) (Math.random() * 501);
                        initialArray_13[i] = randomNumber_13;

                        if ( initialArray_13[i] > higherNumber){
                            higherNumber = initialArray_13[i];
                        }
                        System.out.print(initialArray_13[i]+" ");
                        if (counter_13 == arrayLineCalc){
                            System.out.println("");
                            counter_13 = 0;
                        }
                            counter_13++;
                    }
                        lowerNumber = higherNumber;

                    for (int i = 0; i < initialArray_13.length; i++) {
                        if(initialArray_13[i]<lowerNumber){
                            lowerNumber = initialArray_13[i];
                        }
                    }
                    System.out.println("");
                    System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
                        int selection_13 = s.nextInt();

                    counter_13 = 1;
                    System.out.println("");
                    for (int i = 0; i < initialArray_13.length; i++) {

                        if(initialArray_13[i] == lowerNumber && selection_13 == 1){

                            System.out.print("**"+initialArray_13[i]+"** ");

                        }else if (initialArray_13[i] == higherNumber && selection_13 == 2){
                            System.out.print("**"+initialArray_13[i]+"** ");
                        }else{
                            System.out.print(initialArray_13[i]+" ");
                        }

                        if (counter_13 == arrayLineCalc){
                            System.out.println("");
                            counter_13 = 0;
                        }
                        counter_13++;

                    }
                    break;
                case 14:
                    System.out.println("Bienvenido al Ejercicio 14");
                    /*
                    Escribe un programa que pida 8 palabras y las almacene en un array. A
                    continuación, las palabras correspondientes a colores se deben almacenar al
                    comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
                    auxiliares como quieras. Los colores que conoce el programa deben estar en
                    otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
                    blanco y morado.
                     */

                    String[] color_14 = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

                    String [] word_14 = new String[8];
                    String [] endWord_14 = new String[8];
                    int colorCounter_14 = 0;
                    int counter_14 = 0;

                    System.out.println("Introduzca 8 palabras");

                    for (int i = 0; i < word_14.length; i++) {
                        System.out.print("Palabra "+i+": ");
                            word_14[i]= s.next();
                        for (int j = 0; j < color_14.length; j++) {
                            if (word_14[i].equals(color_14[j])){
                                colorCounter_14++;
                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("Array original:");
                    System.out.print("┌");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("─");
                        }
                        if(i != 7){
                            System.out.print("┬");
                        }else{
                            System.out.print("┐");
                        }
                    }
                    System.out.println("");
                    System.out.print("│");
                    for (int i = 0; i < 8; i++) {

                        for (int j = 0; j < 3; j++) {
                            System.out.print(" ");
                        }
                        System.out.print(i);
                        for (int j = 0; j < 4; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("│");
                    }
                    System.out.println("");
                    System.out.print("├");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("─");
                        }
                        if(i != 7){
                            System.out.print("┼");
                        }else{
                            System.out.print("┤");
                        }
                    }
                    System.out.println("");
                    System.out.print("│");
                    for (int i = 0; i < 8; i++) {

                        System.out.printf("%-8s",word_14[i]);
                        System.out.print("│");
                    }
                    System.out.println("");
                    System.out.print("└");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("─");
                        }
                        if(i != 7){
                            System.out.print("┴");
                        }else{
                            System.out.print("┘");
                        }
                    }
                    System.out.println("");//Result----------------------------------------------------------------
                    System.out.println("Array resultado:");
                    System.out.print("┌");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("─");
                        }
                        if(i != 7){
                            System.out.print("┬");
                        }else{
                            System.out.print("┐");
                        }
                    }
                    System.out.println("");
                    System.out.print("│");
                    for (int i = 0; i < 8; i++) {

                        for (int j = 0; j < 3; j++) {
                            System.out.print(" ");
                        }
                        System.out.print(i);
                        for (int j = 0; j < 4; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("│");
                    }
                    System.out.println("");
                    System.out.print("├");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("─");
                        }
                        if(i != 7){
                            System.out.print("┼");
                        }else{
                            System.out.print("┤");
                        }
                    }
                    System.out.println("");
                    for (int i = 0; i < 8; i++) {
                        boolean validator_14 = false;
                        for (int j = 0; j < 9 ; j++) {
                            if (word_14[i].equals(color_14[j])){
                                endWord_14[counter_14] = word_14[i];
                                counter_14++;
                                validator_14 = true;
                            }
                        }

                        if(validator_14 == false) {
                            endWord_14[colorCounter_14] = word_14[i];
                            colorCounter_14++;
                        }

                    }
                    System.out.print("│");
                    for (int i = 0; i < 8; i++) {
                        System.out.printf("%-8s",endWord_14[i]);
                        System.out.print("│");
                    }
                    System.out.println("");
                    System.out.print("└");
                    for (int i = 0; i < 8; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("─");
                        }
                        if(i != 7){
                            System.out.print("┴");
                        }else{
                            System.out.print("┘");
                        }
                    }
                    System.out.println("");
                    break;
                case 15:
                    System.out.println("Bienvenido al Ejercicio 15");
                    /*
                    Un restaurante nos ha encargado una aplicación para colocar a los clientes en
                    sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
                    (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
                    el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
                    un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
                    “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
                    como máximo e intente de nuevo”. Para el grupo que llega, se busca
                    siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
                    busca donde haya un hueco para el grupo, por ejemplo si el grupo es de
                    dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
                    las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
                    nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
                    pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
                    programa se ilustra a continuación:
                     */

                    int [] tableArray = new int[10];
                    int randomTableUser = 0;

                    System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
                    System.out.print("│Mesa nº  │");
                    for (int i = 0; i < tableArray.length ; i++) {
                        randomTableUser= (int) (Math.random()*5);
                        tableArray[i] = randomTableUser;
                        System.out.printf(" %2d │",i+1);
                    }
                    System.out.println("");
                    System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
                    System.out.print("│Ocupación│");
                    for (int i = 0; i < tableArray.length ; i++) {
                        System.out.printf(" %2d │",tableArray[i]);
                    }
                    System.out.println("");
                    System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
                    System.out.println("");
                    System.out.println("");
                    int tableUser = 0;
                    do{
                        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
                             tableUser = s.nextInt();
                        if(tableUser > 4 || tableUser < -1 || tableUser == 0){
                            System.out.println("Lo siento, no admitimos grupos de "+tableUser+", haga grupos de 1 a 4 personas como máximo e intente de nuevo");
                            break;
                        }
                        if (tableUser != -1){
                            boolean validator = false;
                            while(!validator){
                                for (int j = 0; j < tableArray.length; j++) {
                                    if(!validator && tableArray[j] == 0){
                                        tableArray[j] = tableUser;
                                        System.out.println("Por favor, siéntense en la mesa número "+(j+1)+".");
                                        validator = true;
                                    }
                                }
                                for (int j = 0; j < tableArray.length; j++) {
                                    if (!validator && tableArray[j] + tableUser == 4){
                                        tableArray[j] = tableUser + tableArray[j];
                                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(j+1)+".");
                                        validator = true;
                                    }
                                }
                                for (int j = 0; j < tableArray.length; j++) {
                                    if (!validator && tableArray[j] + tableUser < 4){
                                        tableArray[j] = tableUser + tableArray[j];
                                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(j+1)+".");
                                        validator = true;
                                    }
                                }
                                for (int j = 0; j < tableArray.length; j++) {
                                    if(!validator){
                                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                                        validator = true;
                                    }
                                }
                            }
                        }

                        System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
                        System.out.print("│Mesa nº  │");
                        for (int i = 0; i < tableArray.length ; i++) {
                            System.out.printf(" %2d │",i+1);
                        }
                        System.out.println("");
                        System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
                        System.out.print("│Ocupación│");
                        for (int i = 0; i < tableArray.length ; i++) {
                            System.out.printf(" %2d │",tableArray[i]);
                        }
                        System.out.println("");
                        System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
                        System.out.println("");
                        System.out.println("");

                    }while(tableUser != -1);
                    System.out.println("Gracias. Hasta pronto.");

                    break;
                case 16:
                    System.out.println("Bienvenido al Ejercicio 16");
                    /*
                    Escribe un programa que rellene un array de 20 elementos con números enteros
                    aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
                    programa mostrará el array y preguntará si el usuario quiere resaltar los
                    múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
                    escribiendo los números que se quieren resaltar entre corchetes.
                     */
                    int [] array_16 = new int[20];
                    for (int i = 0; i < array_16.length; i++) {
                        array_16[i] = (int) (Math.random()*401);
                        System.out.print(array_16[i]+" ");
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.print("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
                        int selection_16 = s.nextInt();
                    System.out.println("");
                        if (selection_16 == 1){
                            for (int i = 0; i < array_16.length; i++) {
                                if (array_16[i] % 5 == 0){
                                    System.out.print("["+array_16[i]+"] ");
                                }else{
                                    System.out.print(array_16[i]+" ");
                                }

                            }
                        }else if (selection_16 == 2){
                            for (int i = 0; i < array_16.length; i++) {
                                if (array_16[i] % 7 == 0){
                                    System.out.print("["+array_16[i]+"] ");
                                }else{
                                    System.out.print(array_16[i]+" ");
                                }

                            }
                        }else{
                            System.out.println("Error, el dato introducido no es correcto.");
                            break;
                        }
                    break;
                case 17:
                    System.out.println("Bienvenido al Ejercicio 17");
                    /*
                    Escribe un programa que muestre por pantalla un array de 10 números enteros
                    generados al azar entre 0 y 100. A continuación, el programa debe pedir un
                    número al usuario. Se debe comprobar que el número introducido por teclado
                    se encuentra dentro del array, en caso contrario se mostrará un mensaje por
                    pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
                    correctamente. A continuación, el programa rotará el array hacia la derecha
                    las veces que haga falta hasta que el número introducido quede situado en la
                    posición 0 del array. Por último, se mostrará el array rotado por pantalla.
                     */

                    int [] array_17 = new int[10];
                    int [] arrayCopy_17 = new int[10];
                    int selection_17 = 0;
                    boolean validator = false;
                    for (int i = 0; i < array_17.length; i++) {
                        array_17[i] = (int) (Math.random()*99)+1;
                        System.out.print(array_17[i]+" ");
                    }
                    System.out.println("");
                    do{
                        System.out.print("Introduzca un número del 1 al 99: ");
                            selection_17 = s.nextInt();
                        for (int i = 0; i < array_17.length; i++) {
                            if(array_17[i] == selection_17){
                                validator = true;
                            }
                        }
                        System.out.println("");
                        if(!validator){
                            System.out.println("El número "+selection_17+" no se encuentra dentro de la lista");
                        }else{
                            System.out.println("El número "+selection_17+" si se encuentra dentro de la lista");

                            if (selection_17 == array_17[0]){
                                for (int i = 0; i < array_17.length; i++) {
                                    System.out.print(array_17[i]+" ");
                                }
                            }else{
                                do {
                                    for (int i = 0; i < array_17.length; i++) {
                                        if (i == 0){
                                            arrayCopy_17[i] = array_17[array_17.length-1];
                                        }else{
                                            arrayCopy_17[i] = array_17[i-1];
                                        }
                                    }
                                    for (int i = 0; i < array_17.length; i++) {
                                        if (i == 0){
                                            array_17[i] = arrayCopy_17[0];
                                        }else{
                                            array_17[i] = arrayCopy_17[i];
                                        }
                                    }
                                }while( selection_17 != arrayCopy_17[0]);
                            }
                        }
                    }while(!validator);
                    System.out.println("");
                    for (int i = 0; i < array_17.length; i++) {
                        System.out.print(arrayCopy_17[i]+" ");
                    }
                    break;
                case 18:
                    System.out.println("Bienvenido al Ejercicio 18");
                    /*
                    Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
                    ambos incluidos y que los almacene en un array. A continuación, el programa
                    debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
                    programa debe colocar de forma alterna y en orden los menores o iguales de
                    100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
                    mayor… Cuando se acaben los menores o los mayores, se completará con los
                    números que queden.
                     */
                    int [] array_18 = new int[10];
                    int [] arrayCopy_18 = new int[10];

                    System.out.println("Array original:");
                    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
                    System.out.print("│ Índice │");
                    for (int i = 0; i < array_18.length; i++) {
                        System.out.printf("   %1d │",i);
                    }
                    System.out.println("");
                    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
                    System.out.print("│ Valor  │");
                    for (int i = 0; i < array_18.length; i++) {
                        array_18[i] = (int) (Math.random()*201);
                        System.out.printf(" %3d │",array_18[i]);
                    }
                    System.out.println("");
                    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

                    System.out.println("");
                    System.out.println("");

                    int counter_18 = 0;
                    boolean validator_18 = false;

                    System.out.println("Array resultado:");
                    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
                    System.out.print("│ Índice │");
                    for (int i = 0; i < array_18.length; i++) {
                        System.out.printf("   %1d │",i);
                    }
                    System.out.println("");
                    System.out.println("├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
                    System.out.print("│ Valor  │");
                    int counterFase = 0;
                    while(counterFase < arrayCopy_18.length){
                        validator_18 = false;
                        for (int j = 0; !validator_18 && j < arrayCopy_18.length; j++) {

                            if (array_18[j] < 101 && array_18[j] > -1){
                                arrayCopy_18[counterFase] = array_18[j];
                                array_18[j] = -1;
                                validator_18 = true;
                                counter_18++;
                            }
                        }
                        if(validator_18){
                            counterFase++;
                        }
                        validator_18 = false;
                        for (int j = 0; !validator_18 && j < arrayCopy_18.length; j++) {

                            if (array_18[j] > 100){

                                arrayCopy_18[counterFase] = array_18[j];
                                array_18[j] = -1;
                                validator_18 = true;
                                counter_18++;

                            }
                        }
                        if(validator_18){
                            counterFase++;
                        }
                    }
                    for (int i = 0; i < arrayCopy_18.length; i++) {
                        System.out.printf(" %3d │",arrayCopy_18[i]);
                    }
                    System.out.println("");
                    System.out.println("└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
                    break;
                case 19:
                    System.out.println("Bienvenido al Ejercicio 19");
                    /*
                    Realiza un programa que sea capaz de insertar un número en una posición
                    concreta de un array. En primer lugar, el programa generará un array de 12
                    números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
                    debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
                    el programa preguntará por el número que se quiere insertar y por la posición
                    donde será insertado. Los números del array se desplazan a la derecha para
                    dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
                    siempre se perderá.
                     */
                    System.out.println("Array original:");
                    System.out.println("");
                    int []  array_19 = new int[12];
                    int []  arrayCopy_19 = new int[12];

                    System.out.print("Indice  ");
                    for (int i = 0; i < array_19.length; i++) {
                        System.out.printf("%3d  ",i);
                    }
                    System.out.println();
                    System.out.print("Valor   ");
                    for (int i = 0; i < array_19.length; i++) {
                        array_19[i] = (int) (Math.random()*201);
                        System.out.printf("%3d  ",array_19[i]);
                    }
                    System.out.println("");
                    System.out.print("Introduzca el número que quiere insertar: ");
                        int userNumber_18 = s.nextInt();
                    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
                        int arrayPosition_18 = s.nextInt();

                    for (int i = 0; i < arrayPosition_18 ; i++) {
                        arrayCopy_19[i] = array_19[i];
                    }

                    for (int i = (arrayPosition_18+1); i < array_19.length; i++) {

                        arrayCopy_19[i] = array_19[i-1];
                    }
                    arrayCopy_19[arrayPosition_18] = userNumber_18;
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Array resultado:");
                    System.out.println("");
                    System.out.print("Indice  ");
                    for (int i = 0; i < array_19.length; i++) {
                        System.out.printf("%3d  ",i);
                    }
                    System.out.println();
                    System.out.print("Valor   ");
                    for (int i = 0; i < array_19.length; i++) {
                        System.out.printf("%3d  ",arrayCopy_19[i]);
                    }
                    System.out.println("");
                    break;
                case 20:
                    System.out.println("Bienvenido al Ejercicio 20");
                    /*
                    Implementa un programa que calcule la denominación ordinal de los reyes de
                    una secuencia histórica. El programa solicitará la cantidad de reyes que se
                    van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
                    por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
                    por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
                    aparecer como Felipe 1º y el segundo como Felipe 2º.
                     */
                    System.out.print("Introduzca el número total de nombres de reyes: ");
                    int numberOfKings = s.nextInt();
                    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");

                    String [] array_20 = new String[numberOfKings];
                    String [] arrayCopy_20 = new String[numberOfKings];
                    for (int i = 0; i < array_20.length; i++) {
                                array_20[i] = s.next();
                    }
                    int counter_20 = 0;
                    for (int i = 0; i < array_20.length; i++) {
                        counter_20 = 0;
                        for (int j = 0; j < array_20.length; j++) {
                            if(array_20[i].equals(array_20[j])){
                                counter_20++;
                                arrayCopy_20[j] = array_20[j] +" " +counter_20+"º";
                            }
                        }
                    }
                    System.out.println("");
                    System.out.println("Los reyes introducidos son:");
                    for (int i = 0; i < arrayCopy_20.length; i++) {
                        System.out.println(arrayCopy_20[i]);
                    }
                    break;
                case 21:
                    System.out.println("Bienvenido al Ejercicio 21");
                    /*
                    Escribe un programa que rellene un array de 15 elementos con números enteros
                    comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
                    array “cincuerizado”, según el siguiente criterio: si el número que hay en una
                    posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
                    siguiente múltiplo de 5 que exista a partir de él.
                     */

                    int [] array_21 = new int[15];

                    System.out.println("Array original: ");
                    for (int i = 0; i < array_21.length; i++) {
                        array_21[i] = (int) (Math.random()*501);
                        System.out.print(array_21[i]+" ");
                    }
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Array cincuerizado: ");
                    for (int i = 0; i < array_21.length; i++) {

                        if(array_21[i] % 5 != 0){
                            do{
                                array_21[i]++;
                            }while(array_21[i] % 5 != 0);
                        }
                        System.out.print(array_21[i]+" ");
                    }
                    System.out.println("");
                    System.out.println("");
                    break;
            }
    }
}
