import org.omg.CORBA.TIMEOUT;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class IfSwitch {

    public void selector(int exercise) {
        boolean exit = false;
        Scanner s = new Scanner(System.in);
        switch (exercise){

            case 24:
                /*
                *
                * Escribe un programa que genere la nómina (bien desglosada) de un empleado
                  según las siguientes condiciones:
                  *
                    • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
                    de proyecto), los días que ha estado de viaje visitando clientes durante el
                    mes y su estado civil (1 - Soltero, 2 - Casado).
                    • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
                    si se trata de un prog. junior, un prog. senior o un jefe de proyecto
                    respectivamente.
                    • Por cada día de viaje visitando clientes se pagan 30 euros extra en
                    concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
                    un 25% en caso de estar soltero y un 20% en caso de estar casado.
                 */

                System.out.println("Bienvenido al Ejercicio 24");

                int salary = 0;
                int visits = 0;
                int irpf = 0;
                String positionName = "";
                String civilStatusName = "";
                do

                {
                    System.out.println("1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto");

                    int position = Integer.parseInt(s.next());

                    System.out.println("1 - Soltero, 2 - Casado");
                    int civilStatus = Integer.parseInt(s.next());

                    if (position > 0 && position < 4) {

                        switch (position) {
                            case 1:
                                positionName = "Prog. junior";
                                salary = 950;
                                break;
                            case 2:
                                positionName = "Prog. senior";
                                salary = 1200;
                                break;
                            case 3:
                                positionName = "Jefe de proyecto";
                                salary = 1600;
                                break;
                        }
                        exit = true;
                        if (civilStatus > 0 && civilStatus < 3) {
                            switch (civilStatus) {
                                case 1:
                                    civilStatusName = "Soltero";
                                    irpf = 25;
                                    break;
                                case 2:
                                    civilStatusName = "Casado";
                                    irpf = 20;
                                    break;
                            }
                            exit = true;
                        } else {
                            System.out.println("Error, introduzca los parametros correctamente.");
                            exit = false;
                        }
                    } else {
                        System.out.println("Error, introduzca los parametros correctamente.");
                    }

                } while(!exit);

                System.out.println("Cuantos dias has estado visitando a clientes");
                visits =Integer.parseInt(s.next());

                System.out.println("Factura");
                System.out.println("Sueldo base de "+positionName +": "+salary +"€.");
                System.out.println("Dietas: "+(30*visits)+"€.");
                System.out.println("Estado civil: "+civilStatusName +".");
                int discount = (((salary + (30 * visits)) * 20) / 100);
                System.out.println("IRPF: "+irpf +"% | -"+discount +"€.");
                System.out.println("Total: "+(salary +(30*visits)-discount)+"€.");

                break;

            case 25:
                /*
                *
                * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
                    máxima calidad y nos ha pedido hacer un configurador que calcule el precio
                    según el alto y el ancho. El precio base de una bandera es de un céntimo de
                    euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
                    se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
                    son 3.25 €. El IVA ya está incluido en todas las tarifas.
                 */
                System.out.println("Bienvenido al Ejercicio 25");

                System.out.print("Introduzca la altura de la bandera en cm: ");
                int height = s.nextInt();
                System.out.print("Ahora introduzca la anchura: ");
                int weight = s.nextInt();
                System.out.print("¿Quiere escudo bordado? (s/n): ");
                String border = s.next();

                String shield = "";
                double shieldPrice = 0.00;
                if (border.equals("s") ){
                    shield = "Con escudo";
                    shieldPrice = 2.50;
                }else if(border.equals("n")){
                    shield = "Sin escudo";
                }

                double squareCentimetre = height * weight;
                double squareCentimetrePrice = squareCentimetre / 100;
                System.out.println(squareCentimetrePrice);
                double taxes = 3.25;
                double total = squareCentimetrePrice + shieldPrice + taxes;

                System.out.println("Gracias. Aquí tiene el desglose de su compra.");
                System.out.println("---------------------------------------------");
                System.out.printf("Bandera de %5.0f cm2: %5.2f €\n",squareCentimetre, squareCentimetrePrice);
                System.out.printf("%10s: %15.2f €\n",shield,shieldPrice);
                System.out.printf("Gastos de envío: %10.2f €\n",taxes);
                System.out.printf("Total: %20.2f €\n",total);

                break;

            case 26:
                /*
                *
                * Realiza un programa que calcule el precio de unas entradas de cine en función
                    del número de personas y del día de la semana. El precio base de una entrada
                    son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
                    jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
                    Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
                    grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
                    que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
                    1 individual que son 41 euros (33 + 8).
                 */
                System.out.println("Bienvenido al Ejercicio 26");

                System.out.println("Venta de entradas CineCampa");
                System.out.print("Número de entradas: ");
                int tickets = s.nextInt();
                System.out.print("Día de la semana: ");
                String weekDay = s.next();
                System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
                String cinemaCard = s.next();

                double ticketPrice = 8;
                 double discount26 = 0;
                 double total26 = 0;


                switch(weekDay){

                    case "miercoles":
                        ticketPrice = 5;
                        total26 =tickets * ticketPrice ;

                        if (cinemaCard.equals("s")){
                            discount26 = 0-(total26*10)/100;
                        }else{
                            discount26 = 0.00;
                        }

                        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                        System.out.printf("Entradas individuales %3d\n",tickets);
                        System.out.printf("Precio por entrada individual %1.2f €\n",ticketPrice);
                        System.out.printf("Total %3.2f €\n",total26);
                        System.out.printf("Descuento %3.2f €\n",discount26);
                        System.out.printf("A pagar %3.2f €\n",total26+discount26);
                        break;
                    case "jueves":
                        int coupleTickets = 0;
                        double coupleTicketPrice = 0;

                        if(tickets % 2 ==0){
                            coupleTickets = tickets /2;
                            coupleTicketPrice = 11;
                            total26 =coupleTickets * coupleTicketPrice ;
                            if (cinemaCard.equals("s")){
                                discount26 = 0-(total26*10)/100;
                            }else{
                                discount26 = 0.00;
                            }

                            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                            System.out.printf("Entradas de parejas %3d\n",coupleTickets);
                            System.out.printf("Precio por entrada de pareja %1.2f €\n",coupleTicketPrice);
                            System.out.printf("Total %3.2f €\n",total26);
                            System.out.printf("Descuento %3.2f €\n",discount26);
                            System.out.printf("A pagar %3.2f €\n",total26+discount26);


                        }else if(tickets % 2 !=0){
                            coupleTickets = (tickets-1)/2;
                            ticketPrice = 8;
                            coupleTicketPrice = 11;
                            total26 =(coupleTickets * coupleTicketPrice) + ticketPrice ;

                            if (cinemaCard.equals("s")){
                                discount26 = 0-(total26*10)/100;
                            }else{
                                discount26 = 0.00;
                            }

                            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                            System.out.printf("Entradas de parejas %3d\n",coupleTickets);
                            System.out.printf("Precio por entrada de pareja %1.2f €\n",coupleTicketPrice);
                            System.out.printf("Entradas individuales %3d\n",1);
                            System.out.printf("Precio por entrada individual %1.2f €\n",ticketPrice);
                            System.out.printf("Total %3.2f €\n",total26);
                            System.out.printf("Descuento %3.2f €\n",discount26);
                            System.out.printf("A pagar %3.2f €\n",total26+discount26);

                        }
                        break;

                    case "lunes":
                    case "martes":
                    case "viernes":
                    case "sabado":
                    case "domingo":
                        ticketPrice = 8;
                        total26 =tickets * ticketPrice ;
                        if (cinemaCard.equals("s")){
                            discount26 = 0-(total26*10)/100;
                        }else{
                            discount26 = 0.00;
                        }

                        System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
                        System.out.printf("Entradas individuales %3d\n",tickets);
                        System.out.printf("Precio por entrada individual %1.2f €\n",ticketPrice);
                        System.out.printf("Total %3.2f €\n",total26);
                        System.out.printf("Descuento %3.2f €\n",discount26);
                        System.out.printf("A pagar %3.2f €\n",total26+discount26);
                        break;

                    default:
                        System.out.println("El dia introducido no es valido.");
                        break;

                }
                break;

            case 27:
                /*
                *
                Una pastelería nos ha pedido realizar un programa que haga presupuestos de
                tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
                manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
                16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
                además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
                segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
                nombre; la nata suma 2.50 y la escritura del nombre 2.75.
                 */
                System.out.println("Bienvenido al Ejercicio 27");

                System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
                String taste = s.next();
                double priceCake = 0;
                String chocolateType = "";
                boolean creamCheck = false;
                boolean nameCheck = false;
                switch(taste){
                    case "manzana":
                        priceCake = 18.00;
                    case "fresa":
                        priceCake = 16.00;
                        break;
                    case "chocolate":
                        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                        chocolateType = s.next();

                        if(chocolateType.equals("negro")){
                            priceCake = 14.00;
                        }else if(chocolateType.equals("blanco"))
                            priceCake = 15.00;
                        break;
                }
                System.out.print("¿Quiere nata? (si o no): ");
                String cream = s.next();
                if (cream.equals("si")){
                    creamCheck = true;
                }
                System.out.print("¿Quiere ponerle un nombre? (si o no): ");
                String name = s.next();
                if (name.equals("si")){
                    nameCheck = true;
                }
                double total27 = priceCake;
                System.out.println("------------------------------------");
                if (taste.equals("chocolate")){
                    System.out.printf("Tarta de %9s %5s: %2.2f €\n",taste, chocolateType, total27 );
                }else{
                    System.out.printf("Tarta de %7s: %2.2f €\n",taste, total27 );
                }

                if (creamCheck == true){
                    System.out.printf("Con nata: 2,50 €\n");
                     total27 = total27 + 2.50;
                }
                if (nameCheck == true) {
                    System.out.printf("Con nombre: 2,75 €\n");
                    total27 = total27 + 2.75;
                }
                System.out.printf("Total: %2.2f €\n",total27);

                break;

            case 28:
                /*
                *
                Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
                su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
                incorrecta, el programa deberá mostrar un mensaje de error.
                 */
                System.out.println("Bienvenido al Ejercicio 28");

                String player1 = "";
                String player2 = "";
                /* piedra > tijeras | tijeras > papel | papel > piedra */
                System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
                player1 = s.next();
                System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
                player2 = s.next();

                switch (player1){
                    case "piedra":
                        if (player2.equals("tijera")){
                            System.out.println("Gana el jugador 1");
                        }else if(player2.equals("papel")){
                            System.out.println("Gana el jugador 2");
                        }else{
                            System.out.println("Empate");
                        }
                        break;
                    case "papel":
                        if (player2.equals("piedra")){
                            System.out.println("Gana el jugador 1");
                        }else if(player2.equals("tijera")){
                            System.out.println("Gana el jugador 2");
                        }else{
                            System.out.println("Empate");
                        }
                        break;
                    case "tijera":
                        if (player2.equals("papel")){
                            System.out.println("Gana el jugador 1");
                        }else if(player2.equals("piedra")){
                            System.out.println("Gana el jugador 2");
                        }else{
                            System.out.println("Empate");
                        }
                        break;
                    default:
                        System.out.println("Error, el dato introducido no es correcto.");
                        break;
                }
                break;

            case 29:
                /*
                *
                Realiza un programa que calcule el precio de un desayuno. El programa
                preguntará primero qué ha tomado el usuario de comer: palmera, donut o
                pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
                programa debe preguntar además si era con aceite o con tortilla; el primero
                vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
                café a 1’50 y 1’20 respectivamente.
                 */
                System.out.println("Bienvenido al Ejercicio 29");

                System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
                String orderFood = s.next();
                double orderFoodPrice = 0;
                double orderDrinkPrice = 0;
                double total29 = 0;
                switch (orderFood){
                    case "pitufo":
                        System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
                        String pitufoType = s.next();
                            if(pitufoType.equals("aceite")){
                                orderFood = "Pitufo con aceite";
                                orderFoodPrice = 1.20;
                            }else{
                                orderFood = "Pitufo con tortilla";
                                orderFoodPrice = 1.60;
                            }
                        break;

                    default:
                        if(orderFood.equals("palmera")){
                            orderFood = "Palmera";
                            orderFoodPrice = 1.40;
                        }else if(orderFood.equals("donut")){
                            orderFood = "Donut";
                            orderFoodPrice = 1;
                        }else{
                            System.out.println("Error, la comida introducida no es correcta.");
                        }
                        break;
                }

                System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
                String orderDrink = s.next();

                if (orderDrink.equals("zumo")){
                    orderDrink = "Zumo";
                    orderDrinkPrice = 1.50;
                }else if(orderDrink.equals("cafe")){
                    orderDrink = "Cafe";
                    orderDrinkPrice = 1.20;
                }else{
                    System.out.println("Error, la bebida introducida no es correcta.");
                }
                total29 = orderFoodPrice + orderDrinkPrice;

                System.out.println("----------------------------------------------------------------------");
                if(orderFoodPrice == 1 || orderFoodPrice == 1.40){
                    System.out.printf("%-7s: %2.2f €\n",orderFood, orderFoodPrice);
                }else{
                    System.out.printf("%-19s: %2.2f €\n",orderFood, orderFoodPrice);
                }
                System.out.printf("%4s: %2.2f €\n",orderDrink, orderDrinkPrice);
                System.out.printf("Total desayuno: %2.2f €\n",total29);
                break;

        }













    }

}
