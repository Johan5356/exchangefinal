/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.interfaces;

import Exchange.proyecto.persistencia.vo.usuariovo;

/**
 *
 * @author jonathan
 */
public interface Crud {
    public boolean consultar(usuariovo usuario);
    public boolean agregar(usuariovo usuario);
    public boolean verificar(int id);
    public boolean actualizar(usuariovo usuario,int id);
    public boolean subirfoto(usuariovo usuario);
}
