/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Conexion.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henry marcelo
 */
public class categoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form categoria
     */
    public categoria() {
        initComponents();
    }
    void listacat(){
                 DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");      
       listacat.setModel(modelo);
       String []datos = new String[2];
      
       try{
       Statement st=cn.createStatement();
       ResultSet rs=st.executeQuery("SELECT * FROM categoria");
       while(rs.next()){
           datos[0]=rs.getString(1);
           datos[1]=rs.getString(2);
           modelo.addRow(datos);
           listacat.setModel(modelo);
       }
       }catch(SQLException e){
           Logger.getLogger(autor.class.getName()).log(Level.SEVERE,null, e);
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codcat = new javax.swing.JTextField();
        nomcat = new javax.swing.JTextField();
        agregarcat = new javax.swing.JButton();
        modificarcat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listacat = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Eliminar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Categoria");

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        agregarcat.setText("Agregar");
        agregarcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarcatActionPerformed(evt);
            }
        });

        modificarcat.setText("Modificar");
        modificarcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarcatActionPerformed(evt);
            }
        });

        listacat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        listacat.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(listacat);

        jButton1.setText("Lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomcat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codcat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificarcat)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(agregarcat))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarcat)
                    .addComponent(modificarcat)
                    .addComponent(jButton1))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarcatActionPerformed
        // TODO add your handling code here:
              try{
            PreparedStatement pst = cn.prepareStatement("INSERT INTO categoria (cod_cat,nombre) VALUES (?,?)");
            
            pst.setInt(1,(Integer.parseInt(codcat.getText())));
            pst.setString(2, nomcat.getText()); 
            pst.executeUpdate();
         
        JOptionPane.showMessageDialog(null,"La categoria fue agregada");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
        
    }//GEN-LAST:event_agregarcatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listacat();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
            int fila=listacat.getSelectedRow();
        if (fila>=0){
            codcat.setText(listacat.getValueAt(fila, 0).toString());
            nomcat.setText(listacat.getValueAt(fila, 1).toString());
        }else{
            
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void modificarcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarcatActionPerformed

           try {
            PreparedStatement pst=cn.prepareStatement("UPDATE categoria set nombre='"+nomcat.getText()+"' WHERE cod_cat='"+codcat.getText()+"'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(autor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modificarcatActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
            int fila = listacat.getSelectedRow();
        String cod=new String();
      
        cod=listacat.getValueAt(fila, 0).toString();
        try {
            PreparedStatement pst=cn.prepareStatement("DELETE FROM categoria WHERE cod_cat='"+cod+"'");
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(autor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarcat;
    private javax.swing.JTextField codcat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listacat;
    private javax.swing.JButton modificarcat;
    private javax.swing.JTextField nomcat;
    // End of variables declaration//GEN-END:variables
Conectar cone=new Conectar();
Connection cn=cone.con;

}
