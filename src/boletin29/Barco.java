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
public abstract class Barco {
    private int dias;
    private float precio;
    private int eslora;
    
    public float calcPrecio(){
    precio=dias*(eslora*10);
    return precio;
    }

    public Barco(int dias, int eslora) {
        this.dias = dias;
        this.eslora = eslora;
    }

    public int getDias() {
        return dias;
    }

    public int getEslora() {
        return eslora;
    }
    
    
}
