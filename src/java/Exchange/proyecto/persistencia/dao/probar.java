/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exchange.proyecto.persistencia.dao;

import Exchange.proyecto.persistencia.vo.PublicarVO;

/**
 *
 * @author jonathan
 */
public class probar {
    public static void main(String[] args) {
        ProductoDAO dao=new ProductoDAO();
        PublicarVO vo = new PublicarVO();
        vo.setId_publicar(22);
       
        
        dao.consultarproducto(vo);
    }
     
    
}
