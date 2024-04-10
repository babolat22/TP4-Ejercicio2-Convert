package tp4;

import java.awt.Image;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * @author juanj
 */
public class CargaView extends javax.swing.JFrame {

    /**
     * Creates new form CargaView
     */
    public CargaView() {
        initComponents();
        btnConvertir.setIcon(ponerIcono("/Iconos/actualizar.png", btnConvertir));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dkpPrincipal = new javax.swing.JDesktopPane();
        pnlControles = new javax.swing.JPanel();
        txtCaja = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblInstruc = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio 2 - De Celcius a Farenheit");
        setResizable(false);

        txtCaja.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        txtCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCajaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Cascadia Mono", 1, 22)); // NOI18N
        lblTitulo.setText("Conversor de Temperatura");
        lblTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblInstruc.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lblInstruc.setText("Ingrese temperatura en grados Celsius");

        btnConvertir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlesLayout = new javax.swing.GroupLayout(pnlControles);
        pnlControles.setLayout(pnlControlesLayout);
        pnlControlesLayout.setHorizontalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlesLayout.createSequentialGroup()
                .addGroup(pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlControlesLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblInstruc))
                    .addGroup(pnlControlesLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlControlesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlControlesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        pnlControlesLayout.setVerticalGroup(
            pnlControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblInstruc)
                .addGap(18, 18, 18)
                .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        dkpPrincipal.setLayer(pnlControles, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpPrincipalLayout = new javax.swing.GroupLayout(dkpPrincipal);
        dkpPrincipal.setLayout(dkpPrincipalLayout);
        dkpPrincipalLayout.setHorizontalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkpPrincipalLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(pnlControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        dkpPrincipalLayout.setVerticalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpPrincipalLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(pnlControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dkpPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dkpPrincipal)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public Icon ponerIcono(String url, JButton boton){
        ImageIcon ico = new ImageIcon(getClass().getResource(url));
       int ancho = boton.getWidth()-150; // le daremos menos de la mitad del ancho
       int alto = boton.getHeight()-15;
        ImageIcon icono = new ImageIcon(ico.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        
        return icono;
    }
    
    
    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        if (!txtCaja.getText().isEmpty()) {
            double celsius=Double.parseDouble(txtCaja.getText());
            double farenheit= celsius* 9/5 + 32;
            JOptionPane.showMessageDialog(this, "La temperatura en grados farenheit es: "+farenheit);
        }else JOptionPane.showMessageDialog(this, "Debe rellenar el campo primero!!");
 
               
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void txtCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCajaActionPerformed
        // TODO add your handling code here:
        txtCaja.setText(null);
    }//GEN-LAST:event_txtCajaActionPerformed

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
            java.util.logging.Logger.getLogger(CargaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertir;
    private javax.swing.JDesktopPane dkpPrincipal;
    private javax.swing.JLabel lblInstruc;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlControles;
    private javax.swing.JTextField txtCaja;
    // End of variables declaration//GEN-END:variables
}
