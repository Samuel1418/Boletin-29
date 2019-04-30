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
public class EmbarcacionsDeportivas extends Barco {
    
    private int potenciaCV;
    private float precio;
    public EmbarcacionsDeportivas(int dias,int eslora, int potenciaCV) {
        super(dias,eslora);
        this.potenciaCV=potenciaCV;
    }
    
    @Override
    public float calcPrecio(){
   precio=super.calcPrecio()+(potenciaCV*2);
   System.out.println(precio);
   return precio;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "EmbarcacionsDeportivas{" + "potenciaCV=" + potenciaCV + ", precio=" + precio + '}';
    }
    
    
    
}
