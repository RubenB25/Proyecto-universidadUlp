
package universidadejemplo.Vistas;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Materia;


public class GestionMaterias extends javax.swing.JInternalFrame {
boolean contieneNumero = false;
    
    public GestionMaterias() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        JTaño = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jChBEstado = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLfirma = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setTitle("Gestion de Materias");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setNormalBounds(new java.awt.Rectangle(0, 0, 81, 0));
        setPreferredSize(new java.awt.Dimension(499, 531));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 477));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 477));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBnuevo.setText("Nueva materia");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 30));

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, 30));

        jBguardar.setText("Guardar cambios");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, 30));

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 60, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Activo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Año:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Codigo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTcodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTcodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcodigoKeyTyped(evt);
            }
        });
        jPanel1.add(jTcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 104, -1));

        JTaño.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTañoKeyTyped(evt);
            }
        });
        jPanel1.add(JTaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 60, 30));

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, 30));

        jChBEstado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jChBEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(502, 114));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        jTnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });
        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTnombreKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });
        jPanel1.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 245, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLfirma.setForeground(new java.awt.Color(255, 153, 0));
        jLfirma.setText("Elaborado por el grupo 83");
        jPanel1.add(jLfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

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

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
         if(!validarString()){
        boolean estado=false; 
         
        if (validaDatos()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos solicitados");
        } else {
            if(jChBEstado.isSelected()){
               estado = true;
            }
            Materia mat = new Materia(Integer.valueOf(jTcodigo.getText()), jTnombre.getText(), Integer.valueOf(JTaño.getText()) , estado);
            MateriaData matData = new MateriaData();
            matData.ModificaMateria(mat);
            limpiar();
        }
         
         }else JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        
    
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
        RegistroAlumnosUlp.ventanaAbiertaG = false;
    }//GEN-LAST:event_jBsalirActionPerformed


    
    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        
        if (jTcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de materia");
        } else {
            int codigo = Integer.parseInt(jTcodigo.getText());
            MateriaData matData = new MateriaData();
            matData.buscarMateria(codigo);
            Materia mat = matData.buscarMateria(codigo);
            jTnombre.setText(mat.getNombre());
            JTaño.setText(mat.getAnio()+"");
            jChBEstado.setSelected(mat.isEstado());
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigoKeyPressed
    }//GEN-LAST:event_jTcodigoKeyPressed

    private void jTcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigoKeyTyped
        validaNumero(evt);
    }//GEN-LAST:event_jTcodigoKeyTyped

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
            
        if(!validarString()){
        if (validaDatos()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos solicitados");
        } else {
            
            Materia mat = new Materia(jTnombre.getText(), Integer.valueOf(JTaño.getText()) , true);
            MateriaData matData = new MateriaData();
            matData.nuevaMateria(mat);
            limpiar();
            }
        }else JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jBnuevoActionPerformed
    //boton Eliminar
    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if (jTcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de materia");
        } else {
            int codigo = Integer.parseInt(jTcodigo.getText());
            MateriaData matData = new MateriaData();
            matData.EliminaMateria(codigo);
            limpiar();
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void JTañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTañoKeyTyped
        validaNumero(evt);
    }//GEN-LAST:event_JTañoKeyTyped

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        //        validaNombre(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTnombreKeyReleased

    private void jTnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyPressed

    }//GEN-LAST:event_jTnombreKeyPressed

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

        
    public void validaNumero(java.awt.event.KeyEvent evt) {
        final char tecla = evt.getKeyChar();
        if (Character.isDigit(tecla) 
                || tecla == KeyEvent.VK_BACKSPACE
                || tecla == KeyEvent.VK_DELETE) {
        } else {
            evt.consume();     
        }
    }
    
    public void validaNombre(java.awt.event.KeyEvent evt) {
        Character tecla = evt.getKeyChar();
        if (Character.isLetter(tecla) 
                || tecla == KeyEvent.VK_SPACE
                || tecla == KeyEvent.VK_DELETE
                || tecla == KeyEvent.VK_BACKSPACE
                || tecla == KeyEvent.VK_MINUS){
           
        } else {
            evt.consume();
        }

        //elimina primer caracter si no es una letra
        String texto = jTnombre.getText();
        
        if (texto.length() > 0) {
            if (!Character.isLetter(texto.charAt(0))) {
                texto = texto.length() > 1 ? texto.substring(1) : "";
            }
        }

        // reemplaza guiones duplicados por un guion
        texto = texto.replaceAll("[-]+", "-");
        // reemplaza espacios duplicados por un espacio
        texto = texto.replaceAll("[ ]+", " ");

        jTnombre.setText(texto);

        if (jTnombre.getText().length() > 100) {
            evt.consume(); 
            
        }
    }

    public boolean validaDatos(){
        
        if (jTnombre.getText().isEmpty() || JTaño.getText().isEmpty()) {
            
           return true;
        } else {
            return false;
        }
    }
    public void limpiar(){
        jTnombre.setText("");
        JTaño.setText("");
        jTcodigo.setText("");
        jChBEstado.setSelected(false);
    }
    public boolean validarString(){
         String input = jTnombre.getText();
        if (!input.isEmpty()) {
            for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                contieneNumero = true;
                break;
            }else contieneNumero= false;    
        }
            
        }
        return contieneNumero;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTaño;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JCheckBox jChBEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLfirma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
