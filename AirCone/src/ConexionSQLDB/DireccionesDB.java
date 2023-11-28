package ConexionSQLDB;

import ClasesPrincipales.Direcciones;
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
public class DireccionesDB {
    
    //Codigo para el listado en la base de datos
    public ArrayList<Direcciones> ListDireccion() {
        ArrayList<Direcciones> direccion = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT CASA_ID,PROVINCIA,CANTON,DISTRITO,CODIGO_POSTAL" + "   FROM DIRECCION");
            while (rs.next()) {
                Direcciones pr = new Direcciones();
                pr.setCasa_id(rs.getInt("CASA_ID"));
                pr.setProvincia(rs.getString("PROVINCIA"));
                pr.setCanton(rs.getString("CANTON"));
                pr.setDistrito(rs.getString("DISTRITO"));
                pr.setCodigo_postal(rs.getInt("CODIGO_POSTAL"));
                direccion.add(pr);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado");
        }

        return direccion;
    }
     //Codigo para insertar datos
    public void insertarDirecciones(Direcciones direccion){
    
        try{
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO DIRECCION(CASA_ID,PROVINCIA,CANTON,DISTRITO,CODIGO_POSTAL)"
                + "   VALUES(?,?,?,?,?)");
            pst.setInt(1,direccion.getCasa_id());
            pst.setString(2,direccion.getProvincia());
            pst.setString(3,direccion.getCanton());
            pst.setString(4,direccion.getDistrito());
            pst.setInt(5,direccion.getCodigo_postal());
            pst.executeUpdate();
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Insert");
        }
    }
    
}
