package vista;

import comtrolador.PreguntaService;
import comtrolador.RondaService;
import comtrolador.UserService;

import java.util.Scanner;

public class Menu {
    public static void mostarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("******************************************************");
            System.out.println("**   CHALLENGE - CONCURSO DE PREGUNTAS Y RESPUESTAS **");
            System.out.println("******************************************************");

            System.out.println("1) Iniciar juego ");
            System.out.println("2) Configurar Pregunta");
            System.out.println("3) Ver Historial de juego");
            System.out.println("4) Salir ");
            System.out.println("___________________________");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int ronda1=1;
                    int premio=0;
                    RondaService.rondaInicial(ronda1,premio);
                    break;
                case 2:
                    PreguntaService.crearPregunta();
                case 3:
                    UserService.verHistoria();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Escoja un numero correcto");
                    break;

            }

        } while (opcion != 4);


    }
}
