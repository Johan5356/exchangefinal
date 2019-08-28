/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.interfaces;

import Exchange.proyecto.persistencia.vo.subastaVO;

/**
 *
 * @author johan
 */
public interface CrusSubasta {
     public boolean consultar(subastaVO sub);
    public boolean ingresar(subastaVO sub);
    public boolean eliminar(subastaVO sub);
    
}
