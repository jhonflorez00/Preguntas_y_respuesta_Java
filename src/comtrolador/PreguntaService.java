package comtrolador;

import modelo.Pregunta;
import vista.Menu;
import vista.MenuPregunta;

public class PreguntaService {
    public static void crearPregunta(String pregunt, String opcion, int respuest, int categori){

        /**creamos una nueva pregunta y  lo enviamos
         * al modelo PreguntaDAO al metodo crearPreguntaDB*/
        Pregunta pregunta= new Pregunta();
        pregunta.setPregunta(pregunt);
        pregunta.setOpciones(opcion);
        pregunta.setRepuesta(respuest);
        pregunta.setCategoria(categori);
        PreguntaDao.crearPreguntaDB(pregunta);
        }

        public static void creOtraPregunta(int opcion){
            if (opcion==1){
                MenuPregunta.capturaPregunta();//crear otra pregunta
            }else if (opcion ==2){
                Menu.mostarMenu();//salir al menu inicial
            }
        }
    }



