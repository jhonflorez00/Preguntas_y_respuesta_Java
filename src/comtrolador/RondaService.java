package comtrolador;


import modelo.Ronda;

import java.util.Scanner;

public class RondaService  {

    public static void rondaN(){
        int numeroRonda=1;

        do {
            Scanner sc=new Scanner(System.in);
            System.out.println("***********************************************************");
            System.out.println("**             Ronda no:"+numeroRonda+"                                **");
            System.out.println("************************************************************");
           //   numeroRonda=numeroRonda;
            int valorRandon = (int) Math.floor(Math.random()*5+1);//busamos un numero rando del 1 al 5

            PreguntaDao.listarPregunta(numeroRonda,valorRandon);
            System.out.println("");

            System.out.println("ramdon: "+valorRandon);
            System.out.println("Respuesta ala pregunta");
            int repusta= sc.nextInt();
            System.out.println("6.  salir");
           int salir= sc.nextInt();
        }while (numeroRonda ==6);
    }

    public static void escojerPregunta(){




    }


}
