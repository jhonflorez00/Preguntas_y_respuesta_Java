package comtrolador;

import modelo.User;
import modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao {
    public  static  void  crearUserDB(User user){

        Conexion db_connect =new Conexion();
        try (Connection conexion = db_connect.get_connection()){
            PreparedStatement ps=null;
            try {
                String query="INSERT INTO `usuario` (nombre,cc,acomulado) VALUES (?,?,?);";
                ps =conexion.prepareStatement(query);
                ps.setString(1 ,user.getNombre());
                ps.setInt(2,user.getCc());
                ps.setInt(3,user.getAcomulado());
                ps.executeUpdate(); //actualizar los cambios
                System.out.println("Usuario guardado");

            }catch (Exception ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void  historial(){
        Conexion db_connect =new Conexion();
        PreparedStatement ps=null;
        ResultSet rs=null;

        try(Connection conexion = db_connect.get_connection()){
            String query="SELECT * FROM usuario";
            ps=conexion.prepareStatement(query);
            rs= ps.executeQuery();

            //iesntras rs tenga datos
            while (rs.next()){
                System.out.println("ID        : "+rs.getInt("id"));
                System.out.println("Nombre    : "+rs.getString("nombre"));
                System.out.println("Cc        : "+rs.getString("cc"));
                System.out.println("Acomulado : "+rs.getString("acomulado")+" $");
                System.out.println("");
            }
        }catch (SQLException e){
            System.out.println("No se pudieron traer los mensajes");
            System.out.println(e);
        }
    }


}
