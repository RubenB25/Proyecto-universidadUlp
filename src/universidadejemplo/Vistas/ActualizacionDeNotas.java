
package universidadejemplo.Vistas;

import java.awt.BorderLayout;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;


public class ActualizacionDeNotas extends javax.swing.JInternalFrame {
DefaultTableModel modelo;
  
    public ActualizacionDeNotas() {
        initComponents();
        //instancio una tabla con el modelo de la vista 
        modelo = (DefaultTableModel) jTinscripcionMateria.getModel();
        llenarCB();
        listar();
    
    }
      public void llenarCB() {
          //metodo de llenado de la array de alumno
     AlumnoData llenar = new AlumnoData();
     //lo recorre a la array y la llena
        for (Alumno listarAlumno : llenar.listarAlumnos()) {

            jCBalumnos.addItem(listarAlumno);
           
        }
      }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabe = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCBalumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTinscripcionMateria = new javax.swing.JTable();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        setBorder(new javax.swing.border.MatteBorder(null));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 102));

        jLabe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabe.setText("Carga de Notas");

        jLabel1.setText("Seleccione un alumno:");

        jCBalumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBalumnosItemStateChanged(evt);
            }
        });
        jCBalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBalumnosActionPerformed(evt);
            }
        });

        jTinscripcionMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTinscripcionMateria);

        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabe, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBsalir)))))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabe)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(26, 26, 26))
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

    private void jCBalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBalumnosActionPerformed
    
     
    }//GEN-LAST:event_jCBalumnosActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
       //instancie un objeto inscripcionData y un alumno donde pongo la seleccion
        InscripcionData ins= new InscripcionData();
        Alumno alumnoSeleccionado = (Alumno)jCBalumnos.getSelectedItem();
        //pongo variables para guardar los datos que voy a uilizar
        int idAlumno=alumnoSeleccionado.getIdAlumno();
        //obtengo la fila seleccionada para sacar los datos necesarios para invocar el metodo de actualizar
        int filaSeleccionada = jTinscripcionMateria.getSelectedRow();
        //de mi objeto inscripciondata obtengo las materias cursadas
        ins.obtenerMateriasCursadas(idAlumno);
        //creo dos objetos para luego obtener los valores dentro de la tabla parseandolos
        Object valorMateria = modelo.getValueAt(filaSeleccionada,0);
        Object valorNota= modelo.getValueAt(filaSeleccionada,2);
        if (valorMateria!=null|| valorNota!=null){//si los mismos no son nulos 
    try {
        // los Convirto a entero
        int idMateria = Integer.parseInt(valorMateria.toString());
        //este sout fue para probar que me de el valor que necesitaba
        //System.out.println(idMateria);
        int nota=Integer.parseInt(valorNota.toString());
        //este sou era para sabe que lo que me daba era correco
        //System.out.println(nota);
        //llamo al metodo actualizar enviando la informacion necesaria
        ins.actualizarNota(idAlumno, idMateria, nota);
// Ahora, "valorEntero" es una variable entera que contiene el valor deseado.
    } catch (NumberFormatException e) {
        // En caso de que no se pueda convertir a entero
            JOptionPane.showMessageDialog(null,"El valor obtenido no es entero");
    }} else {
            JOptionPane.showMessageDialog(null,"El valor obtenido  es nulo");
}
       
     
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jCBalumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBalumnosItemStateChanged
        limpiar();
        listar();
        
    }//GEN-LAST:event_jCBalumnosItemStateChanged

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed
    public void limpiar() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    public void listar(){
        InscripcionData materiaInscripta= new InscripcionData();
Alumno alumnoSeleccionado = (Alumno)jCBalumnos.getSelectedItem();

     int idAlumno=alumnoSeleccionado.getIdAlumno();
      for (Inscripcion listaObtenida:materiaInscripta.obtenerInscripcionesPorAlumno(idAlumno)) {
            modelo.addRow(new Object[]{listaObtenida.getMateria().getIdMateria(), listaObtenida.getMateria(), listaObtenida.getNota()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCBalumnos;
    private javax.swing.JLabel jLabe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTinscripcionMateria;
    // End of variables declaration//GEN-END:variables


}

