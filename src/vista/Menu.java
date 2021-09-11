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

            System.out.println("1. Crear Usuario");
            System.out.println("2. Iniciar juego ");
            System.out.println("3. Configurar Pregunta");
            System.out.println("3. Salir ");
            System.out.println("___________________________");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    UserService.crearUser();
                    break;
                case 2:
                    RondaService.rondaN();

                    break;
                case 3:
                    PreguntaService.crearPregunta();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Gracias");
                    break;

            }

        } while (opcion != 5);


    }
}
