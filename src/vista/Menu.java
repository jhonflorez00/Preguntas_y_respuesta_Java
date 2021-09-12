package vista;

import comtrolador.RondaService;
import comtrolador.UserService;

import java.util.Scanner;

public class Menu {
    public static void mostarMenu() {
        int opcion = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("******************************************************");
            System.out.println("**                CHALLENGE -                       **");
            System.out.println("**      CONCURSO DE PREGUNTAS Y RESPUESTAS          **");
            System.out.println("******************************************************");
            System.out.println("**                                                  **");
            System.out.println("**          1) Iniciar juego                        **");
            System.out.println("**          2) Configurar Pregunta                  **");
            System.out.println("**          3) Ver Historial de juego               **");
            System.out.println("**          4) Salir                                **");
            System.out.println("**                                                  **");
            System.out.println("******************************************************");

            //leemos la opcion del usuario
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int ronda1=1;
                    int premio=0;
                    MenuRonda.menuRonda(ronda1,premio);
                    break;
                case 2:
                    MenuPregunta.capturaPregunta();
                case 3:
                    UserService.verHistoria();
                    break;

                default:
                    System.out.println("**          Escoja un numero correcto             **");
                    break;
            }

        } while (opcion != 4);


    }
}
