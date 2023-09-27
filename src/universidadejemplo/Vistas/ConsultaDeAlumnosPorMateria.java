/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vistas;

import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Ruben
 */
public class ConsultaDeAlumnosPorMateria extends javax.swing.JInternalFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form ConsultaDeAlumnosPorMateria
     */
    public ConsultaDeAlumnosPorMateria() {

        initComponents();
        modelo = (DefaultTableModel) jTAlumnos.getModel();
        llenarCb();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCBListado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlumnos = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setResizable(true);
        setTitle("Listado de alumnos por materia");
        setPreferredSize(new java.awt.Dimension(499, 531));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una materia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        jCBListado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jCBListado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBListadoItemStateChanged(evt);
            }
        });
        jPanel1.add(jCBListado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 215, 30));

        jTAlumnos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Apellido", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTAlumnos);
        if (jTAlumnos.getColumnModel().getColumnCount() > 0) {
            jTAlumnos.getColumnModel().getColumn(0).setResizable(false);
            jTAlumnos.getColumnModel().getColumn(1).setResizable(false);
            jTAlumnos.getColumnModel().getColumn(2).setResizable(false);
            jTAlumnos.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 430, 280));

        jBsalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 60, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
        RegistroAlumnosUlp.ventanaAbiertaC = false;
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCBListadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBListadoItemStateChanged
        // TODO add your handling code here:
        limpiar();
        listar();

    }//GEN-LAST:event_jCBListadoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Materia> jCBListado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlumnos;
    // End of variables declaration//GEN-END:variables

    private void llenarCb() {
        MateriaData materiasCB = new MateriaData();

        for (Materia listaMaterias : materiasCB.listarMaterias()) {
            jCBListado.addItem(listaMaterias);

        }
    }

    private void listar() {
        Materia id = (Materia) jCBListado.getSelectedItem();
        InscripcionData iData = new InscripcionData();
        for (Alumno alumnos : iData.obtenerAlumnosPorMateria(id.getIdMateria())) {
            modelo.addRow(new Object[]{alumnos.getIdAlumno(), alumnos.getDni(), alumnos.getApellido(), alumnos.getNombre()});
        }
    }

    public void limpiar() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

}
