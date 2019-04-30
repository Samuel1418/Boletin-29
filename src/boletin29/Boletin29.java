/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Barco>lista= new ArrayList();
        Barco obxY= new Yates(30,900,250,5);
        Barco obxV= new Velero(30,900,4);
        Barco obxE= new EmbarcacionsDeportivas(30,900,500);
        lista.add(obxY);
        lista.add(obxE);
        lista.add(obxV);
         for(Barco list:lista){
             System.out.println(list);
}
        
    }
}