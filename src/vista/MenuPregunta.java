package vista;

import comtrolador.PreguntaService;

import java.util.Scanner;

public class MenuPregunta {

    public static void capturaPregunta(){
        Scanner sc= new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("**           REGISTRO DE PREGUNTAS         **");
        System.out.println("**           Ingrese su Pregunta            **");
        System.out.println("**                                         **");
        System.out.println("*********************************************");
        String pregunt= sc.nextLine();
        System.out.println("Ingrese su Opciones: 1) opcio1,  2) opcion2,   3) opcion3, 4) opcio4,");
        String opcion=sc.nextLine();
        System.out.println("**  Ingrese el numero de la respuesta 1 ,2,3 o 4  **");
        int respuest=sc.nextInt();
        System.out.println("Igrese en numero aque categoria pertenece \n1. nive1\n2. nive2\n3. nive3\n4. nive4\n5. nivel5");
        int categori= sc.nextInt();
        PreguntaService.crearPregunta(pregunt,opcion,respuest,categori);

    }

    public static void capturaOtraPregunta() {
        Scanner sc=new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("**         1-  Registra Otra Pregunta      **");
        System.out.println("**         2- Salir                        **");
        System.out.println("**                                         **");
        System.out.println("*********************************************");
        int opcion =sc.nextInt();
        PreguntaService.creOtraPregunta(opcion);
    }


    }
