package comtrolador;

import modelo.Conexion;
import modelo.Pregunta;


import java.sql.Connection;
import java.sql.PreparedStatement;
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
    }
}
