/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.dao;

import Exchange.proyecto.persistencia.conexion.Conexion;
import Exchange.proyecto.persistencia.vo.CategoriasVo;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathan
 */
public class CategoriaDao {
    
    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List listar(){
         PreparedStatement pst;
        ResultSet rs;
        List<CategoriasVo>lista=new ArrayList<>();
        String sql="SELECT * FROM `categoria` ";
        try {
            pst=con.getConnection().prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
               CategoriasVo categoriasVo =new CategoriasVo();
                categoriasVo.setIdCategoria(rs.getInt("idcategoria"));
                categoriasVo.setDescripcion(rs.getString("categoria"));
                
               
               lista.add(categoriasVo);
            }
            
        } catch (Exception e) {
        }
        return lista;
    }
    
}
