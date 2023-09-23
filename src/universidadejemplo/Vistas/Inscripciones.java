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
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class Inscripciones extends javax.swing.JInternalFrame {
// coloco dos atributos uno tabal por defecto modelo y un  
    private DefaultTableModel modelo;
    private int  idAlumno;

    public Inscripciones() {
// se inician los componentes del jframe
        initComponents();
        // le coloco titulo
        setTitle("UNIVERSIDAD ULP GRUPO 83");
     // el tamaño es de 400 x400
        setSize(400,400);
        // a la tabla le doy el modelo de tabla que usare 
        modelo = (DefaultTableModel) jTInscriptos.getModel();
        // llamo al metodo llenar 
        llenarCB();

    }

    public void llenarCB() {
        // como atributo un alumnodata 
        AlumnoData llenar = new AlumnoData();
// hago un for each colocanco en una lista del objeto alumno la recorro y lleno con los valores de alumno
        for (Alumno listarAlumno : llenar.listarAlumnos()) {
// en el jcombo voy añidiendo los valores de la lista de alumno
            jCBInscriptos.addItem(listarAlumno);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBInscriptos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRBInscriptas = new javax.swing.JRadioButton();
        jRBNoInscriptas = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jBInscribir = new javax.swing.JButton();
        jBAnularInsc = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTInscriptos = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 102));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jCBInscriptos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCBInscriptos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBInscriptosItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Formulario de Inscripción");

        jRBInscriptas.setBackground(new java.awt.Color(0, 153, 102));
        jRBInscriptas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRBInscriptas.setText("Materias inscriptas");
        jRBInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBInscriptasActionPerformed(evt);
            }
        });

        jRBNoInscriptas.setBackground(new java.awt.Color(0, 153, 102));
        jRBNoInscriptas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRBNoInscriptas.setText("Materias no inscriptas");
        jRBNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNoInscriptasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Listado de materias");

        jBInscribir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnularInsc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBAnularInsc.setText("Anular inscripción");
        jBAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 102, 102));
        jBSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTInscriptos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        jScrollPane1.setViewportView(jTInscriptos);
        if (jTInscriptos.getColumnModel().getColumnCount() > 0) {
            jTInscriptos.getColumnModel().getColumn(0).setResizable(false);
            jTInscriptos.getColumnModel().getColumn(1).setResizable(false);
            jTInscriptos.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInscribir)
                        .addGap(77, 77, 77)
                        .addComponent(jBAnularInsc)
                        .addGap(55, 55, 55)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRBNoInscriptas))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBInscriptos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRBInscriptas)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBInscriptos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBNoInscriptas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInsc)
                    .addComponent(jBInscribir)
                    .addComponent(jBSalir))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBInscriptasActionPerformed
        // check box cuando le doy clic a las inscriptas 
// si el check box esta seleccionado llamo al metodo listar
        if (jRBInscriptas.isSelected()) {

            listar();
            jRBInscriptas.setSelected(true);// y coloco el check box seleccionado
        } else {//sino
            limpiar();//llamo al metodo limpiar
        }


    }//GEN-LAST:event_jRBInscriptasActionPerformed

    private void jRBNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNoInscriptasActionPerformed
        // si selecciono las no inscriptas llamo al metodo listarNo
        listarNo();


    }//GEN-LAST:event_jRBNoInscriptasActionPerformed

    private void jCBInscriptosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBInscriptosItemStateChanged
        // si el combo box esta seleccionado
//llamo al metodo limpiar luego corroboro si el check box es seleccionado listo con el metodo listar
        limpiar();
        if (jRBInscriptas.isSelected()) {
            listar();
        } else if (jRBNoInscriptas.isSelected()) {//sino si es la opcion no inscripta listo con el metodo listarNo
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
                JOptionPane.showMessageDialog(this, "El alumno no esta inscripto en la materia seleccionada.","Error", JOptionPane.ERROR_MESSAGE);
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
                modelo.addRow(new Object[]{oMatCur.getIdMateria(), oMatCur.getNombre(), oMatCur.getIdAnioMateria()});
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
                modelo.addRow(new Object[]{oMatCur.getIdMateria(), oMatCur.getNombre(), oMatCur.getIdAnioMateria()});
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
    private javax.swing.JButton jBAnularInsc;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Alumno> jCBInscriptos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBInscriptas;
    private javax.swing.JRadioButton jRBNoInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTInscriptos;
    // End of variables declaration//GEN-END:variables

}
