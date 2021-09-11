package comtrolador;

import modelo.Conexion;
import modelo.Pregunta;
import modelo.Ronda;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

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
        PreguntaService.crearPregunta();
    }

    public static void  listarPregunta(int numeroRonda, int valorRandon){
        Conexion db_connect =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;

        try(Connection conexion = db_connect.get_connection()){
            String query="SELECT * FROM pregunta WHERE categoria="+numeroRonda+"";
            ps=conexion.prepareStatement(query);
            rs= ps.executeQuery();

            //iesntras rs tenga datos
            int contar=1;

            while (rs.next() ){


                if (contar==valorRandon){

                    System.out.println("Pregunta  : "+rs.getString("pregunta"));
                    System.out.println("Opciones  : "+rs.getString("opciones"));
                    System.out.println("Respuesta : "+rs.getInt("respuesta"));
                    System.out.println("Categoria : "+rs.getInt("categoria"));
                    System.out.println("");

                }
                System.out.println("numero= "+contar+++"== numero rando: "+valorRandon);
                System.out.println("****************************");

            }

        }catch (SQLException e){
            System.out.println("No se pudieron traer la pregunta");
            System.out.println(e);
        }
    }




}
