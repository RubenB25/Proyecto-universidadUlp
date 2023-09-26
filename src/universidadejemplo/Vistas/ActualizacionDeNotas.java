
package universidadejemplo.Vistas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
public class ActualizacionDeNotas extends javax.swing.JInternalFrame {
    //instancion una tabla y la llamo modelo y la puedo utilizar de cualquier metodo 

  
    public ActualizacionDeNotas() {
        initComponents();
        
       //le coloco un titulo y un tamaño para que todos tengan el mismo tamaño
        setSize(500,477);
        //instancio una tabla con el modelo de la vista 
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
        jLabel1 = new javax.swing.JLabel();
        jCBalumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTinscripcionMateria = new javax.swing.JTable();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLimagen = new javax.swing.JLabel();
        jLfirma = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cargar Notas");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 477));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        jCBalumnos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCBalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBalumnosActionPerformed(evt);
            }
        });

        jTinscripcionMateria.setAutoCreateRowSorter(true);
        jTinscripcionMateria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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

        jLimagen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FooterUlpVirtualM.png"))); // NOI18N

        jLfirma.setForeground(new java.awt.Color(255, 153, 0));
        jLfirma.setText("Elaborado por el grupo 83");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBguardar)
                                .addGap(221, 221, 221)
                                .addComponent(jBsalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addComponent(jCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLfirma)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        //obtengo la fila seleccionada para sacar los datos necesarios para invocar el metodo de actualizar
        DefaultTableModel modelo;
         modelo = (DefaultTableModel)jTinscripcionMateria.getModel();
        int filaSeleccionada = jTinscripcionMateria.getSelectedRow();
        // JOptionPane.showMessageDialog(null,"Recuerda colocar la nota y seleccionar la fila que quieres Guardar");
        //instancie un objeto inscripcionData y un alumno donde pongo la seleccion
        InscripcionData ins= new InscripcionData();
        Alumno alumnoSeleccionado = (Alumno)jCBalumnos.getSelectedItem();
        //pongo variables para guardar los datos que voy a uilizar
        int idAlumno=alumnoSeleccionado.getIdAlumno();

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
                JOptionPane.showMessageDialog(null,"Para poder guardar solo seleccione y cambie una nota");
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
        DefaultTableModel modelo = new DefaultTableModel();
        //le doy a la tabla un valor de la tabla inscripcionMateria.
        modelo = (DefaultTableModel)jTinscripcionMateria.getModel();
        // llamo al metodo llenar combo box que
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
            modelo.addRow(new Object[]{listaObtenida.getMateria().getIdMateria(), listaObtenida.getMateria().getNombre(), listaObtenida.getNota()});

        }
       // private void jBsalirActionPerformed (java.awt.event.ActionEvent evt){
       //     dispose();
    }//GEN-LAST:event_jCBalumnosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCBalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLfirma;
    private javax.swing.JLabel jLimagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTinscripcionMateria;
    // End of variables declaration//GEN-END:variables

  
}

