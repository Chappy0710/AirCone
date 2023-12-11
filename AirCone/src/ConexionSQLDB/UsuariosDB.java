package ConexionSQLDB;

import ClasesPrincipales.Usuarios;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author kenneth
 */
public class UsuariosDB {
    
    //Codigo para el listado en la base de datos
    public ArrayList<Usuarios> ListUsuario() {
        ArrayList<Usuarios> usuario = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT USUARIO_ID,NOMBRE_USUARIO,CONTRASEÑA" + "   FROM USUARIO");
            while (rs.next()) {
                Usuarios pr = new Usuarios();
                pr.setUsuario_id(rs.getInt("USUARIO_ID"));
                pr.setNombre_usuario(rs.getString("NOMBRE_USUARIO"));
                pr.setContraseña(rs.getString("CONTRASEÑA"));
                usuario.add(pr);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado");
        }

        return usuario;
    }
     //Codigo para insertar datos
    public void insertarUsuarios(Usuarios usuario){
    
        try{
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO USUARIO (USUARIO_ID,NOMBRE_USUARIO,CONTRASEÑA)"
                + "   VALUES(?,?,?)");
            pst.setInt(1,usuario.getUsuario_id());
            pst.setString(2,usuario.getNombre_usuario());
            pst.setString(3,usuario.getContraseña());
            pst.executeUpdate();
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Insert");
        }
    }

}
