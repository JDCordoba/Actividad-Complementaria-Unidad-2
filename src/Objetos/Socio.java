/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author JDC
 */
public class Socio extends Cliente{
   
    private Integer id;
    
    private Tarjeta tarjeta;
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
    

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + '}';
    }
    
    
    
    
}
