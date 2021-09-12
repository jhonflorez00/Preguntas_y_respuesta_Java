package vista;

import comtrolador.UserService;

import java.util.Scanner;

public class MenuUser {
    public static void capturaDatosUser(int premios){
        /**Recolectamso los datos del usuario nombre y cc
         * */
        Scanner sc=new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("**         REGISTRO EN HISTORIAL           **");
        System.out.println("**         PREMIO Acomulado :"+premios+" $                         ");
        System.out.println("**                                         **");
        System.out.println("*********************************************");
        System.out.println("Ingrese su nombre");
        String nombre= sc.nextLine();
        System.out.println("Ingrese su numero Cedula");
        int cc=sc.nextInt();
        UserService.crearUser(nombre,cc,premios);





    }
}
