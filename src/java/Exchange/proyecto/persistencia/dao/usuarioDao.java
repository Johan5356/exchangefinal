/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.dao;

import Exchange.proyecto.persistencia.conexion.Conexion;
import Exchange.proyecto.persistencia.interfaces.Crud;
import Exchange.proyecto.persistencia.vo.CiudadVO;
import Exchange.proyecto.persistencia.vo.usuariovo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jonathan
 */
public class usuarioDao implements Crud {

    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int cont = 0;

    @Override
    public boolean consultar(usuariovo usuario) {
        String sql = "select * from usuario INNER JOIN ciudad on usuario.ciudad_id_ciudad=ciudad.id_ciudad WHERE usuario.correo=? and password=?";
        try {

            ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getCorreo());
            ps.setString(2, Encriptacion.sha1(usuario.getPassword()));
            rs = ps.executeQuery();
            while (rs.absolute(1)) {
                CiudadVO cvo=new CiudadVO();
                usuario.setId(rs.getInt("idusuario"));
                usuario.setNombres(rs.getString("usuario"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setPassword(rs.getString("password"));
                usuario.setTelefono(rs.getString("telefono"));
                cvo.setDescripcion(rs.getString("ciudad"));
                usuario.setCiudadVO(cvo);
                return true;

            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        con.desconectar();
        return false;

    }

    @Override
    public boolean agregar(usuariovo usuario) {
        PreparedStatement pst = null;

        String sql = "insert into usuario(usuario,correo,password,telefono,genero,ciudad_id_ciudad) values(?,?,?,?,?,?)";
        try {
            pst = con.getConnection().prepareStatement(sql);
            pst.setString(1, usuario.getNombres());
            pst.setString(2, usuario.getCorreo());
            pst.setString(3, Encriptacion.sha1(usuario.getPassword()));
            pst.setString(4, usuario.getTelefono());
            pst.setString(5, usuario.getGenero());
            pst.setInt(6, usuario.getCiudad_id());

            if (pst.executeUpdate() == 1) {
                usuario.setNombres(usuario.getNombres());
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
        }
        con.desconectar();

        return false;
    }

    @Override
    public boolean verificar(usuariovo usuario) {
        String sql = "select * from usuario where correo = ?";
        try {

            ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getCorreo());

            rs = ps.executeQuery();
            while (rs.absolute(1)) {

                usuario.setCorreo(rs.getString("correo"));

                return true;

            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        con.desconectar();
        return false;
    }

    @Override
    public boolean actualizar(usuariovo usuario) {
       PreparedStatement ps=null;
       int filas=0;
       
        try {
            String sql="update usuario set usuario=?, correo=?, telefono=?,ciudad_id_ciudad=? where idusuario=?";
            ps=con.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNombres());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getTelefono());
            ps.setInt(4, usuario.getCiudad_id());
            ps.setInt(5, usuario.getId());
            filas=ps.executeUpdate();
            
            return true;
                    
        } catch (Exception e) {
            
        }
        
        
        con.desconectar();
        return false;
    }//fin metodo actualizar

  public boolean cambiarcontraseña(usuariovo usuario){
      PreparedStatement ps=null;
      int filas;
      try {
          String sql="update usuario set password=? where idusuario=?";
          ps=con.getConnection().prepareStatement(sql);
          ps.setString(1, Encriptacion.sha1(usuario.getPassword()));
          ps.setInt(2, usuario.getId());
          filas=ps.executeUpdate();
          return true ;
      } catch (Exception e) {
      }
      con.desconectar();
      return false;
  }
  
  public boolean consultarusuario(usuariovo usuario) {
        String sql = "select * from usuario where idusuario = ?";
        try {

            ps = con.getConnection().prepareStatement(sql);
            ps.setInt(1, usuario.getId());

            rs = ps.executeQuery();
            while (rs.absolute(1)) {

                usuario.setCorreo(rs.getString("correo"));

                return true;

            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        con.desconectar();
        return false;
    }
    
    
    

}
