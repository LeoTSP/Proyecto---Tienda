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
public class Pagosemanal extends Compra {
       private int pagosemanal;
    private int Preciocarro;
    private int Seguro;

    /**
     * @return the pagomensual
     */
    public int getPagomensual() {
        return pagosemanal;
    }

    
    public void setPreciocarro(int preciocarro) {
        this.Preciocarro = preciocarro;
    }

    
    public void setSeguro(int seguro) {
        this.Seguro = seguro;
    }

      public void calcularpago(){
          pagosemanal= Preciocarro + Seguro;
      }
}
