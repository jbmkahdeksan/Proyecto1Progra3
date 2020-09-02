/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author pg300
 */
public abstract class Factura {
    protected int Codigo;
    protected double total;
    protected int cantidad;
    protected String formaDePago;
    protected String ClaveElectronica;
    protected String NumeroFacturaElectronica;
    protected int Plazo;
    
    // atributos no primitivos
    protected Fecha fechaVencimiento;
    protected Fecha diaActual;
    protected Cliente cliente1;
    protected Fecha fecha;
    protected Producto producto;
    protected Empresa empresa;
    
    
    
    public String getCodigo(){
         return "FA."+Codigo;
    } 
        
    public abstract void  crearFactura();
    
    //definicion de constructor
    public Factura(int Codigo, double total, int cantidad, String formaDePago, Fecha fechaVencimiento, Fecha diaActual, String ClaveElectronica, String NumeroFacturaElectronica,
            int Plazo, Cliente cliente1, Fecha fecha, Producto producto, Empresa empresa) {
        this.Codigo = Codigo;
        this.total = total;
        this.cantidad = cantidad;
        this.formaDePago = formaDePago;
        this.fechaVencimiento = fechaVencimiento;
        this.diaActual = diaActual;
        this.ClaveElectronica = ClaveElectronica;
        this.NumeroFacturaElectronica = NumeroFacturaElectronica;
        this.Plazo = Plazo;
        this.cliente1 = cliente1;
        this.fecha = fecha;
        this.producto = producto;
        this.empresa = empresa;
    }
    
}