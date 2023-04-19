/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.isil.conversormonedas.vista;

import javax.swing.JOptionPane;
import pe.isil.conversormonedas.controlador.Conversor;

/**
 *
 * @author 51992
 */
public class OpcionesMoneda extends javax.swing.JFrame {

    /**
     * Creates new form OpcionesMoneda
     */
    
    int valor;

    public OpcionesMoneda(int valor) {
        this.valor = valor;
         initComponents();
        cmbOpcionesMoneda.addItem("De Soles a Dólar");
        cmbOpcionesMoneda.addItem("De Soles a Euro");
        cmbOpcionesMoneda.addItem("De Soles a Libras");
        cmbOpcionesMoneda.addItem("De Soles a Yen");
        cmbOpcionesMoneda.addItem("De Soles a Won Coreano");
        cmbOpcionesMoneda.addItem("De Dólar a Soles");
        cmbOpcionesMoneda.addItem("De Euro a Soles");
        cmbOpcionesMoneda.addItem("De Libras a Soles");
        cmbOpcionesMoneda.addItem("De Yen a Soles");
        cmbOpcionesMoneda.addItem("De Won Coreano a Soles");
    }
    
    public OpcionesMoneda() {
        initComponents();
        cmbOpcionesMoneda.addItem("De Soles a Dólar");
        cmbOpcionesMoneda.addItem("De Soles a Euro");
        cmbOpcionesMoneda.addItem("De Soles a Libras");
        cmbOpcionesMoneda.addItem("De Soles a Yen");
        cmbOpcionesMoneda.addItem("De Soles a Won Coreano");
        cmbOpcionesMoneda.addItem("De Dólar a Soles");
        cmbOpcionesMoneda.addItem("De Euro a Soles");
        cmbOpcionesMoneda.addItem("De Libras a Soles");
        cmbOpcionesMoneda.addItem("De Yen a Soles");
        cmbOpcionesMoneda.addItem("De Won Coreano a Soles");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbOpcionesMoneda = new javax.swing.JComboBox<>();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbOpcionesMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOpcionesMonedaActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbOpcionesMoneda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(cmbOpcionesMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOpcionesMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOpcionesMonedaActionPerformed
         
         

    }//GEN-LAST:event_cmbOpcionesMonedaActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
            Conversor conversor = new Conversor(this.valor);
            String opcionMoneda = (String)cmbOpcionesMoneda.getSelectedItem();
            double resultado = 0;
            String moneda = "";
            String simbolo = "";

        if(opcionMoneda.equals("De Soles a Dólar")){
            resultado = conversor.SolADolar();
            moneda = "dolares";
            simbolo = "$";
         }
        if(opcionMoneda.equals("De Soles a Euro")){
            resultado = conversor.SolAEuro();
            moneda = "euros";
            simbolo = "€";
         }
        if(opcionMoneda.equals("De Soles a Libras")){
            resultado = conversor.SolALibra();
            moneda = "libras";
            simbolo = "£";
         }
        if(opcionMoneda.equals("De Soles a Yen")){
            resultado = conversor.SolAYen();
            moneda = "yenes";
            simbolo = "¥";
         }
        if(opcionMoneda.equals("De Soles a Won Coreano")){
            resultado = conversor.SolAWon();
            moneda = "wones";
            simbolo = "₩";
         }
        if(opcionMoneda.equals("De Dólar a Soles")){
            resultado = conversor.DolarASol();
            moneda = "soles";
            simbolo = "S/.";
         }
        if(opcionMoneda.equals("De Euro a Soles")){
            resultado = conversor.EuroASol();
            moneda = "soles";
            simbolo = "S/.";
         }
        if(opcionMoneda.equals("De Libras a Soles")){
            resultado = conversor.LibraASol();
            moneda = "soles";
            simbolo = "S/.";
         }
        if(opcionMoneda.equals("De Yen a Soles")){
            resultado = conversor.YenASol();
            moneda = "soles";
            simbolo = "S/.";
         }
        if(opcionMoneda.equals("De Won Coreano a Soles")){
            resultado = conversor.WonASol();
            moneda = "soles";
            simbolo = "S/.";
         }
        JOptionPane.showMessageDialog(null, "Tienes : " + simbolo +  resultado + " "+ moneda +"!");

    }//GEN-LAST:event_btnOKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpcionesMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesMoneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesMoneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<String> cmbOpcionesMoneda;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
