package comtrolador;

import modelo.Premio;
import vista.Menu;
import vista.MenuRonda;
import vista.MenuUser;

import java.util.List;
import java.util.Scanner;

public class RondaService  {


    public static void selectCategariaYPregunta(int rondaN, int premio){

        int valorRandon = (int) Math.floor(Math.random()*5+1);//busamos un numero rando del 1 al 5
        PreguntaDao.listarPregunta(rondaN++,valorRandon);//pasamos el mumero de la ronda y el valor ramdon para elejir la prgunta
    }

    public static void ValidarRespuesta(int respRonda, int repVerdadera, int idRonda){

        List<Premio>premioLista=PremioDao.premio();

        /**con esta validamos  si la respuesta es igual a la traida
         * de la base de datas*/
        if (respRonda==repVerdadera){
            int nexRonda=idRonda;
            int premios = 100000;
            switch (nexRonda){
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
                    MostrarGanador.mostrarGanador(premioLista);
                    MenuUser.capturaDatosUser(premios);
                    break;
            }
            nexRonda++;//sumamos uno mas para que se pase a la otra ronda
            MenuRonda.mensajeSiquiereSalirDElJuego(nexRonda,premios);
        }else {
            System.out.println("PERDISTE GRACIAS POR PARTICIPAR ");
            int premioPerdedor=0;
            MenuUser.capturaDatosUser(premioPerdedor);
        }
    }

    public static void ContinuarJuego(int opcionUser, int nexRonda, int premios){
        //si la respesta es sergir 1
        if (opcionUser==1){
            MenuRonda.menuRonda(nexRonda,premios);
        }
        else {
            MenuUser.capturaDatosUser(premios);
            System.out.println("Juego finalizado");
        }
    }
}
