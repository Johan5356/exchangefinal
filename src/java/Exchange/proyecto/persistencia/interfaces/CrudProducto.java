/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.interfaces;

import Exchange.proyecto.persistencia.vo.PublicarVO;

/**
 *
 * @author johan
 */
public interface CrudProducto {
    public boolean crear_producto(PublicarVO p);
    public boolean editar_producto(PublicarVO p);
    public boolean eliminar_producto(PublicarVO p);
    public boolean Publicar_producto(PublicarVO p);

}
