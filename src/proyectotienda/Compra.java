/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotienda;

/**
 *
 * @author raul_
 */
abstract class Compra {
    private String Carro;
    
    private int pagototal;

    /**
     * @param preciocarro the preciocarro to set
     */
    public void setPreciocarro(String carro) {
        this.Carro= carro;
    }

    
    

    
    abstract void calcularpago();
    
    
    
    }
    

