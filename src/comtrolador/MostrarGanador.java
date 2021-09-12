package comtrolador;

import modelo.Premio;

import java.util.List;

public class MostrarGanador {

    public  static void mostrarGanador(List<Premio> premios){

        Premio premio=premios.stream().max((a,b)->a.getResultadoPremio().compareTo(b.getResultadoPremio())).get();//comparar la consult
        System.out.println("el ganador es :"+ premio.getJugador().getNombre()+"\n" +
                "con un Premio: "+premio.getResultadoPremio());
    }
}
