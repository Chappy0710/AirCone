package ConexionSQLDB;

import ClasesPrincipales.Ordenes;
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
public class OrdenesDB {
    
    //Codigo para el listado en la base de datos
    public ArrayList<Ordenes> ListOrden() {
        ArrayList<Ordenes> orden = new ArrayList();
        try {
            Connection cnx = DataBaseConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT ORDEN_ID,TOTAL_ORDENES,METODO_PAGO,ENVIO_ID,CLIENTE_ID,PRODUCTO_ID,SUCURSAL_ID" + "   FROM ORDEN");
            while (rs.next()) {
                Ordenes pr = new Ordenes();
                pr.setOrden_id(rs.getInt("ORDEN_ID"));
                pr.setTotal_ordenes(rs.getInt("TOTAL_ORDENES"));
                pr.setMetodo_pago(rs.getString("METODO_PAGO"));
                pr.setEnvio_id(rs.getInt("ENVIO_ID"));
                pr.setCliente_id(rs.getInt("CLIENTE_ID"));
                pr.setProducto_id(rs.getInt("PRODUCTO_ID"));
                pr.setSucursal_id(rs.getInt("SUCURSAL_ID"));
                orden.add(pr);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Listado");
        }

        return orden;
    }
     //Codigo para insertar datos
    public void insertarOrdenes(Ordenes orden){
    
        try{
            Connection cnx = DataBaseConexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO ORDEN(ORDEN_ID,TOTAL_ORDENES,METODO_PAGO,ENVIO_ID,CLIENTE_ID,PRODUCTO_ID,SUCURSAL_ID)"
                + "   VALUES(?,?,?,?,?,?,?)");
            pst.setInt(1,orden.getOrden_id());
            pst.setInt(2,orden.getTotal_ordenes());
            pst.setString(3,orden.getMetodo_pago());
            pst.setInt(4,orden.getEnvio_id());
            pst.setInt(5,orden.getCliente_id());
            pst.setInt(6,orden.getProducto_id());
            pst.setInt(7,orden.getSucursal_id());
            pst.executeUpdate();
            
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Insert");
        }
    }

}
