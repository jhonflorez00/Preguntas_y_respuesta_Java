package comtrolador;

import modelo.Conexion;
import modelo.Jugador;
import modelo.Premio;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PremioDao {
    public static void guarPremio(Premio premio){
        Conexion db_connect =new Conexion();
        try (Connection conexion = db_connect.get_connection()){
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO premio (nombre,cc,premio) VALUES (?, ?,?);";
                ps =conexion.prepareStatement(query);
                ps.setString(1 ,premio.getJugador().getNombre());
                ps.setInt(2,premio.getJugador().getCc());
                ps.setInt(3,premio.getResultadoPremio());
                ps.executeUpdate(); //actualizar los cambios
                System.out.println("Usuario guardado");

            }catch (Exception ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }


    public static List<Premio> premio(){
        Conexion db_connect =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;

        List<Premio> premios = new ArrayList<>();
        try(Connection conexion = db_connect.get_connection()){
            String query="SELECT * FROM premio";
            ps=conexion.prepareStatement(query);
            rs= ps.executeQuery();

            //muestra que  tenga datos

            while (rs.next()){
                Premio premio=new Premio();
                Jugador jugador=new Jugador(rs.getString("nombre"),rs.getInt("cc"));
                premio.setJugador(jugador);
                premio.setResultadoPremio(rs.getInt("premio"));
                premios.add(premio);

            }
        }catch (SQLException e){
            System.out.println("No se pudieron traer los mensajes");
            System.out.println(e);
        }
        return premios;
    }

    public static void  historial(){
        Conexion db_connect =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;

        try(Connection conexion = db_connect.get_connection()){
            String query="SELECT * FROM premio";
            ps=conexion.prepareStatement(query);
            rs= ps.executeQuery();

            //iesntras rs tenga datos

            while (rs.next()){

                System.out.println("ID        : "+rs.getInt("id"));
                System.out.println("Nombre    : "+rs.getString("nombre"));
                System.out.println("Cc        : "+rs.getString("cc"));
                System.out.println("Acomulado : "+rs.getString("premio")+" $");
                System.out.println("");
            }
        }catch (SQLException e){
            System.out.println("No se pudieron traer los mensajes");
            System.out.println(e);
        }
    }

}
