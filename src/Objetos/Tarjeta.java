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
public class Tarjeta {
    private Integer id;
    private Integer creditoDisponible;
    private Integer periodo;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreditoDisponible() {
        return creditoDisponible;
    }

    public void setCreditoDisponible(Integer creditoDisponible) {
        this.creditoDisponible = creditoDisponible;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "id=" + id + ", creditoDisponible=" + creditoDisponible + ", periodo=" + periodo + '}';
    }
    
    
    
}
