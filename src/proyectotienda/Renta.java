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
public class Renta {
    private int opc;
    private int Precio;
    private int deposito;
    private int totalapagar;

    /**
     * @param Precio the Precio to set
     */
    public void setPrecio(int precio) {
        this.Precio = precio;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    /**
     * @return the totalapagar
     */
    public int getTotalapagar() {
        switch(opc){
            case 1: totalapagar=800;
            break;
            case 2: totalapagar=1000;
            break;
            case 3: totalapagar=750;
            break;
        }
        return totalapagar;
    }
    public void calculartotal(){
    totalapagar = deposito + Precio;
    }

    /**
     * @param opc the opc to set
     */
    public void setOpc(int opc) {
        this.opc = opc;
    }
    
}
