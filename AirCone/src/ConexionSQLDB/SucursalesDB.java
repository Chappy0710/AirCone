package ConexionSQLDB;

import ClasesPrincipales.Sucursales;
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
public class SucursalesDB {
    
    //Codigo para el listado en la base de datos
    public ArrayList<Sucursales> ListSucursal() {
        ArrayList<Sucursales> sucursal = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT SUCURSAL_ID,TELEFONO,HORARIO,CORREO_CONTACTO" + "   FROM SUCURSAL");
            while (rs.next()) {
                Sucursales pr = new Sucursales();
                pr.setSucursal_id(rs.getInt("SUCURSAL_ID"));
                pr.setTelefono(rs.getInt("TELEFONO"));
                pr.setHorario(rs.getString("HORARIO"));
                pr.setCorreo_contacto(rs.getString("CORREO_CONTACTO"));
                sucursal.add(pr);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado");
        }

        return sucursal;
    }
     //Codigo para insertar datos
    public void insertarSucursales(Sucursales sucursal){
    
        try{
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO SUCURSAL(SUCURSAL_ID,TELEFONO,HORARIO,CORREO_CONTACTO)"
                + "   VALUES(?,?,?,?)");
            pst.setInt(1,sucursal.getSucursal_id());
            pst.setInt(2,sucursal.getTelefono());
            pst.setString(3,sucursal.getHorario());
            pst.setString(4,sucursal.getCorreo_contacto());
            pst.executeUpdate();
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Insert");
        }
    }

}
