package comtrolador;


import modelo.Ronda;
import vista.Menu;

import java.util.Scanner;

public class RondaService  {


    public static void rondaInicial(int rondaN, int premio){

            Scanner sc=new Scanner(System.in);
            System.out.println("***********************************************************");
            System.out.println("**             Ronda no:"+rondaN+"                                **");
            System.out.println("**             PREMIO :"+premio+" $");
            System.out.println("************************************************************");
            int valorRandon = (int) Math.floor(Math.random()*5+1);//busamos un numero rando del 1 al 5
            PreguntaDao.listarPregunta(rondaN++,valorRandon);
    }

    public static void escojerPregunta(Ronda ronda){
            System.out.println("**              PREGUNTA :"+ronda.getIdRonda()+"                                 **");
        System.out.println("\n************************************************************");
        System.out.println("\n"+ronda.getPregunta()+"\n");//muestar las preguntas y sus opciones
        System.out.println(" "+ronda.getOpciones()+"");

        Scanner sc=new Scanner(System.in);
        int respRonda= sc.nextInt();//lee nos la respuesta en respRonda
        /**con esta validamos  si la respuesta es igual a la traida
         * de la base de datas*/

        if (respRonda==ronda.getRepuesta()){
            int nexRonda=ronda.getIdRonda();
            int premios = 100000;
            nexRonda++;
            switch (nexRonda-1){
                case 1:
                    premios=premios;
                    break;
                case 2:
                    premios=premios*2;
                    break;
                case 3:
                    premios=premios*4;
                    break;
                case 4:
                    premios=premios*8;
                    break;
                case 5:
                    premios=premios*16;
                    System.out.println(" ***********************************************************\n      FELICITACIONES Ganastes el juego \n***********************************************************");
                    UserService.crearUser(premios);
                    Menu.mostarMenu();
                    break;
            }
            System.out.println(" ***********************************************************\n      FELICITACIONES RESPUESTA CORRECTA  \n***********************************************************");
            System.out.println("1) SALIR DEL JUEGO\n 2) SEGIR JUEGO");
            int salirJue=sc.nextInt();
            if (salirJue==1){
                UserService.crearUser(premios);
                Menu.mostarMenu();
            }
            RondaService.rondaInicial(nexRonda, premios);
                }else {
            System.out.println("PERDISTE GRACIAS POR PARTICIPAR ");
            int premios=0;
            UserService.crearUser(premios);
            Menu.mostarMenu();
        }
    }



}
