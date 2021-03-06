/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author totit
 */
public class AgregarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarProducto
     */
    ConexionSQL cc = new ConexionSQL();
    Connection con =cc.conexion();
    private javax.swing.JMenuBar men;
    
    public AgregarProducto() {
        initComponents();
    }
    
    //Constructor que permite mostrar el menu//
    public AgregarProducto(javax.swing.JMenuBar menu) {
        initComponents();
        men = menu;
        
    }
    public void Limpiar(){
        
        txtCodigo.setText("");
        txtNombre.setText("");
        txtElaboracion.setText("");
        txtVencimiento.setText("");
        txtUnitario.setText("");
        txtMarca.setText("");
        jTextAreaDescripcion.setText("");
        
    }
    public void AgregarDatos(){
    
        try {
            String SQL="insert into Producto (codigoProd, nombre, fecha_elab, fecha_ven, precio_unitario, marca, descripcion) values (?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(SQL);
            
           pst.setInt(1, Integer.parseInt(txtCodigo.getText()));
            pst.setString(2, txtNombre.getText());
             pst.setString(3, txtElaboracion.getText());
              pst.setString(4, txtVencimiento.getText());
               pst.setInt(5, Integer.parseInt(txtUnitario.getText()));
                pst.setString(6, txtMarca.getText());
                 pst.setString(7, jTextAreaDescripcion.getText());
                 
                 pst.execute();
                 
                 JOptionPane.showMessageDialog(null, "Producto agregado correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar producto "+e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtElaboracion = new javax.swing.JTextField();
        txtVencimiento = new javax.swing.JTextField();
        txtUnitario = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 0));
        setTitle("Agregar Producto");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Descripci??n:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel2.setText("Nombre producto:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        jLabel3.setText("Fecha elaboraci??n:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        jLabel4.setText("Fecha vencimiento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 110, -1));

        jLabel5.setText("Precio unitario:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        jLabel6.setText("Marca:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 60, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 273, -1));
        getContentPane().add(txtElaboracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 273, -1));
        getContentPane().add(txtVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 273, -1));
        getContentPane().add(txtUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 273, -1));
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 273, -1));

        BtnGuardar.setBackground(new java.awt.Color(153, 255, 153));
        BtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.setToolTipText("");
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 270, 126));

        BtnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 210, 41));

        jLabel8.setText("C??digo producto:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 93, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Ej: 11/11/20");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 90, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Ej: 11/11/21");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 100, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("$");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 10, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel11.setText("0.01");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 450, 60, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("*Verifique que los datos esten correctos.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 280, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Ej: 100");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 65, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Ej: 1090");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 53, -1));

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        men.show();
        
    }//GEN-LAST:event_BtnCancelarActionPerformed

        
        
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
        
        if(txtCodigo.getText().equals("") || 
           txtNombre.getText().equals("") ||
           txtElaboracion.getText().equals("") ||
           txtUnitario.getText().equals("") ||
           txtMarca.getText().equals("") ||
           jTextAreaDescripcion.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos a excepcion de fecha de vencimiento en el caso de que no se requiera.");
        } else {
        
            
        AgregarDatos();
        Limpiar();
    }//GEN-LAST:event_BtnGuardarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtElaboracion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUnitario;
    private javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}
