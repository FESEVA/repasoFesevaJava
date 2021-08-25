import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Loop {

    public void selector(int exercise){

        Scanner s = new Scanner(System.in);
    switch (exercise){

        case 63:
            /*
                Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
                una al lado de la otra y separadas por un espacio en su base.
             */
            System.out.println("Bienvenido al Ejercicio 63");
            System.out.print("Introduzca la altura de la primera pirámide: ");
            int heightPiramid1_63 = s.nextInt();
            System.out.print("Introduzca la altura de la segunda pirámide: ");
            int heightPiramid2_63 = s.nextInt();

            int piramidDifference_63 = 0;
            int weightPiramid1_63 = (heightPiramid1_63*2) -1;
            int halfWeightPiramid1_63 = (weightPiramid1_63-1)/2;
            int weightPiramid2_63 = (heightPiramid2_63*2) -1;
            int halfWeightPiramid2_63 = (weightPiramid2_63-1)/2;

            //Copias
            int heightPiramid1_63_copy = heightPiramid1_63;
            int heightPiramid2_63_copy = heightPiramid2_63;
            int piramidDifference_63_copy = 0;
            int weightPiramid1_63_copy = (heightPiramid1_63*2) -1;
            int halfWeightPiramid1_63_copy = (weightPiramid1_63-1)/2;
            int weightPiramid2_63_copy = (heightPiramid2_63*2) -1;
            int halfWeightPiramid2_63_copy = (weightPiramid2_63-1)/2;

            int piramid1Fill = 1;
            int piramid2Fill = 1;
            int piramidCount = 0;

            if (heightPiramid1_63 > heightPiramid2_63 ){

            piramidDifference_63 = heightPiramid1_63 - heightPiramid2_63;
            piramidDifference_63_copy = piramidDifference_63;

                do {
                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < piramid1Fill; i++) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                    halfWeightPiramid1_63_copy = halfWeightPiramid1_63_copy - 1;
                    piramid1Fill += 2;
                    piramidCount += 1;
                }while(piramidCount != piramidDifference_63_copy);

                do {
                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < piramid1Fill; i++) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.print(" ");

                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < piramid2Fill; i++) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                    halfWeightPiramid1_63_copy = halfWeightPiramid1_63_copy - 1;
                    halfWeightPiramid2_63_copy = halfWeightPiramid2_63_copy - 1;
                    piramid1Fill += 2;
                    piramid2Fill += 2;
                    piramidCount += 1;
                    heightPiramid2_63_copy -= 1;
                }while(piramidCount != heightPiramid1_63_copy);

            }else if(heightPiramid1_63 < heightPiramid2_63){

                piramidDifference_63 = heightPiramid2_63 - heightPiramid1_63;
                piramidDifference_63_copy = piramidDifference_63;

                do {
                    for (int i = 0; i < weightPiramid1_63_copy+1; i++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < piramid2Fill; i++) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("");
                    piramid2Fill += 2;
                    halfWeightPiramid2_63_copy -= 1;
                    piramidCount += 1;
                }while (piramidCount != piramidDifference_63_copy);

                do {
                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }

                    for (int i = 0; i < piramid1Fill; i++) {
                        System.out.print("*");
                    }

                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.print(" ");


                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }

                    for (int i = 0; i < piramid2Fill; i++) {
                        System.out.print("*");
                    }

                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("");

                    piramid2Fill += 2;
                    piramid1Fill += 2;
                    halfWeightPiramid1_63_copy -= 1;
                    halfWeightPiramid2_63_copy -= 1;
                    piramidCount += 1;
                }while(piramidCount != heightPiramid2_63_copy);

            }else{

                do {

                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }

                    for (int i = 0; i < piramid1Fill; i++) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < halfWeightPiramid1_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }

                    for (int i = 0; i < piramid2Fill; i++) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < halfWeightPiramid2_63_copy; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("");

                    piramid1Fill += 2;
                    piramid2Fill += 2;
                    halfWeightPiramid1_63_copy -= 1;
                    halfWeightPiramid2_63_copy -= 1;
                    piramidCount += 1;

                }while (piramidCount != heightPiramid1_63_copy);
            }

            System.out.println("Altura 1: "+heightPiramid1_63);
            System.out.println("Altura 2: "+heightPiramid2_63);
            System.out.println("Diferencia Altura : "+piramidDifference_63);
            System.out.println("Ancho 1: "+weightPiramid1_63);
            System.out.println("Ancho 2: "+weightPiramid2_63);
            System.out.println("Mitad 1: "+halfWeightPiramid1_63);
            System.out.println("Mitad 2: "+halfWeightPiramid2_63);
            break;

        case 64:
            /*
               Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres de ancho
               por 3 de alto y, a continuación, un menú que permita agrandarlo,
               achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
               se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
               se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
               orientación, los valores de anchura y altura se intercambian. El valor mínimo
               de la altura o la anchura es 2.
             */
            System.out.println("Bienvenido al Ejercicio 64");


            int weightRectangle_64 = 6;
            int heightRectangle_64 = 3;

            boolean exit_64 = false;

            do {
                int heightRectangle_64_copy = heightRectangle_64;
                int weightRectangle_64_copy = weightRectangle_64;
                for (int i = 0; i < weightRectangle_64_copy; i++) {
                    System.out.print("*");
                }
                System.out.println("");

                while (heightRectangle_64_copy-2 != 0){
                    System.out.print("*");
                    for (int i = 0; i < weightRectangle_64_copy-2 ; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    heightRectangle_64_copy -= 1;
                }

                for (int i = 0; i < weightRectangle_64_copy ; i++) {
                    System.out.print("*");
                }
                System.out.println("");
                System.out.println(heightRectangle_64);
                System.out.println(weightRectangle_64);

                System.out.println("1. Agrandarlo");
                System.out.println("2. Achicarlo");
                System.out.println("3. Cambiar la orientación");
                System.out.println("4. Salir");
                System.out.print("Indique qué quiere hacer con el rectángulo: ");
                int action_64 = s.nextInt();


                switch (action_64){

                    case 1:
                        weightRectangle_64 ++;
                        heightRectangle_64 ++;
                        break;

                    case 2:

                        if(weightRectangle_64 == 2 || heightRectangle_64 == 2){
                            weightRectangle_64 = weightRectangle_64;
                            heightRectangle_64 = heightRectangle_64;
                        }else{
                            weightRectangle_64 -- ;
                            heightRectangle_64 --;
                        }
                        break;

                    case 3:
                        weightRectangle_64 = heightRectangle_64;
                        heightRectangle_64 = weightRectangle_64_copy;
                        break;

                    case 4:
                        exit_64 = true;
                        break;
                }
            }while (exit_64 != true);
            break;

        case 65:
            /*
            Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
            la altura total y la fila en la que debe aparecer el palito horizontal (contando
            desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
            horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
            introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
             */
            System.out.println("Bienvenido al Ejercicio 65");
            System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
            int height_65 = s.nextInt();

            if (height_65 < 3) {
                System.out.println("La altura introducida no es correcta.");
                break;
            }
            System.out.print("Introduzca la fila del palito horizontal (entre 2 y "+(height_65-1)+")");
            int horizontalAStick_65 = s.nextInt();

            if (horizontalAStick_65 < 2 || horizontalAStick_65 > (height_65-1)){
                System.out.println("La fila introducida no es correcta.");
                break;
            }

            int weight_65 = (height_65*2)-1;
            int halfWeight_65 = height_65-1;
            int middleSpace = 1;
            int aCount_65 = 1;
            for (int i = 0; i < halfWeight_65; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
            halfWeight_65--;

            while(height_65 != 1){
                for (int i = 0; i < halfWeight_65; i++) {
                    System.out.print(" ");
                }
                halfWeight_65--;
                System.out.print("*");
                aCount_65++;
                if (aCount_65 == horizontalAStick_65){
                    for (int i = 0; i < middleSpace; i++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }else{
                    for (int i = 0; i < middleSpace; i++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
                middleSpace +=2;
                height_65 --;
            }
            break;

        case 66:
            /*
            La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
            para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
            vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
            debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
            de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
            no es un número impar mayor o igual que 3, el programa debe mostrar un
            mensaje de error.
             */
            System.out.println("Bienvenido al Ejercicio 66");
            System.out.print("Por favor, introduzca la altura de la figura: ");
            int height_66 = s.nextInt();

            if (height_66 % 2 == 0 || height_66 < 3){
                System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
                break;
            }

            int halfHeight_66 = (height_66-1)/2;
            int spaceBefore_66 = 0;
            int spaceAfter_66 = 0;
            int count_66 = 0;

            do {
                for (int i = 0; i < spaceBefore_66; i++) {
                    System.out.print(" ");
                }
                spaceBefore_66++;
                System.out.print("*");
                for (int i = 0; i < 4; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                count_66++;
            }while(count_66 != halfHeight_66+1);
            spaceAfter_66 = count_66-2;
            count_66 = 0;
            do {
                for (int i = 0; i < spaceAfter_66; i++) {
                    System.out.print(" ");
                }
                spaceAfter_66--;
                System.out.print("*");
                for (int i = 0; i < 4; i++) {
                    System.out.print(" ");
                }
                System.out.println("*");
                count_66++;
            }while(count_66 != halfHeight_66);
            break;

        case 67:

            break;
        case 68:
            break;
        case 69:
            break;


    }

    }
}
