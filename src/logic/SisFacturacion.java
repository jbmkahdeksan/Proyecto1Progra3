/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Porras
 */
public class SisFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p = new Producto("Producto",1,1000);
        System.out.println(p.getDescripcionProducto() + p.getDesc() + p.getPrecio());
        System.out.println((int)p.getCodigo());
    }
    
}
