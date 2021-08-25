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
                System.out.println("Introduzca el ejercicio que quiera comprobar: ");
                int exerciseIfSwitchNumber = Integer.parseInt(s.next());
                ifSwitch.selector(exerciseIfSwitchNumber);
            break;

            case 2:
                Loop loop = new Loop();
                System.out.print("Introduzca el ejercicio que quiera comprobar: ");
                int exerciseLoopNumber = Integer.parseInt(s.next());
                loop.selector(exerciseLoopNumber);

            break;

            case 3:
            break;

            case 4:
                break;

        }
    }




}
