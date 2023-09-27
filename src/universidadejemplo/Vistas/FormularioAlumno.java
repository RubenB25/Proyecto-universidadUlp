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
    boolean contieneNumero=false;
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
        jLFecha.setText("");
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
        jBeditar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jTFapellido = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jRActivoNo = new javax.swing.JRadioButton();
        jLFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setTitle("Alumno");
        setPreferredSize(new java.awt.Dimension(499, 531));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jTFdocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTFdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 221, -1));

        jBBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Activo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jRActivoSi.setBackground(new java.awt.Color(204, 204, 204));
        bGEstado.add(jRActivoSi);
        jRActivoSi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRActivoSi.setText("Si");
        jPanel1.add(jRActivoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jDCfechaNacimiento.setDateFormatString("dd, MMM, yyyy");
        jDCfechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDCfechaNacimientoPropertyChange(evt);
            }
        });
        jPanel1.add(jDCfechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 177, -1));

        jBeditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBeditar.setText("Guardar cambios");
        jBeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeditarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, -1, 30));

        jBeliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBeliminar.setText("Dar baja");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, 30));

        jBnuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBnuevo.setText("Nuevo Alumno");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 140, 30));

        jBsalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, 30));

        jTFapellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTFapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 221, -1));

        jTFnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 221, -1));

        jRActivoNo.setBackground(new java.awt.Color(204, 204, 204));
        bGEstado.add(jRActivoNo);
        jRActivoNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRActivoNo.setText("No");
        jPanel1.add(jRActivoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, 30));

        jLFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLFecha.setText("Fecha:");
        jPanel1.add(jLFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

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
                if (alumno.isEstado()) {
                    jRActivoSi.setSelected(true);
                }else jRActivoNo.setSelected(true);
                jDCfechaNacimiento.setDate(Date.valueOf(alumno.getFechaNacimiento()));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un documento valido.");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        if(!validarString()){
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
        }else JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
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
    
     public boolean validarString(){
         
         String inputA= jTFapellido.getText();
         String inputN = jTFnombre.getText()+inputA;
        if (!inputN.isEmpty()) {
            for (char c : inputN.toCharArray()) {
            if (Character.isDigit(c)) {
                contieneNumero = true;
                break;
            }else contieneNumero= false;    
        }
            
        }
        return contieneNumero;
    }
    private void jBeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeditarActionPerformed
        AlumnoData alumnoData = new AlumnoData();
        if(!validarString()){
        if (verificarCampos()) {
            
            alumno.setDni(Integer.parseInt(jTFdocumento.getText()));
            alumno.setApellido(jTFapellido.getText());
            alumno.setNombre(jTFnombre.getText());
            if (jRActivoSi.isSelected()) {
                alumno.setEstado(true);
            } else if (jRActivoNo.isSelected()) {
                alumno.setEstado(false);
            }
            alumno.setFechaNacimiento(jDCfechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

            alumnoData.modificarAlumno(alumno);

            limpiarCampos();
        }}else JOptionPane.showMessageDialog(this, "Verifique los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        
        
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRActivoNo;
    private javax.swing.JRadioButton jRActivoSi;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFdocumento;
    private javax.swing.JTextField jTFnombre;
    // End of variables declaration//GEN-END:variables
}
