/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.vo;
import java.io.InputStream;
/**
 *
 * @author johan
 */
public class PublicarVO {
    private int id_publicar;
    private String nombre;
    private String cantidad;
    private String descripcion;
    private String precioestimado;
    private String marca;
    private String certificado;
    private String tiempouso;
    private usuariovo usuario;
    private CategoriasVo categoriasVo;
     private String categoriasV5o;


    public CategoriasVo getCategoriasVo() {
        return categoriasVo;
    }

    public void setCategoriasVo(CategoriasVo categoriasVo) {
        this.categoriasVo = categoriasVo;
    }
    

    public usuariovo getUsuario() {
        return usuario;
    }

    public void setUsuario(usuariovo usuario) {
        this.usuario = usuario;
    }

    public InputStream getImagen_1() {
        return imagen_1;
    }

    public void setImagen_1(InputStream imagen_1) {
        this.imagen_1 = imagen_1;
    }
    private int id_usuario;
    private int id_categoria;
    private int id_tiempopublicacion;
   private InputStream imagen_1;

    public PublicarVO() {
    }
    

    public PublicarVO(int id_publicar, String nombre, String cantidad, String descripcion, String precioestimado, String marca, String certificado, String tiempouso, int id_usuario, int id_categoria, int id_tiempopublicacion, String imagen_1) {
        this.id_publicar = id_publicar;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioestimado = precioestimado;
        this.marca = marca;
        this.certificado = certificado;
        this.tiempouso = tiempouso;
        this.id_usuario = id_usuario;
        this.id_categoria = id_categoria;
        this.id_tiempopublicacion = id_tiempopublicacion;
       
    }

    public PublicarVO(String computador, String string, String computador_en_buen_estado, String string0, String lenovo, String no, String _meses, int i, int i0, int i1, String anull) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
    public int getId_publicar() {
        return id_publicar;
    }

    public void setId_publicar(int id_publicar) {
        this.id_publicar = id_publicar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecioestimado() {
        return precioestimado;
    }

    public void setPrecioestimado(String precioestimado) {
        this.precioestimado = precioestimado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getTiempouso() {
        return tiempouso;
    }

    public void setTiempouso(String tiempouso) {
        this.tiempouso = tiempouso;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public int getId_tiempopublicacion() {
        return id_tiempopublicacion;
    }

    public void setId_tiempopublicacion(int id_tiempopublicacion) {
        this.id_tiempopublicacion = id_tiempopublicacion;
    }
    
    
    
    
}
