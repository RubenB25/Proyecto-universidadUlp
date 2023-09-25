
package universidadejemplo.Vistas;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Materia;


public class GestionMaterias extends javax.swing.JInternalFrame {

    public GestionMaterias() {
        initComponents();
    
     
        setSize(508,537);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jTcodigo = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        JTaño = new javax.swing.JTextField();
        jBnuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRestado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Materias");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Nombre:");

        jLabel1.setText("Estado:");

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jTcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTcodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcodigoKeyTyped(evt);
            }
        });

        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        JTaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTañoKeyTyped(evt);
            }
        });

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jLabel2.setText("Año:");

        jLabel4.setText("Codigo:");

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FooterUlpVirtualM-transformed.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(499, 531));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jRestado))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTaño, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jBbuscar))
                                                .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(175, 175, 175))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jBnuevo)
                        .addGap(33, 33, 33)
                        .addComponent(jBeliminar)
                        .addGap(46, 46, 46)
                        .addComponent(jBguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(914, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
         if (validaDatos()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos solicitados");
        } else {
            
            Materia mat = new Materia(Integer.valueOf(jTcodigo.getText()), jTnombre.getText(), Integer.valueOf(JTaño.getText()) , true);
            //Materia mat = new Materia(1, jTnombre.getText(), Integer.valueOf(JTaño.getText()) , true);
             //System.out.println(mat.getIdMateria() + "" + " " + mat.getNombre() + " " 
             //        + mat.getIdAnioMateria() + " " + mat.isEstado());
             
            MateriaData matData = new MateriaData();
            matData.ModificaMateria(mat);
        }      
        
    
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
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
            JTaño.setText(mat.getIdAnioMateria()+"");
            jRestado.setText((mat.isEstado())+"");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTcodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigoKeyPressed
    }//GEN-LAST:event_jTcodigoKeyPressed

    private void jTnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyPressed
    }//GEN-LAST:event_jTnombreKeyPressed

    private void jTcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcodigoKeyTyped
        validaNumero(evt);
    }//GEN-LAST:event_jTcodigoKeyTyped

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        validaNombre(evt);
    }//GEN-LAST:event_jTnombreKeyTyped

    private void JTañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTañoKeyTyped
        validaNumero(evt);
    }//GEN-LAST:event_JTañoKeyTyped

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
            
        if (validaDatos()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos solicitados");
        } else {
            
            Materia mat = new Materia(jTnombre.getText(), Integer.valueOf(JTaño.getText()) , true);
            MateriaData matData = new MateriaData();
            matData.nuevaMateria(mat);
        }
    }//GEN-LAST:event_jBnuevoActionPerformed
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
