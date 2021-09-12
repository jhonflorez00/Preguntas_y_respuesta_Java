package comtrolador;

import modelo.Jugador;
import modelo.Premio;

public class UserService {
    public static void crearUser(String nombre, int cc, int resultado){
        /**creamos un ususario y lo enviamos
         * al modelo userDAO al metodo crearUserDB*/

        Jugador jugador=new Jugador(nombre,cc);
        jugador.setNombre(nombre);
        jugador.setCc(cc);
        Premio premio=new Premio(jugador,resultado);
        PremioDao.guarPremio(premio);
    }

    public  static void verHistoria(){
       PremioDao.historial();
    }
}
