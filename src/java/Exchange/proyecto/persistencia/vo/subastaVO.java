/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.vo;

/**
 *
 * @author johan
 */
public class subastaVO {
    private int id_solicitud;
    private String oferta;
    private String estado;
    private String notificacion;
    private int id_producto;

    public subastaVO() {
    }

    public subastaVO(int id_solicitud, String oferta, String estado, String notificacion, int id_producto) {
        this.id_solicitud = id_solicitud;
        this.oferta = oferta;
        this.estado = estado;
        this.notificacion = notificacion;
        this.id_producto = id_producto;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
}
