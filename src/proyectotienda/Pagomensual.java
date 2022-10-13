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
public class Pagomensual extends Compra {
    private int opc;
    private double pagomensual;
    private int Preciocarro;
    private int Seguro;
    int carro1=18000,carro2=200000,carro3=175000;

    /**
     * @return the pagomensual
     */
    public double getPagomensual() {
        switch(opc){
            case 1: pagomensual=(carro1+(carro1*.15))/36;
            break;
            case 2: pagomensual=(carro2+(carro2*.15))/36;
            break;
            case 3: pagomensual=(carro3+(carro3*.15))/36;
            break;
        }
        return pagomensual;
    }

    
    public void setPreciocarro(int preciocarro) {
        this.Preciocarro = preciocarro;
    }

    
    public void setSeguro(int seguro) {
        this.Seguro = seguro;
    }

      public void calcularpago(){
          pagomensual= Preciocarro + Seguro;
      }

    /**
     * @param opc the opc to set
     */
    public void setOpc(int opc) {
        this.opc = opc;
    }
    }


     
