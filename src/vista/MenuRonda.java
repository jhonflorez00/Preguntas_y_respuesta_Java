package vista;

import comtrolador.RondaService;
import modelo.Ronda;

import java.util.Scanner;

public class MenuRonda {

    public static void menuRonda(int rondaN, int premio){
        System.out.println("******************************************************");
        System.out.println("**             Ronda no:"+rondaN+"                           **");
        System.out.println("**         PREMIO Acomulado :"+premio+" $                         ");
        System.out.println("**                                                   **");
        System.out.println("*******************************************************");
        RondaService.selectCategariaYPregunta(rondaN,premio);
    }
    public static void mostarPregunRamdon(Ronda ronda){
        Scanner sc=new Scanner(System.in);
        System.out.println("**              PREGUNTA :"+ronda.getIdRonda()+"                          **");
        System.out.println("**                                                  **");
        System.out.println("******************************************************");

        System.out.println("\n"+ronda.getPregunta()+"");//muestar las preguntas y sus opciones
        System.out.println(" "+ronda.getOpciones()+"");
        int respRonda= sc.nextInt();//lee nos la respuesta en respRonda
        int repVerdadera=ronda.getRepuesta();
        int idRonda=ronda.getIdRonda();
        RondaService.ValidarRespuesta(respRonda,repVerdadera,idRonda);
    }
    public static void mensajeSiquiereSalirDElJuego(int nexRonda, int premios){
        Scanner sc=new Scanner(System.in);
        System.out.println("***********************************************************");
        System.out.println("**            FELICITACIONES RESPUESTA CORRECTA          **");
        System.out.println("**                                                       **");
        System.out.println("**             1) SEGIR JUEGO                            **");
        System.out.println("**             2) SALIR DEL JUEGO                        **");
        System.out.println("**                                                       **");
        System.out.println("***********************************************************");
        int opcionUser=sc.nextInt();
        RondaService.ContinuarJuego(opcionUser,nexRonda,premios);
    }

}
