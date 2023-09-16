/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Ruben
 */
public class Inscripciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inscripciones
     */
    private DefaultTableModel modelo;
    private String idAlumno;

    public Inscripciones() {

        initComponents();

        modelo = (DefaultTableModel) jTInscriptos.getModel();
        llenarCB();

    }

    public void llenarCB() {
        AlumnoData llenar = new AlumnoData();

        for (Alumno listarAlumno : llenar.listarAlumnos()) {

            jCBInscriptos.addItem(listarAlumno);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInscriptos = new javax.swing.JTable();
        jRBInscriptas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRBNoInscriptas = new javax.swing.JRadioButton();
        jCBInscriptos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBInscribir = new javax.swing.JButton();
        jBAnularInsc = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jTInscriptos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTInscriptos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTInscriptos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTInscriptos);
        if (jTInscriptos.getColumnModel().getColumnCount() > 0) {
            jTInscriptos.getColumnModel().getColumn(0).setResizable(false);
            jTInscriptos.getColumnModel().getColumn(1).setResizable(false);
            jTInscriptos.getColumnModel().getColumn(2).setResizable(false);
        }

        jRBInscriptas.setBackground(new java.awt.Color(0, 153, 102));
        buttonGroup1.add(jRBInscriptas);
        jRBInscriptas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRBInscriptas.setText("Materias inscriptas");
        jRBInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInscriptasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        jRBNoInscriptas.setBackground(new java.awt.Color(0, 153, 102));
        buttonGroup1.add(jRBNoInscriptas);
        jRBNoInscriptas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jRBNoInscriptas.setText("Materias no inscriptas");
        jRBNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNoInscriptasActionPerformed(evt);
            }
        });

        jCBInscriptos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCBInscriptos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBInscriptosItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Formulario de Inscripción");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        jBInscribir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnularInsc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBAnularInsc.setText("Anular inscripción");
        jBAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 102, 102));
        jBSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBInscriptos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRBInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRBNoInscriptas))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBInscribir)
                                .addGap(54, 54, 54)
                                .addComponent(jBAnularInsc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBInscriptos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBInscriptas)
                    .addComponent(jRBNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInsc)
                    .addComponent(jBInscribir)
                    .addComponent(jBSalir))
                .addGap(19, 19, 19))
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

    private void jRBInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInscriptasActionPerformed
        // TODO add your handling code here:

        limpiar();
        listar();

    }//GEN-LAST:event_jRBInscriptasActionPerformed

    private void jRBNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNoInscriptasActionPerformed
        // TODO add your handling code here:
        listarNo();


    }//GEN-LAST:event_jRBNoInscriptasActionPerformed

    private void jCBInscriptosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBInscriptosItemStateChanged
        // TODO add your handling code here:

        limpiar();
        if (jRBInscriptas.isSelected()) {
            listar();
        } else if (jRBNoInscriptas.isSelected()) {
            listarNo();
        }

    }//GEN-LAST:event_jCBInscriptosItemStateChanged

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        //  TODO add your handling code here:
        //  Si hay una fila seleccionada se ejecuta el código, caso contrario si es -1(no seleccionada)
        //  Se emite un mensaje de ERROR
        if (jTInscriptos.getSelectedRow() != -1) {
            //  Obteniendo datos del alumno seleccionado en el JCOMBOBOX
            Alumno alumnoSelec = (Alumno) jCBInscriptos.getSelectedItem();
            //  Reasignando valores al objeto "a" 
            alumnoSelec = new Alumno(alumnoSelec.getIdAlumno(), alumnoSelec.getDni(), alumnoSelec.getApellido(), alumnoSelec.getNombre(), alumnoSelec.getFechaNacimiento(), true);
            // Si se intenta agregar una inscripción con el JRadioButton de no inscriptas, dará error
            if (jRBNoInscriptas.isSelected()) {
                //Agregango valores de la fila seleccionada a materiaSelec
                int idMateria = (int) modelo.getValueAt(jTInscriptos.getSelectedRow(), 0);
                String nombreMat = modelo.getValueAt(jTInscriptos.getSelectedRow(), 1).toString();
                int anioMat = (int) modelo.getValueAt(jTInscriptos.getSelectedRow(), 2);
                Materia materiaSelec = new Materia(idMateria, nombreMat, anioMat, true);
                // Instanciando objeto de clase InscripcionData para usar sus métodos
                InscripcionData iData = new InscripcionData();
                Inscripcion insc = new Inscripcion(alumnoSelec, materiaSelec, 0);
                iData.guardarInscripcion(insc);
                limpiar();
                listarNo();
            } else {
                JOptionPane.showMessageDialog(this, "El alumno ya se encuentra inscripto.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscActionPerformed
        // TODO add your handling code here:
        if (jTInscriptos.getSelectedRow() != -1) {
            if (jRBInscriptas.isSelected()) {
                Alumno alumnoSelec = (Alumno) jCBInscriptos.getSelectedItem();
                // Obteniendo idAlumno del elemento seleccionado
                int alumnoSelecI = alumnoSelec.getIdAlumno();
                // Casteo a int del idMateria
                int idMateria = (int) modelo.getValueAt(jTInscriptos.getSelectedRow(), 0);
                InscripcionData iData = new InscripcionData();
                iData.anularInscripcion(alumnoSelecI, idMateria);

                limpiar();
                listar();

            } else {
                JOptionPane.showMessageDialog(this, "El alumno no esta inscripto en la materia seleccionada.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una materia.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBAnularInscActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:

        RegistroAlumnosUlp.JIInsc.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

    public void listar() {
        Alumno id = (Alumno) jCBInscriptos.getSelectedItem();
        if (jRBInscriptas.isSelected()) {
            limpiar();
            InscripcionData iData = new InscripcionData();
            iData.obtenerMateriasCursadas(id.getIdAlumno()).forEach((oMatCur) -> {
                modelo.addRow(new Object[]{oMatCur.getIdMateria(), oMatCur.getNombre(), oMatCur.getAnio()});
            });
            jRBNoInscriptas.setSelected(false);
        } else {
            limpiar();

        }
    }

    public void listarNo() {
        Alumno id = (Alumno) jCBInscriptos.getSelectedItem();
        InscripcionData iData = new InscripcionData();
        iData.obtenerMateriasNoCursadas(id.getIdAlumno());
        if (jRBNoInscriptas.isSelected()) {
            limpiar();
            iData.obtenerMateriasNoCursadas(id.getIdAlumno()).forEach((oMatCur) -> {
                modelo.addRow(new Object[]{oMatCur.getIdMateria(), oMatCur.getNombre(), oMatCur.getAnio()});
            });
            jRBInscriptas.setSelected(false);
        } else {
            limpiar();
        }

    }

    public void limpiar() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAnularInsc;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBInscriptos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBInscriptas;
    private javax.swing.JRadioButton jRBNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTInscriptos;
    // End of variables declaration//GEN-END:variables
}
