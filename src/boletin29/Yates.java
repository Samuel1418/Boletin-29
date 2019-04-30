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
public class Yates extends Barco{
    private int NumCamarotes;
    private int potenciaCV;
    private float precio;
    
    public Yates(int dias,int eslora, int potenciaCV,int NumCamarotes) {
        super(dias,eslora);
        this.potenciaCV=potenciaCV;
        this.NumCamarotes=NumCamarotes;
    }
    
    @Override
    public float calcPrecio(){
   precio=super.calcPrecio()+(potenciaCV*2)+(25*NumCamarotes);
        System.out.println(precio);
   return precio;
    }

    public int getNumCamarotes() {
        return NumCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Yates{" + "NumCamarotes=" + NumCamarotes + ", potenciaCV=" + potenciaCV + ", precio=" + precio + '}';
    }
    
    
}
