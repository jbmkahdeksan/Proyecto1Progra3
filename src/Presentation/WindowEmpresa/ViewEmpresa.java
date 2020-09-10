/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation.WindowEmpresa;


import java.util.*;
import javax.swing.JTextField;
import logic.Empresa;

/**
 *
 * @author Porras
 */
public class ViewEmpresa extends javax.swing.JFrame implements Observer{

    /**
     * Creates new form ViewEmpresa
     */
    ControllerEmpresa control;
    ModelEmpresa model;
    
 

    public ViewEmpresa() {
        initComponents();
    }
    
    public void update(Observable updatedmOdel, Object param){
        //no hay nada que actualizar porque la pantalla
        //sera solo para entrada de datos de la empresa
    }
    
    void setModel(ModelEmpresa model) {
        this.model = model; 
        model.addObserver(this);
    }

    void setController(ControllerEmpresa control) {
       this.control = control;
       this.InsertData.addActionListener(control);
       
    }
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtNomEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCedJurid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDirPagWeb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        InsertData = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre de la empresa");

        txtNomEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomEmpresaActionPerformed(evt);
            }
        });

        jLabel2.setText("Cedula Juridica");

        txtCedJurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedJuridActionPerformed(evt);
            }
        });

        jLabel3.setText("Direccion del Local");

        jLabel4.setText("Numero de Tel");

        jLabel5.setText("Dir. Pagina web");

        jLabel6.setText("Inserte los datos de la empresa");

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        InsertData.setText("Insertar datos");
        InsertData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnExit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InsertData))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNumTel)
                                .addComponent(txtDireccion)
                                .addComponent(txtCedJurid)
                                .addComponent(txtNomEmpresa)
                                .addComponent(txtDirPagWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCedJurid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNumTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtDirPagWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(InsertData))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomEmpresaActionPerformed

    private void txtCedJuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedJuridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedJuridActionPerformed

    private void InsertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertDataActionPerformed
        if (txtNomEmpresa.getText().isEmpty() || txtDireccion.getText().isEmpty() ||  txtCedJurid.getText().isEmpty()
                || txtDirPagWeb.getText().isEmpty() || txtNumTel.getText().isEmpty()) {
            return;
        }
        String nomEmp = txtNomEmpresa.getText();
        String dirEmp = txtDireccion.getText();
        String ID = txtCedJurid.getText();
        String pagweb = txtDirPagWeb.getText();
        int tel = Integer.parseInt(txtNumTel.getText());
        Empresa empresa = new Empresa(nomEmp,dirEmp,tel,ID,pagweb);
        this.control.addEmpresa(empresa);
        txtNomEmpresa.setText(" ");
        txtDireccion.setText(" ");
        txtCedJurid.setText(" ");
        txtDirPagWeb.setText(" ");
        txtNumTel.setText(" ");
        
    }//GEN-LAST:event_InsertDataActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    
    public JTextField getTxtCedJurid() {
        return txtCedJurid;
    }

    public JTextField getTxtDirPagWeb() {
        return txtDirPagWeb;
    }

    public JTextField getTxtDireccion() {
        return txtDireccion;
    }

    public JTextField getTxtNomEmpresa() {
        return txtNomEmpresa;
    }

    public JTextField getTxtNumTel() {
        return txtNumTel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertData;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCedJurid;
    private javax.swing.JTextField txtDirPagWeb;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNomEmpresa;
    private javax.swing.JTextField txtNumTel;
    // End of variables declaration//GEN-END:variables

    
}
