/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.dao;

import Exchange.proyecto.persistencia.conexion.Conexion;
import Exchange.proyecto.persistencia.interfaces.CrusSubasta;
import Exchange.proyecto.persistencia.vo.subastaVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author johan
 */
public class subastaDAO implements CrusSubasta {

    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int cont = 0;

    @Override
    public boolean consultar(subastaVO sub) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ingresar(subastaVO sub) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO solicitud_intercambio(oferta,estado,notificacion,producto_idproducto) VALUES(?,?,?,?)";
        try {
            pst = con.getConnection().prepareStatement(sql);
            pst.setString(1, sub.getOferta());
            pst.setString(2, sub.getEstado());
            pst.setString(3, sub.getNotificacion());
            pst.setInt(4, sub.getId_producto());
            if (pst.executeUpdate() == 1) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            con.desconectar();
        }
        return false;
    }

    @Override
    public boolean eliminar(subastaVO sub) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM `solicitud_intercambio` WHERE idsolicitud_intercambio=? ";
        try {
            pst = con.getConnection().prepareStatement(sql);
            pst.setInt(1, sub.getId_solicitud());
            if (pst.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public List listar(int id) {
        PreparedStatement pst;
        ResultSet rs;
        List<subastaVO> lista = new ArrayList<>();
        String sql="SELECT *FROM solicitud_intercambio WHERE solicitud_intercambio.preoducto_idproducto=? ORDER BY solicitud_intercambio.idsolicitud_intercambio DESC ";
        try {
            pst=con.getConnection().prepareStatement(sql);
            pst.setInt(1, id);
            rs=pst.executeQuery();
            while(rs.next()){
                subastaVO svo = new subastaVO();
                svo.setId_solicitud(rs.getInt("idsolicitud_intercambio"));
                svo.setOferta(rs.getString("oferta"));
                svo.setEstado(rs.getString("estado"));
                svo.setNotificacion(rs.getString("notificacion"));
                svo.setId_producto(rs.getInt("producto_idproducto"));
                lista.add(svo);
            }   
            
        } catch (Exception e) {
        }
        return lista;
    }

}
