package comtrolador;

import modelo.Conexion;
import modelo.Pregunta;
import modelo.Ronda;
import vista.MenuPregunta;
import vista.MenuRonda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreguntaDao {
    public  static  void  crearPreguntaDB(Pregunta pregunta){

        Conexion db_connect =new Conexion();
        try (Connection conexion = db_connect.get_connection()){
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO pregunta (pregunta, opciones,respuesta, categoria) VALUES (?,?,?,?)";
                ps =conexion.prepareStatement(query);
                ps.setString(1 ,pregunta.getPregunta());
                ps.setString(2,pregunta.getOpciones());
                ps.setInt(3,pregunta.getRepuesta());
                ps.setInt(4,pregunta.getCategoria());
                ps.executeUpdate(); //actualizar los cambios
                System.out.println("Pregunta  Creada");

            }catch (Exception ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        MenuPregunta.capturaOtraPregunta();
    }

    public static void  listarPregunta(int numeroRonda, int valorRandon){

        Conexion db_connect =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try(Connection conexion = db_connect.get_connection()){ //traemos las preguntas de la categoria que pertenece ala ronda
            String query="SELECT * FROM pregunta WHERE categoria="+numeroRonda+"";
            ps=conexion.prepareStatement(query);
            rs= ps.executeQuery();
            int contar=1;//utilizamos como indice de para encontrar la pregunta
            /**Realiza el recorrido del la consulta SQL y toma la posición
             * del número aleatorio  y carga los datos a la clase Ronda*/
            // verificamos que rs tenga datos
            while (rs.next() ){
                //si el rando es igual  al indice de la pregunta ejecuta
                if (contar==valorRandon){
                    System.out.println("**           Numero randon:"+valorRandon+"                         **");
                    Ronda ronda=new Ronda();
                    ronda.setIdRonda(numeroRonda);
                    ronda.setPregunta(rs.getString("pregunta"));
                    ronda.setOpciones(rs.getString("opciones"));
                    ronda.setRepuesta(rs.getInt("respuesta"));
                    ronda.setCategoria(rs.getInt("categoria"));
                    MenuRonda.mostarPregunRamdon(ronda);
                }
                contar++;
            }
        }catch (SQLException e){
            System.out.println("No se pudieron traer la pregunta");
            System.out.println(e);
        }
    }
}
