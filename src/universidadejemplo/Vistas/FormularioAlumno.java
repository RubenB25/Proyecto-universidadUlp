package universidadejemplo.Vistas;

import java.awt.Dimension;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author Gabriel
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {

    private Object jDescritorio;

    public FormularioAlumno() {
        initComponents();
        setSize(500,477);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFdocumento = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRActivoSi = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jDCfechaNacimiento = new com.toedter.calendar.JDateChooser();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jTFapellido = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jRActivoNo = new javax.swing.JRadioButton();
        jLFecha = new javax.swing.JLabel();
        jLimagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLfirma = new javax.swing.JLabel();

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Alumno");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 477));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Documento");

        jTFdocumento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jBBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Activo");

        jRActivoSi.setBackground(new java.awt.Color(204, 204, 204));
        bGEstado.add(jRActivoSi);
        jRActivoSi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRActivoSi.setSelected(true);
        jRActivoSi.setText("Si");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento");

        jDCfechaNacimiento.setDateFormatString("dd, MMM, yyyy");
        jDCfechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCfechaNacimientoPropertyChange(evt);
            }
        });

        jBnuevo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBnuevo.setText("Nuevo");

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

        jTFapellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jTFnombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        bGEstado.add(jRActivoNo);
        jRActivoNo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRActivoNo.setText("No");

        jLFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLFecha.setText("Fecha:");

        jLimagen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FooterUlpVirtualM.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Mostrar Informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLfirma.setForeground(new java.awt.Color(255, 153, 0));
        jLfirma.setText("Elaborado por el grupo 83");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFecha)))
                    .addComponent(jBnuevo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBeliminar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBguardar)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jRActivoSi)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jRActivoNo))
                                            .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jBsalir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(29, 29, 29))
            .addComponent(jLimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jBBuscar)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addGap(41, 41, 41)
                .addComponent(jLfirma)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRActivoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jRActivoNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jDCfechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDCfechaNacimientoPropertyChange
        if (jDCfechaNacimiento.getDate() != null) {

            LocalDate fechaN = jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            jLFecha.setText("Fecha: " + fechaN.format(dtf));
        }
    }//GEN-LAST:event_jDCfechaNacimientoPropertyChange

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        AlumnoData alumnoData = new AlumnoData();
        try {
            int dni = Integer.parseInt(jTFdocumento.getText());
            Alumno alumnoObtenido = alumnoData.buscarAlumnoPorDni(dni);
        //FAlumno ab = new FAlumno(alumnoObtenido);
       alumnoObtenido.setDni(dni);
       
        //ab.setVisible(true);
  
       // this.dispose();
       
           if (!"".equals(jTFdocumento.getText()) && alumnoObtenido != null) {
                jTFapellido.setText(alumnoObtenido.getApellido());
                jTFnombre.setText(alumnoObtenido.getNombre());
                if (alumnoObtenido.isEstado() == true) {
                    jRActivoSi.setSelected(true);
                    jRActivoNo.setEnabled(false);
                }
               //jDCfechaNacimiento.setDate(Date.valueOf(alumnoObtenido.getFechaNacimiento());
                jDCfechaNacimiento.setEnabled(false);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un documento valido.");
        }
        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        AlumnoData alumnoData = new AlumnoData();
        if (!"".equals(jTFdocumento.getText()) && !"".equals(jTFnombre.getText()) && !"".equals(jTFapellido.getText()) && jDCfechaNacimiento.getDate() != null) {

            try {
                int dni = Integer.parseInt(jTFdocumento.getText());
                if (jRActivoSi.isSelected()) {
                    Alumno alumnoNuevo = new Alumno(dni, jTFapellido.getText(), jTFnombre.getText(), jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), true);
                    alumnoData.guardarAlumno(alumnoNuevo);
                }
                if (jRActivoNo.isSelected()) {
                    Alumno alumnoNuevo = new Alumno(dni, jTFapellido.getText(), jTFnombre.getText(), jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), false);
                    alumnoData.guardarAlumno(alumnoNuevo);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos invalidos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        AlumnoData alumnoData = new AlumnoData();
        try {
            Alumno alumnoAEliminar = alumnoData.buscarAlumnoPorDni(Integer.parseInt(jTFdocumento.getText()));

            int idAlumno = alumnoAEliminar.getIdAlumno();

            int opcion = JOptionPane.showConfirmDialog(null, "Se dara de baja el alumno seleccionado", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                alumnoData.eliminarAlumno(idAlumno);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento y buscar el alumno para eliminar.");
        }

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGEstado;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDCfechaNacimiento;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLfirma;
    private javax.swing.JLabel jLimagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRActivoNo;
    private javax.swing.JRadioButton jRActivoSi;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFdocumento;
    private javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables
}
