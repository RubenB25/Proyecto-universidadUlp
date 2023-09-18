
package universidadejemplo.Vistas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
public class ActualizacionDeNotas extends javax.swing.JInternalFrame {
    //instancion una tabla y la llamo modelo y la puedo utilizar de cualquier metodo 
DefaultTableModel modelo;
  
    public ActualizacionDeNotas() {
        initComponents();
        setTitle("UNIVERSIDAD ULP GRUPO 83");
        //instancio una tabla con el modelo de la vista 
       modelo= new DefaultTableModel();
        //le doy a la tabla un valor de la tabla inscripcionMateria.  
        modelo = (DefaultTableModel)jTinscripcionMateria.getModel();
        // llamo al metodo llenar combo box que esta abajo
        llenarCB();
    
    }

      public void llenarCB() {
          //metodo de llenado de la array del objeto  alumno
     AlumnoData llenar = new AlumnoData();
     //lo recorre  y va llenando  el combo box con la lista
      for (Alumno listarAlumno : llenar.listarAlumnos()) {

            jCBalumnos.addItem(listarAlumno);
      }}   

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setForeground(new java.awt.Color(0, 153, 102));

        jLabe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabe.setText("Carga de Notas");

        jLabel1.setText("Seleccione un alumno:");

        jCBalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBalumnosActionPerformed(evt);
            }
        });

        jTinscripcionMateria.setAutoCreateRowSorter(true);
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
        jTinscripcionMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTinscripcionMateriaMouseClicked(evt);
            }
        });
        jTinscripcionMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTinscripcionMateriaKeyTyped(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabe, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jBguardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabe)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//GEN-FIRST:event_jBsalirActionPerformed
 
//GEN-LAST:event_jBsalirActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed

        InscripcionData ins= new InscripcionData();
        Alumno alumnoSeleccionado = (Alumno)jCBalumnos.getSelectedItem();
        int idAlumno=alumnoSeleccionado.getIdAlumno();
        int filaSeleccionada = jTinscripcionMateria.getSelectedRow();
        ins.obtenerMateriasCursadas(idAlumno);
        Object valorMateria = modelo.getValueAt(filaSeleccionada,0);
        Object valorNota= modelo.getValueAt(filaSeleccionada,2);
        if (valorMateria!=null|| valorNota!=null){
    try {
        // Convertirlo a entero
        int idMateria = Integer.parseInt(valorMateria.toString());
        System.out.println(idMateria);
        int nota=Integer.parseInt(valorNota.toString());
        System.out.println(nota);
        ins.actualizarNota(idAlumno, idMateria, nota);
// Ahora, "valorEntero" es una variable entera que contiene el valor deseado.
    } catch (NumberFormatException e) {
        // En caso de que no se pueda convertir a entero
            JOptionPane.showMessageDialog(null,"El valor obtenido no es entero");
    }} else {
            JOptionPane.showMessageDialog(null,"El valor obtenido  es nulo");
}
       
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTinscripcionMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTinscripcionMateriaKeyTyped
        // TODO add your handling code here:
        //  double nota2=(Double)modelo.getValueAt(jTinscripcionMateriaKeyTyped(evt), 2);
    }//GEN-LAST:event_jTinscripcionMateriaKeyTyped

    private void jTinscripcionMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTinscripcionMateriaMouseClicked

    }//GEN-LAST:event_jTinscripcionMateriaMouseClicked

    private void jCBalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBalumnosActionPerformed

        //instancia de una inscripción de datos
        InscripcionData materiaInscripta= new InscripcionData();
        //coloco la siguiente condicion mientras la tabla sea mayor a 0, limpio las filas
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);}
        //instancio un objeto alumno donde esta la seleccion del combo box
        Alumno alumnoSeleccionado = (Alumno)jCBalumnos.getSelectedItem();
        // creo variable de tipo entero donde coloco el id del alumno seleccionado
        int idAlumno=alumnoSeleccionado.getIdAlumno();
        //instancio dentro del for each,
        //con el que recorro la tabla de inscripciondata llamada materiaInscripta y
        //le paso el idalumno
        for (Inscripcion listaObtenida:materiaInscripta.obtenerInscripcionesPorAlumno(idAlumno)) {
            //añado una fila a la tabla, pasandole un objeto, el dato que esta en idmateria, lo que esta en materia y en nota
            modelo.addRow(new Object[]{listaObtenida.getMateria().getIdMateria(), listaObtenida.getMateria(), listaObtenida.getNota()});

        }}
        private void jBsalirActionPerformed (java.awt.event.ActionEvent evt){
            dispose();
    }//GEN-LAST:event_jCBalumnosActionPerformed

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

