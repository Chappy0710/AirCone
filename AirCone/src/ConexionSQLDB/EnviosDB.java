package ConexionSQLDB;

import ClasesPrincipales.Envios;
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
public class EnviosDB {
    
     //Codigo para el listado en la base de datos
    public ArrayList<Envios> ListEnvio() {
        ArrayList<Envios> envio = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ENVIO_ID,TIPO,ESTADO" + "   FROM ENVIO");
            while (rs.next()) {
                Envios pr = new Envios();
                pr.setEnvio_id(rs.getInt("ENVIO_ID"));
                pr.setTipo(rs.getString("TIPO"));
                pr.setEstado(rs.getString("ESTADO"));
                envio.add(pr);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado");
        }

        return envio;
    }
     //Codigo para insertar datos
    public void insertarEnvios(Envios envio){
    
        try{
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO ENVIO(ENVIO_ID,TIPO,ESTADO)"
                + "   VALUES(?,?,?)");
            pst.setInt(1,envio.getEnvio_id());
            pst.setString(2,envio.getTipo());
            pst.setString(3,envio.getEstado());
            pst.executeUpdate();
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Insert");
        }
    }
    
}
