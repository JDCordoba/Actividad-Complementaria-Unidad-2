/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import Objetos.Cliente;

/**
 *
 * @author Juan
 */
public class VideoClub {
    
   


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Cliente cliente;
        cliente = new Cliente();
        
        cliente.setNombre("Juan");
        cliente.setApellido("Cordoba");
        cliente.setDni(Integer.parseInt("3232323") );
        cliente.setDomicilio("barrio los olivares");
        cliente.setTelefono(Integer.parseInt("23244"));
        
        System.out.println("Clientes");
        
        System.out.println("nombre = "+cliente.getNombre());
        System.out.println("apellido = "+cliente.getApellido());
        System.out.println("Dni = "+cliente.getDni());
        System.out.println("Domicilio = "+cliente.getDomicilio());
       System.out.println("Telefono = "+cliente.getTelefono());
    
}
}
