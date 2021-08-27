import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Bienvenido al selector de ejercicios de repaso de Feseva");
        System.out.println("Introduzca el tipo de ejercicio que quiera comprobar:");
        System.out.println("1. If & Switch | 2. Loops | 3. RandomNumbers | 4. Arrays");
        Scanner s = new Scanner(System.in);
        int exerciseType = Integer.parseInt(s.next());
        switch (exerciseType){

            case 1:
            IfSwitch ifSwitch = new IfSwitch();
                System.out.println("┌─────────────────────────────────────────────────────────────┐");
                System.out.println("│   ● Ejercicio 24 (Nómina programador)                       │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 25 (Bandera de España)                        │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 26 (Entradas de Cine                          │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 27 (Pastelería)                               │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 28 (Piedra, papel o tijera)                   │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 29 (Cafetería)                                │");
                System.out.println("└─────────────────────────────────────────────────────────────┘");
                System.out.println("");
                System.out.print("■ Introduzca el número del ejercicio que quiera comprobar: ");
                int exerciseIfSwitchNumber = Integer.parseInt(s.next());
                System.out.println("");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("");
                ifSwitch.selector(exerciseIfSwitchNumber);
            break;

            case 2:
                Loop loop = new Loop();
                System.out.println("┌─────────────────────────────────────────────────────────────┐");
                System.out.println("│   ● Ejercicio 63 (2 Pirámides)                              │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 64 (Rectángulo transformable)                 │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 65 (Letra A)                                  │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 66 (Flecha >>)                                │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 67 (Escalera)                                 │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 68 (Dislocar par+1 e impar-1)                 │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 69 (Pirámide maya)                            │");
                System.out.println("└─────────────────────────────────────────────────────────────┘");
                System.out.println("");
                System.out.print("■ Introduzca el número del ejercicio que quiera comprobar: ");
                int exerciseLoopNumber = Integer.parseInt(s.next());
                System.out.println("");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("");
                loop.selector(exerciseLoopNumber);
            break;

            case 3:
                RandomNumber randomNumber = new RandomNumber();
                System.out.println("Ejercicio 22 (Serpiente)");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("┌─────────────────────────────────────────────────────────────┐");
                System.out.println("│   ● Ejercicio 22 (Serpiente)                                │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 23 (Póker)                                    │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 24 (Selección de dígito al azar)              │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 25 (Primos y Múltiplos de 5 al azar)          │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 26 (Tableta de chocolate con bocado al azar)  │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 27 (Piedra, papel o tijera vs CPU)            │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 28 (Recolocar array de fuera hacia dentro)    │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 29 (Previsión del tiempo)                     │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 30 (Pez, caracola y caballito de mar)         │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 31 (Juego del CRAPS)                          │");
                System.out.println("├─────────────────────────────────────────────────────────────┤");
                System.out.println("│   ● Ejercicio 32 (Sendero con obstáculos aleatorios)        │");
                System.out.println("└─────────────────────────────────────────────────────────────┘");
                System.out.println("");
                System.out.print("■ Introduzca el número del ejercicio que quiera comprobar: ");

                System.out.print("Introduzca el número del ejercicio que quiera comprobar: ");
                int exerciseRandomNumber = Integer.parseInt(s.next());
                System.out.println("");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("");
                randomNumber.selector(exerciseRandomNumber);
            break;

            case 4:
                break;

        }
    }




}
