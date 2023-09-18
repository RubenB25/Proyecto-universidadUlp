package universidadejemplo.Vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;

/**
 *
 * @author Gabriel
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {

    private Alumno alumno;
    private int dni;
    public FormularioAlumno() {
        initComponents();
        alumno = new Alumno();

    }

    public boolean verificarCampos() {
        ButtonModel bm = bGEstado.getSelection();
        try {  
            dni = Integer.parseInt(jTFdocumento.getText());
            if ((!"".equals(jTFapellido.getText()) && !"".equals(jTFnombre.getText()))
                    && bGEstado.isSelected(bm) && jDCfechaNacimiento.getDate() != null) { //(jRActivoNo.isSelected() || jRActivoSi.isSelected())
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un documento valido");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public void limpiarCampos() {
        jTFdocumento.setText("");
        jTFapellido.setText("");
        jTFnombre.setText("");
        bGEstado.clearSelection();
        jDCfechaNacimiento.setDate(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFdocumento = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRActivoSi = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jDCfechaNacimiento = new com.toedter.calendar.JDateChooser();
        jBeditar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jTFapellido = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jRActivoNo = new javax.swing.JRadioButton();
        jLFecha = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setText("Documento");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Activo");

        jRActivoSi.setBackground(new java.awt.Color(0, 153, 102));
        bGEstado.add(jRActivoSi);
        jRActivoSi.setText("Si");

        jLabel6.setText("Fecha de nacimiento");

        jDCfechaNacimiento.setDateFormatString("dd, MMM, yyyy");
        jDCfechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCfechaNacimientoPropertyChange(evt);
            }
        });

        jBeditar.setText("Guardar Cambios");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });

        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jBnuevo.setText("Nuevo Alumno");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jRActivoNo.setBackground(new java.awt.Color(0, 153, 102));
        bGEstado.add(jRActivoNo);
        jRActivoNo.setText("No");

        jLFecha.setText("Fecha:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jBeliminar)
                                .addGap(18, 18, 18)
                                .addComponent(jBeditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jBsalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRActivoSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRActivoNo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTFnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(jTFapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTFdocumento, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBBuscar))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLFecha)
                            .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTFdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jTFapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRActivoSi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRActivoNo)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDCfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBeditar)
                    .addComponent(jBeliminar)
                    .addComponent(jBnuevo)
                    .addComponent(jBsalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            alumno = alumnoData.buscarAlumnoPorDni(dni);
            if (!"".equals(jTFdocumento.getText()) && alumno != null) {
                jTFapellido.setText(alumno.getApellido());
                jTFnombre.setText(alumno.getNombre());
                if (alumno.isEstado() == true) {
                    jRActivoSi.setSelected(true);
                }
                jDCfechaNacimiento.setDate(Date.valueOf(alumno.getFechaNacimiento()));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un documento valido.");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
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

                limpiarCampos();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos invalidos.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos.");
        }
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        AlumnoData alumnoData = new AlumnoData();
        try {
            Alumno alumnoAEliminar = alumnoData.buscarAlumnoPorDni(Integer.parseInt(jTFdocumento.getText()));

            int idAlumno = alumnoAEliminar.getIdAlumno();

            int opcion = JOptionPane.showConfirmDialog(null, "Se dara de baja el alumno seleccionado", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                alumnoData.eliminarAlumno(idAlumno);
            }

            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un documento y buscar el alumno para eliminar.");
        }

    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        AlumnoData alumnoData = new AlumnoData();

        if (verificarCampos()) {
            
            alumno.setDni(Integer.parseInt(jTFdocumento.getText()));
            alumno.setApellido(jTFapellido.getText());
            alumno.setNombre(jTFnombre.getText());
            if (jRActivoSi.isSelected()) {
                alumno.setEstado(true);
            } else {
                alumno.setEstado(false);
            }
            alumno.setFechaNacimiento(jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            alumnoData.modificarAlumno(alumno);

            limpiarCampos();
        }

    }//GEN-LAST:event_jBeditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGEstado;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBeditar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDCfechaNacimiento;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRActivoNo;
    private javax.swing.JRadioButton jRActivoSi;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFdocumento;
    private javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables
}
