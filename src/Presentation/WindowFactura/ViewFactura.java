/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowFactura;

import Presentation.WindowProductos.ProductoTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JTable;
import logic.Cliente;
import logic.Factura;
import logic.FacturaPDF;
import logic.FacturaXML;
import logic.Identificacion;
import logic.Producto;
import logic.Xmlhacienda;
import sistema.errors.CharacterExcep;
import sistema.errors.DataException;
import sistema.errors.EmptySpaceExcep;

/**
 *
 * @author Joaquin
 */
public class ViewFactura extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form ViewFactura
     */
    
    ModelFactura model;
    ControllerFactura controller;
    List<Producto> productos;
    Cliente currentCliente;
    List<Factura> facturas;
    
    public ViewFactura() {
        initComponents();
        tableClientes.addMouseListener(controller);
        tableProductos.addMouseListener(controller);
        productos = new ArrayList<>();
        facturas = new ArrayList<>();
  
        
    }
    
    @Override
    public void update(Observable o, Object arg) {
        this.tableProductosFac.setModel(new ProductoTableModel(this.model.getProductosFactura()));
        if(model.getProductosFactura().size()>0){
            this.lblSubtotal.setText(Float.toString(logic.Service.getInstance().subtotal(model.getProductosFactura())));
        
            this.lblImpuesto.setText(Float.toString(logic.Service.getInstance().impuestoFactura(13, model.getProductosFactura())));

            float total = logic.Service.getInstance().impuestoFactura(13, model.getProductosFactura()) + 
                    logic.Service.getInstance().subtotal(model.getProductosFactura());
        
            this.lblTotal.setText(Float.toString(total));
        }
        
       
        
    }
    
    public void setModel(ModelFactura model){
        this.model = model;
        model.addObserver(this);
    }
    
    public void setController(ControllerFactura controller){
        this.controller = controller;
    }

    public JTable getTableProductos() {
        return tableProductos;
    }

    public JTable getTableClientes() {
        return tableClientes;
    }

    public JTable getTableProductosFac() {
        return tableProductosFac;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdbtnEfectivo = new javax.swing.JRadioButton();
        rdbtnTarjeta = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableClientes = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProductosFac = new javax.swing.JTable();
        addProduc = new javax.swing.JButton();
        btnFinalizarFactur = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblImpuesto = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtIDProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Detalles de Factura");

        jLabel10.setText("ID Cliente:");

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel12.setText("Nombre");

        jLabel2.setText("Condición de la venta:");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel5.setText("Contado");

        jLabel3.setText("Forma de pago:");

        buttonGroup1.add(rdbtnEfectivo);
        rdbtnEfectivo.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        rdbtnEfectivo.setText("Efectivo");
        rdbtnEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnEfectivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbtnTarjeta);
        rdbtnTarjeta.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        rdbtnTarjeta.setText("Tarjeta");
        rdbtnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnTarjetaActionPerformed(evt);
            }
        });

        jLabel4.setText("Moneda:");

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel6.setText("Colones");

        jLabel7.setText("Impuesto valor agregado: ");

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel8.setText("13%");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Contenidos de Factura");

        jLabel11.setText("Lista de Productos");

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio"
            }
        ));
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProductos);

        jLabel18.setText("LIsta de Clientes");

        tableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "tipoID", "Nombre", "Telefono", "Provincia", "Canton"
            }
        ));
        tableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableClientes);

        jLabel16.setText("Productos en Factura");

        tableProductosFac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Precio"
            }
        ));
        jScrollPane2.setViewportView(tableProductosFac);
        if (tableProductosFac.getColumnModel().getColumnCount() > 0) {
            tableProductosFac.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            tableProductosFac.getColumnModel().getColumn(1).setHeaderValue("Descripcion");
            tableProductosFac.getColumnModel().getColumn(2).setHeaderValue("Precio");
        }

        addProduc.setText("Agregar Producto");
        addProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProducActionPerformed(evt);
            }
        });

        btnFinalizarFactur.setText("Finalizar Factura");
        btnFinalizarFactur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarFacturActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel14.setText("Subtotal:");

        lblSubtotal.setText("-------");
        lblSubtotal.setToolTipText("");

        jLabel15.setText("Impuesto:");

        lblImpuesto.setText("-------");

        jLabel17.setText("Total:");

        lblTotal.setText("-------");

        txtNombreCliente.setText("---");
        txtNombreCliente.setEditable(false);

        jLabel13.setText("ID Producto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtnEfectivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbtnTarjeta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliente))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFinalizarFactur)
                        .addGap(167, 167, 167)
                        .addComponent(btnSalir)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProduc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(483, 483, 483)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(214, 214, 214))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel18)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addProduc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rdbtnEfectivo)
                            .addComponent(rdbtnTarjeta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(lblImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarFactur)
                    .addComponent(btnSalir))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnTarjetaActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try {
            
            if (txtIDCliente.getText().isEmpty()) {
                throw new EmptySpaceExcep();
            }
            Cliente clienteaux = new Cliente();
            clienteaux.setID(txtIDCliente.getText());
            boolean flag = logic.Service.getInstance().isDuplicated(clienteaux);
           
            if (flag == true) {
                clienteaux = logic.Service.getInstance().getDataCliente(clienteaux);
                //this.model.setClienteActual(clienteaux); no funcionan??
                //this.controller.setCurrenteCliente(clienteaux);
                currentCliente = clienteaux;
                this.txtNombreCliente.setText(currentCliente.getNombre());
            }
            else{
                throw new DataException();
            }   
            
        }
        catch(EmptySpaceExcep e){
            e.infoError("Error", e, this);
        }
        catch(CharacterExcep e){
            e.infoError("Error", e, this);
        }
        catch (Exception e) {
        }
     
        
        
        
        
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void addProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProducActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDProducto.getText().isEmpty()) {
                throw new EmptySpaceExcep();
            }
            Producto p = new Producto();
            p.setCodigo(txtIDProducto.getText());
            p = logic.Service.getInstance().getDataProducto(txtIDProducto.getText());
            
            if (p!=null) {
                this.productos.add(p);
                
                this.txtIDProducto.setText(p.getDescripcionProducto());
                this.tableProductosFac.setModel(new ProductoTableModel(productos));
                
                
                this.lblSubtotal.setText(Float.toString(logic.Service.getInstance().subtotal(productos)));
        
                this.lblImpuesto.setText(Float.toString(logic.Service.getInstance().impuestoFactura(13, productos)));
     
                float total = logic.Service.getInstance().impuestoFactura(13, productos) + 
                        logic.Service.getInstance().subtotal(productos);
                this.lblTotal.setText(Float.toString(total));
            }
            else {
                throw new DataException();
            }
            

            
            
        }
        catch(EmptySpaceExcep e){
            e.infoError("Error", e, this);
        }
        catch(DataException e){
            e.infoError("Error", e, this);
        }
        catch (Exception e) {
        }
        
    }//GEN-LAST:event_addProducActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFinalizarFacturActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarFacturActionPerformed
        // TODO add your handling code here:
        try {
            float total = logic.Service.getInstance().impuestoFactura(13, productos) + 
                        logic.Service.getInstance().subtotal(productos);

            String formaPago = null;
            if (rdbtnTarjeta.isSelected()) {
                formaPago = "Tarjeta";
            }
            else if (rdbtnEfectivo.isSelected()  ) {
                formaPago = "Efectivo";
            }
            else   
                throw new EmptySpaceExcep();
            
            Factura current;
            current = new Factura(Integer.toString(logic.Service.getInstance().getFacturas().size()),total,productos.size(),
                    formaPago,currentCliente,logic.Service.getInstance().getDataEmpresa(),productos);
            
            logic.Service.getInstance().addFactura(current);
            
            
            
            Factura facturaPDF = new FacturaPDF(Integer.toString(logic.Service.getInstance().getFacturas().size()),total,productos.size(),
            formaPago,currentCliente,logic.Service.getInstance().getDataEmpresa(),productos);
            facturaPDF.crearFactura(); 
            
            
            
            Factura Xmlhacienda = new Xmlhacienda(Integer.toString(logic.Service.getInstance().getFacturas().size()),total,productos.size(),
            formaPago,currentCliente,logic.Service.getInstance().getDataEmpresa(),productos);
            
 
            //Xmlhacienda.crearFactura();
            
        }
        catch(CharacterExcep e){
            e.infoError("Error", e, this);
        }
        catch(EmptySpaceExcep e){
            e.infoError("Error", e, this);
        }
        catch (Exception e) {
        }
        
       
    }//GEN-LAST:event_btnFinalizarFacturActionPerformed

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
        // TODO add your handling code here:
        /*if (evt.getClickCount() == 2) {
            Producto p = this.model.getListProductos().get(tableProductos.getSelectedRow());
            controller.addProdFactura(p);
            tableProductosFac.setModel(new ProductoTableModel(this.model.getProductosFactura()));
        }*/
    }//GEN-LAST:event_tableProductosMouseClicked

    private void tableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClientesMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            controller.setCurrenteCliente(this.tableClientes.getSelectedRow());
        }
    }//GEN-LAST:event_tableClientesMouseClicked

    private void rdbtnEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnEfectivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProduc;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnFinalizarFactur;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblImpuesto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rdbtnEfectivo;
    private javax.swing.JRadioButton rdbtnTarjeta;
    private javax.swing.JTable tableClientes;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTable tableProductosFac;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables

    
}
