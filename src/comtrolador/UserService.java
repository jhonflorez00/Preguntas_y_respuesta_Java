package comtrolador;

import modelo.User;

import java.util.Scanner;

public class UserService {
    public static void crearUser(int premios){
        /**Recolectamso los datos del usuario nombre y cc
         * */
        Scanner sc= new Scanner(System.in);
        System.out.println("**************************************\n** REGISTRO EN HISTORIAL \n*************************************         ");
        System.out.println("Ingrese su nombre");
        String nombre= sc.nextLine();
        System.out.println("Ingrese su numero Cedula");
        int cc=sc.nextInt();
        /**creamos un ususario y lo enviamos
         * al modelo userDAO al metodo crearUserDB*/
        // MenuUsuario.menuUsuario();
        User registro=new User();
        registro.setNombre(nombre);
        //traeracomulado
        registro.setCc(cc);
        registro.setAcomulado(premios);
        UserDao.crearUserDB(registro);


    }

    public  static void verHistoria(){
       UserDao.historial();
    }

}
