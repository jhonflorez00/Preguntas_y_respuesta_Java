package comtrolador;

import modelo.User;

import java.util.Scanner;

public class UserService {
    public static void crearUser(){
        /**Recolectamso los datos del usuario nombre y cc
         * */
        Scanner sc= new Scanner(System.in);
        System.out.println("*************  Registro **********************");
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
        UserDao.crearUserDB(registro);


    }

}
