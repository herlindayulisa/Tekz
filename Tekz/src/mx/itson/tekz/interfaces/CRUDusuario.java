/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tekz.interfaces;

import java.util.List;

/**
 *
 * @author Cristian
 */
public interface CRUDusuario {
    
    public void Agregar(int numeroDeCuenta,String nombre,String apellido, String direccion, String estado, String ciudad, String telefono);
    public List Obtener();
    public void Editar();
    public void Eliminar();
    
    
}
