/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author totit
 */
public class Principal extends javax.swing.JFrame {

    

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
       
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        BarraMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Agregarproducto = new javax.swing.JMenuItem();
        Eliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Verdespacho = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ListaProd = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1151, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        jMenu1.setText("Producto");

        Agregarproducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_MASK));
        Agregarproducto.setText("Agregar producto");
        Agregarproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarproductoMouseClicked(evt);
            }
        });
        Agregarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarproductoActionPerformed(evt);
            }
        });
        jMenu1.add(Agregarproducto);

        Eliminar.setText("Eliminar producto");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jMenu1.add(Eliminar);

        BarraMenu.add(jMenu1);

        jMenu2.setText("Despachos");

        Verdespacho.setText("Ver Despachos");
        Verdespacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdespachoActionPerformed(evt);
            }
        });
        jMenu2.add(Verdespacho);

        jMenuItem6.setText("Ver estados");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        BarraMenu.add(jMenu2);

        jMenu3.setText("Listar");

        ListaProd.setText("Productos");
        ListaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaProdActionPerformed(evt);
            }
        });
        jMenu3.add(ListaProd);

        jMenuItem4.setText("Despachos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem1.setText("Stock");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        BarraMenu.add(jMenu3);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarproductoActionPerformed

        AgregarProducto abrirVentana = new AgregarProducto(BarraMenu);
        escritorio.add(abrirVentana);
        abrirVentana.show();
        BarraMenu.hide();
    }//GEN-LAST:event_AgregarproductoActionPerformed

    private void VerdespachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdespachoActionPerformed
        VerDespacho abrirVentana = new VerDespacho(BarraMenu);
        escritorio.add(abrirVentana);
        abrirVentana.show();
        BarraMenu.hide();
    }//GEN-LAST:event_VerdespachoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        EliminarProd abrirVentana= new EliminarProd(BarraMenu);
        escritorio.add(abrirVentana);
        abrirVentana.show();
        BarraMenu.hide();
                
        
    }//GEN-LAST:event_EliminarActionPerformed

    private void ListaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaProdActionPerformed
        // TODO add your handling code here:
        ListarProductos abrirVentana = new ListarProductos(BarraMenu);
        escritorio.add(abrirVentana);
        abrirVentana.show();
        BarraMenu.hide();
    }//GEN-LAST:event_ListaProdActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        VerEstadosdespacho abrirVentana = new VerEstadosdespacho(BarraMenu);
        escritorio.add(abrirVentana);
        abrirVentana.show();
        BarraMenu.hide();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ListarDespacho abrirVentana = new ListarDespacho(BarraMenu);
        escritorio.add(abrirVentana);
        abrirVentana.show();
        BarraMenu.hide();
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void AgregarproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarproductoMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_AgregarproductoMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VerificarStock abrirVentana = new VerificarStock(BarraMenu);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Agregarproducto;
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem ListaProd;
    private javax.swing.JMenuItem Verdespacho;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}
