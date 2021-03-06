/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.data;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import logic.Cliente;
import logic.Empresa;
import logic.Producto;

/**
 *
 * @author Porras
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Datax {
    private List<Cliente> clientes;
    private Empresa empresa;
    private List<Producto> productos;
    
    
    public Datax() {
        this.clientes = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.empresa = new Empresa();
    }
     
    public List<Cliente> getClientes() {
        return clientes;
    }
    
    
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
