package comtrolador;

import modelo.Pregunta;
import modelo.User;

import java.util.Scanner;

public class PreguntaService {
    public static void crearPregunta(){
        /**Recolectamso los datos de la pregunta
         * */
        Scanner sc= new Scanner(System.in);
        System.out.println("*************  Registro DE preguntas**********************");
        System.out.println("**             Ingrese su Pregunta           ***********  ");
        String pregunt= sc.nextLine();
        System.out.println("Ingrese su Opciones 1 .opcio1  2.opcion2 3.opcion3 3.opcio4");
        String opcion=sc.nextLine();
        System.out.println("Ingrese el numero de la respuesta 1 o 2 etc");
        int respuest=sc.nextInt();
        System.out.println("Igrese en numero aque categoria pertenece \n1. nive1\n2. nive2\n3. nive3\n4. nive4\n5. nivel5");
        int categori= sc.nextInt();
        /**creamos una nueva pregunta y  lo enviamos
         * al modelo PreguntaDAO al metodo crearPreguntaDB*/
        // MenuUsuario.menuUsuario();
        Pregunta pregunta= new Pregunta();
        pregunta.setPregunta(pregunt);
        pregunta.setOpciones(opcion);
        pregunta.setRepuesta(respuest);
        pregunta.setCategoria(categori);

        PreguntaDao.crearPreguntaDB(pregunta);
    }
}
