package comtrolador;

import modelo.User;
import modelo.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
                System.out.println("Usuario Creado");

            }catch (Exception ex){
                System.out.println(ex);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
    }


}
