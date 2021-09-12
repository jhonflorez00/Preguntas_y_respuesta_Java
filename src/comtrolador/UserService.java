package comtrolador;

import modelo.User;

public class UserService {
    public static void crearUser(String nombre, int cc, int premios){
        /**creamos un ususario y lo enviamos
         * al modelo userDAO al metodo crearUserDB*/

        User registro=new User();
        registro.setNombre(nombre);
        registro.setCc(cc);
        registro.setAcomulado(premios); //traemos el acomulado
        UserDao.crearUserDB(registro);
    }

    public  static void verHistoria(){
       UserDao.historial();
    }
}
