package comtrolador;

import modelo.Pregunta;
import modelo.User;
import vista.Menu;

import java.util.Scanner;

public class PreguntaService {
    public static void crearPregunta(){
        /**Recolectamso los datos de la pregunta
         * */
        Scanner sc= new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("**           Registro dE preguntas        **");
        System.out.println("*********************************************");
        System.out.println("**          Ingrese su Pregunta            **");
        System.out.println("*********************************************");
        String pregunt= sc.nextLine();
        System.out.println("Ingrese su Opciones: 1) opcio1 \\r\\n 2) opcion2 \\r\\n 3) opcion3\\r\\n 3) opcio4");
        String opcion=sc.nextLine();
        System.out.println("**  Ingrese el numero de la respuesta 1 ,2,3 o 4  **");
        int respuest=sc.nextInt();
        System.out.println("Igrese en numero aque categoria pertenece \n1. nive1\n2. nive2\n3. nive3\n4. nive4\n5. nivel5");
        int categori= sc.nextInt();

        System.out.println("*********************************************");
        System.out.println("**     1-  Registrar otra pregunta         **");
        System.out.println("**     2- Salir                            **");
        System.out.println("*********************************************");
        int salir= sc.nextInt();
        if (salir==1){
            /**creamos una nueva pregunta y  lo enviamos
             * al modelo PreguntaDAO al metodo crearPreguntaDB*/
            Pregunta pregunta= new Pregunta();
            pregunta.setPregunta(pregunt);
            pregunta.setOpciones(opcion);
            pregunta.setRepuesta(respuest);
            pregunta.setCategoria(categori);
            PreguntaDao.crearPreguntaDB(pregunta);

        }else {
            Menu.mostarMenu();
        }
    }


}
