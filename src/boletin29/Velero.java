/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author Samuel
 */
public class Velero extends Barco {
    private int numMastiles;
    private float precio;
    
    public Velero(int dias, int eslora,int numMastiles) {
        super(dias,eslora);
        this.numMastiles=numMastiles;
    }
    
    @Override
    public float calcPrecio(){
   precio=super.calcPrecio()+(numMastiles*8);
   System.out.println(precio);
   return precio;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Velero{" + "numMastiles=" + numMastiles + ", precio=" + precio + '}';
    }
 
    
}
