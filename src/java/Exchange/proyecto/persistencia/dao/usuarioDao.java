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
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonathan
 */
public class usuarioDao implements Crud {

    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int cont = 0;

    //Cone este metodo podemos ingresar 
    @Override
    public boolean consultar(usuariovo usuario) {
        String sql = "select * from usuario INNER JOIN ciudad on usuario.ciudad_id_ciudad=ciudad.id_ciudad WHERE usuario.correo=? and password=?";
        try {

            ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getCorreo());
            ps.setString(2, Encriptacion.sha1(usuario.getPassword()));
            rs = ps.executeQuery();
            while (rs.absolute(1)) {
                CiudadVO cvo = new CiudadVO();
                usuario.setId(rs.getInt("idusuario"));
                usuario.setNombres(rs.getString("usuario"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setPassword(rs.getString("password"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setPerfil(rs.getString("perfil"));
                cvo.setIdciudad(rs.getInt("id_ciudad"));
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

    //Con este metodo podemos Regristar un usuario
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

                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
        }
        con.desconectar();

        return false;
    }

    //Con este metodo podemos Verificar si un usuario existe
    @Override
    public boolean verificar(int id) {
        String sql = "select * from usuario inner join ciudad on usuario.ciudad_id_ciudad=ciudad.id_ciudad where idusuario=?";
        try {

            ps = con.getConnection().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            while (rs.next()) {
                usuariovo usuario = new usuariovo();
                CiudadVO cvo = new CiudadVO();

                usuario.setId(rs.getInt("idusuario"));
                usuario.setNombres(rs.getString("usuario"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setPassword(rs.getString("password"));
                usuario.setTelefono(rs.getString("telefono"));
                cvo.setIdciudad(rs.getInt("id_ciudad"));
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

    //Con este metodo podemos actualizar los datos del usuario
    @Override
    public boolean actualizar(usuariovo usuario, int id) {
        PreparedStatement ps = null;
        int filas = 0;

        try {
            String sql = "update usuario set usuario=?, correo=?, telefono=?,ciudad_id_ciudad=? where idusuario=?";
            ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, usuario.getNombres());
            ps.setString(2, usuario.getCorreo());
            ps.setString(3, usuario.getTelefono());
            ps.setInt(4, usuario.getCiudad_id());
            ps.setInt(5, usuario.getId());
            filas = ps.executeUpdate();

            if (verificar(id)) {
                return true;
            }

        } catch (Exception e) {

        }

        con.desconectar();
        return false;
    }//fin metodo actualizar

    //Con este metodo podemos cambiar la contraseña del usuario
    public boolean cambiarcontraseña(usuariovo usuario) {
        PreparedStatement ps = null;
        int filas;
        try {
            String sql = "update usuario set password=? where idusuario=?";
            ps = con.getConnection().prepareStatement(sql);
            ps.setString(1, Encriptacion.sha1(usuario.getPassword()));
            ps.setInt(2, usuario.getId());
            filas = ps.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        con.desconectar();
        return false;
    }

    //Con este metodo podemos ver la foto de perfil del usuario
    public void verperfil(int id, HttpServletResponse response) {
        Conexion con = new Conexion();
        PreparedStatement pst;
        ResultSet rs;
        con.getConnection();
        String sql = "select * from usuario where idusuario=" + id;
        InputStream inputStream = null;
        OutputStream outoutStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        response.setContentType("Foto");
        try {

            outoutStream = response.getOutputStream();
            pst = con.getConnection().prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                inputStream = rs.getBinaryStream("imagen_1");
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedOutputStream = new BufferedOutputStream(outoutStream);
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        } catch (Exception e) {

        }
    }

    @Override
    public boolean subirfoto(usuariovo usuario) {
        String subir = "update usuario set perfil=? where idusuario=?";
        int filas = 0;
        try {
            ps = con.getConnection().prepareStatement(subir);
            ps.setString(1, usuario.getPerfil());
            ps.setInt(2, usuario.getId());
            if (ps.executeUpdate() == 1) {
                return true;
            }

        } catch (Exception e) {

        }
        con.desconectar();
        return false;
    }
    
    public static void main(String[] args) {
        usuarioDao d=new usuarioDao();
        usuariovo vo =new usuariovo();
        vo.setId(19);
        vo.setPerfil("img/dr.jpg");
        d.subirfoto(vo);
    }

}
