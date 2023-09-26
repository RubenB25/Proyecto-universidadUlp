
package universidadejemplo.Vistas;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Materia;

public class GestionMaterias extends javax.swing.JInternalFrame {

    public GestionMaterias() {
        initComponents();
        setTitle("Gestion de Materias");
        setSize(500, 477);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTcodigo = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        JTaño = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jRestado = new javax.swing.JRadioButton();
        jLfirma = new javax.swing.JLabel();
        jLimagen = new javax.swing.JLabel();

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Materias");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 477));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 477));

        jBnuevo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBeliminar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBguardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Estado:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Año:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Codigo:");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        jTcodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTcodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcodigoKeyTyped(evt);
            }
        });

        jTnombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });

        JTaño.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JTaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTañoKeyTyped(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jRestado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLfirma.setForeground(new java.awt.Color(255, 153, 0));
        jLfirma.setText("Elaborado por el grupo 83");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTaño, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRestado)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTnombre)
                                            .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addComponent(jBbuscar)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jBnuevo)
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBeliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBguardar)
                                .addGap(43, 43, 43)
                                .addComponent(jBsalir)))))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRestado)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLfirma)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(57, 57, 57))
        );

        jLimagen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FooterUlpVirtualM.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addComponent(jLimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        if (jTcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de materia");
        } else {
            int codigo = Integer.parseInt(jTcodigo.getText());
            MateriaData matData = new MateriaData();
            matData.buscarMateria(codigo);
            Materia mat = matData.buscarMateria(codigo);
            jTnombre.setText(mat.getNombre());
            JTaño.setText(mat.getIdAnioMateria()+"");
            jRestado.setText((mat.isEstado())+"");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void JTañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTañoKeyTyped
        validaNumero(evt);
    }//GEN-LAST:event_JTañoKeyTyped

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        validaNombre(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyPressed

    }//GEN-LAST:event_jTnombreKeyPressed

    private void jTcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigoKeyTyped
        validaNumero(evt);
    }//GEN-LAST:event_jTcodigoKeyTyped

    private void jTcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigoKeyPressed

    }//GEN-LAST:event_jTcodigoKeyPressed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        if (validaDatos()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos solicitados");
        } else {

            Materia mat = new Materia(Integer.valueOf(jTcodigo.getText()),
                jTnombre.getText(), Integer.valueOf(JTaño.getText()) , true);

            MateriaData matData = new MateriaData();
            matData.ModificaMateria(mat);
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    //boton Eliminar
    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if (jTcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de materia");
        } else {
            int codigo = Integer.parseInt(jTcodigo.getText());
            MateriaData matData = new MateriaData();
            matData.EliminaMateria(codigo);
            Materia mat = matData.buscarMateria(codigo);
            jTnombre.setText(mat.getNombre());
            JTaño.setText(mat.getIdAnioMateria()+"");
            jRestado.setText((mat.isEstado())+"");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed

        if (validaDatos()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos solicitados");
        } else {

            Materia mat = new Materia(jTnombre.getText(), Integer.valueOf(JTaño.getText()) , true);
            MateriaData matData = new MateriaData();
            matData.nuevaMateria(mat);
        }
    }//GEN-LAST:event_jBnuevoActionPerformed

    
        
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
            evt.setKeyChar(Character.toUpperCase(tecla));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTaño;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLfirma;
    private javax.swing.JLabel jLimagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
