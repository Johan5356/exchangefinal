/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.dao;

import Exchange.proyecto.persistencia.conexion.Conexion;
import Exchange.proyecto.persistencia.interfaces.CrudProducto;
import Exchange.proyecto.persistencia.vo.CategoriasVo;
import Exchange.proyecto.persistencia.vo.CiudadVO;
import Exchange.proyecto.persistencia.vo.PublicarVO;
import Exchange.proyecto.persistencia.vo.usuariovo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author johan
 */
public class ProductoDAO implements CrudProducto {

    Conexion con = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int cont = 0;

    //Con Este Metodo Se publica el usuario
    @Override
    public boolean crear_producto(PublicarVO p) {
        PreparedStatement pst = null;
        String sql = "insert into producto (nombre,cantidad,descripcion,precio_estimado,marca,usuario_idusuario,categoria_idcategoria,imagen_1,tiempo_uso)VALUES(?,?,?,?,?,?,?,?,?)";
        try {

            pst = con.getConnection().prepareStatement(sql);
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getCantidad());
            pst.setString(3, p.getDescripcion());
            pst.setString(4, p.getPrecioestimado());
            pst.setString(5, p.getMarca());
            pst.setInt(6, p.getId_usuario());
            pst.setInt(7, p.getId_categoria());
            pst.setBlob(8, p.getImagen_1());
            pst.setString(9, p.getTiempouso());

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

    //Con este Metodo se puede editar la publicación
    @Override
    public boolean editar_producto(PublicarVO p) {
        PreparedStatement pst = null;
        String sql = "update producto set nombre=?,cantidad=?,descripcion=?,precio_estimado=?,marca=?,categoria_idcategoria=? where idproducto=?";
        try {

            pst = con.getConnection().prepareStatement(sql);
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getCantidad());
            pst.setString(3, p.getDescripcion());
            pst.setString(4, p.getPrecioestimado());
            pst.setString(5, p.getMarca());

            pst.setInt(6, p.getId_categoria());

            pst.setInt(7, p.getId_publicar());

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

    //Con esta lista podemos Ver los productos de los usuarios
    public List listar(int id) {
        PreparedStatement pst;
        ResultSet rs;
        List<PublicarVO> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE producto.usuario_idusuario=? ORDER BY producto.idproducto DESC";
        try {
            pst = con.getConnection().prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                PublicarVO pvo = new PublicarVO();
                pvo.setId_publicar(rs.getInt("idproducto"));
                pvo.setNombre(rs.getString("nombre"));
                pvo.setDescripcion(rs.getString("descripcion"));
                pvo.setPrecioestimado(rs.getString("precio_estimado"));
                pvo.setImagen_1(rs.getBinaryStream("imagen_1"));
                pvo.setMarca(rs.getString("marca"));
                pvo.setImagen1(rs.getString("imagen1"));
                lista.add(pvo);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    //Con esta lista podemos ver todas las publicaciones en orden descentente
    public List verproducto() {
        PreparedStatement pst;
        ResultSet rs;
        List<PublicarVO> producto = new ArrayList<>();
        String sql = "select * from producto inner join usuario on producto.usuario_idusuario=usuario.idusuario ORDER BY idproducto DESC";
        try {
            pst = con.getConnection().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                PublicarVO pvo = new PublicarVO();
                usuariovo vo = new usuariovo();
                pvo.setId_publicar(rs.getInt("idproducto"));
                pvo.setNombre(rs.getString("nombre"));
                pvo.setDescripcion(rs.getString("descripcion"));
                pvo.setPrecioestimado(rs.getString("precio_estimado"));
                pvo.setImagen_1(rs.getBinaryStream("imagen_1"));
                pvo.setMarca(rs.getString("marca"));
                pvo.setId_usuario(rs.getInt("usuario_idusuario"));
                pvo.setImagen1(rs.getString("imagen1"));
                pvo.setImagen2(rs.getString("imagen2"));
                vo.setNombres(rs.getString("usuario"));
                pvo.setUsuario(vo);
                producto.add(pvo);
            }

        } catch (Exception e) {
        }
        return producto;
    }

    //Con este metodo podemos per las imagenes de las publicaciones
    public void verimagen(int id, HttpServletResponse response) {
        Conexion con = new Conexion();
        PreparedStatement pst;
        ResultSet rs;
        con.getConnection();
        String sql = "select * from producto where idproducto=" + id;
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

    //Con este metodo se elimina las publicaciones
    @Override
    public boolean eliminar_producto(PublicarVO p) {
        PreparedStatement pst = null;
        ComentariosDao cd = new ComentariosDao();
        String sql = "DELETE FROM `producto` WHERE idproducto=?";
        try {
            
                pst = con.getConnection().prepareStatement(sql);
                pst.setInt(1, p.getId_publicar());
                if (cd.eliminarid(p.getId_publicar())) {
                if (pst.executeUpdate() == 1) {
                    return true;
                }
            }
                if (pst.executeUpdate() == 1) {
                    return true;
                }
            

        } catch (Exception e) {
        }
        return false;
    }

    //Con este metodo podemos ver las publicaciones por categorias
    public List listarcategoria(int id) {
        PreparedStatement pst;
        ResultSet rs;
        List<PublicarVO> lista = new ArrayList<>();
        String sql = "SELECT * FROM `producto` WHERE categoria_idcategoria=" + id;
        try {
            pst = con.getConnection().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                PublicarVO pvo = new PublicarVO();
                pvo.setId_publicar(rs.getInt("idproducto"));
                pvo.setNombre(rs.getString("nombre"));
                pvo.setDescripcion(rs.getString("descripcion"));
                pvo.setPrecioestimado(rs.getString("precio_estimado"));
                pvo.setImagen_1(rs.getBinaryStream("imagen_1"));
                pvo.setMarca(rs.getString("marca"));
                lista.add(pvo);
            }

        } catch (Exception e) {
        }
        return lista;
    }

    //Con este metodo podemos ver los detalles de una publicación
    public boolean detallesproducto(PublicarVO pvo) {
        PreparedStatement pst;
        ResultSet rs;
        String sql = "SELECT * FROM producto INNER join usuario on producto.usuario_idusuario=usuario.idusuario INNER JOIN categoria ON producto.categoria_idcategoria=categoria.idcategoria INNER JOIN ciudad on usuario.ciudad_id_ciudad=ciudad.id_ciudad WHERE idproducto=?";
        try {
            pst = con.getConnection().prepareStatement(sql);
            pst.setInt(1, pvo.getId_publicar());
            rs = pst.executeQuery();
            while (rs.absolute(1)) {
                usuariovo vo = new usuariovo();
                CiudadVO cvo = new CiudadVO();
                CategoriasVo cv = new CategoriasVo();
                pvo.setId_publicar(rs.getInt("idproducto"));
                pvo.setNombre(rs.getString("nombre"));
                pvo.setDescripcion(rs.getString("descripcion"));
                pvo.setPrecioestimado(rs.getString("precio_estimado"));
                pvo.setImagen_1(rs.getBinaryStream("imagen_1"));
                pvo.setMarca(rs.getString("marca"));
                pvo.setCantidad(rs.getString("cantidad"));
                pvo.setId_usuario(rs.getInt("usuario_idusuario"));
                vo.setNombres(rs.getString("usuario"));
                vo.setTelefono(rs.getString("telefono"));
                cvo.setDescripcion(rs.getString("ciudad"));
                cv.setDescripcion(rs.getString("categoria"));
                pvo.setImagen1(rs.getString("imagen1"));
                pvo.setImagen2(rs.getString("imagen2"));
                pvo.setImagen3(rs.getString("imagen3"));
                vo.setPerfil(rs.getString("perfil"));
                vo.setCiudadVO(cvo);
                pvo.setUsuario(vo);
                pvo.setCategoriasVo(cv);
                return true;
            }

        } catch (Exception e) {
        }
        return false;
    }

    //Con este metodo podemos ver los productos de otro usuario
    public boolean consultarproducto(PublicarVO pvo) {
        PreparedStatement pst;
        ResultSet rs;

        String sql = "SELECT * FROM producto INNER join usuario on producto.usuario_idusuario=usuario.idusuario INNER JOIN categoria ON producto.categoria_idcategoria=categoria.idcategoria INNER JOIN ciudad on usuario.ciudad_id_ciudad=ciudad.id_ciudad WHERE usuario_idusuario=?";
        try {
            pst = con.getConnection().prepareStatement(sql);
            pst.setInt(1, pvo.getId_usuario());
            rs = pst.executeQuery();
            while (rs.absolute(1)) {
                usuariovo vo = new usuariovo();
                CiudadVO cvo = new CiudadVO();
                CategoriasVo cv = new CategoriasVo();
                pvo.setId_publicar(rs.getInt("idproducto"));
                pvo.setNombre(rs.getString("nombre"));
                pvo.setDescripcion(rs.getString("descripcion"));
                pvo.setPrecioestimado(rs.getString("precio_estimado"));
                pvo.setImagen_1(rs.getBinaryStream("imagen_1"));
                pvo.setMarca(rs.getString("marca"));
                pvo.setCantidad(rs.getString("cantidad"));
                pvo.setId_usuario(rs.getInt("usuario_idusuario"));
                vo.setNombres(rs.getString("usuario"));
                vo.setTelefono(rs.getString("telefono"));
                cvo.setDescripcion(rs.getString("ciudad"));
                cv.setDescripcion(rs.getString("categoria"));
                vo.setCorreo(rs.getString("correo"));
                vo.setCiudadVO(cvo);
                pvo.setUsuario(vo);
                pvo.setCategoriasVo(cv);
                return true;
            }

        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean Publicar_producto(PublicarVO p) {
        PreparedStatement pst = null;
        String sql = "insert into producto (nombre,cantidad,descripcion,precio_estimado,marca,usuario_idusuario,categoria_idcategoria,imagen1,imagen2,imagen3,imagen4,imagen5)VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.getConnection().prepareStatement(sql);
            pst.setString(1, p.getNombre());
            pst.setString(2, p.getCantidad());
            pst.setString(3, p.getDescripcion());
            pst.setString(4, p.getPrecioestimado());
            pst.setString(5, p.getMarca());
            pst.setInt(6, p.getId_usuario());
            pst.setInt(7, p.getId_categoria());
            pst.setString(8, p.getImagen1());
            pst.setString(9, p.getImagen2());
            pst.setString(10, p.getImagen3());
            pst.setString(11, p.getImagen4());
            pst.setString(12, p.getImagen5());

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

}
