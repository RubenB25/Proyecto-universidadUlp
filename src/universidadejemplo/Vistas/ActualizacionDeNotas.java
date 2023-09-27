package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;

public class ActualizacionDeNotas extends javax.swing.JInternalFrame {

    Alumno alumnoSeleccionado;
    DefaultTableModel modelo;
    ArrayList<Double> listaNotas = new ArrayList<>();
    Set<Integer> filasSelec = new HashSet<>();

    double notaTabla, nota;
    int idAlumno;
    int registroError = 0;

    public ActualizacionDeNotas() {
        initComponents();
        //instancio una tabla con el modelo de la vista 
        modelo = (DefaultTableModel) jTinscripcionMateria.getModel();
        llenarCB();
//        listar();

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
        jLabel1 = new javax.swing.JLabel();
        jCBalumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTinscripcionMateria = new javax.swing.JTable();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setResizable(true);
        setTitle("Carga de Notas");
        setPreferredSize(new java.awt.Dimension(499, 531));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jCBalumnos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jPanel1.add(jCBalumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 210, 30));

        jTinscripcionMateria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        jTinscripcionMateria.setColumnSelectionAllowed(true);
        jTinscripcionMateria.getTableHeader().setReorderingAllowed(false);
        jTinscripcionMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTinscripcionMateriaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTinscripcionMateria);
        jTinscripcionMateria.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTinscripcionMateria.getColumnModel().getColumnCount() > 0) {
            jTinscripcionMateria.getColumnModel().getColumn(0).setResizable(false);
            jTinscripcionMateria.getColumnModel().getColumn(1).setResizable(false);
            jTinscripcionMateria.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 420, 301));

        jBguardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        jPanel1.add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 30));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBalumnosActionPerformed


    }//GEN-LAST:event_jCBalumnosActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        //instancie un objeto inscripcionData y un alumno donde pongo la seleccion
//        InscripcionData ins= new InscripcionData();
//        Alumno alumnoSeleccionado = (Alumno)jCBalumnos.getSelectedItem();
//        //pongo variables para guardar los datos que voy a uilizar
//        int idAlumno=alumnoSeleccionado.getIdAlumno();
//        //obtengo la fila seleccionada para sacar los datos necesarios para invocar el metodo de actualizar
//        int filaSeleccionada = jTinscripcionMateria.getSelectedRow();
//        //de mi objeto inscripciondata obtengo las materias cursadas
//        ins.obtenerMateriasCursadas(idAlumno);
//        //creo dos objetos para luego obtener los valores dentro de la tabla parseandolos
//        Object valorMateria = modelo.getValueAt(filaSeleccionada,0);
//        Object valorNota= modelo.getValueAt(filaSeleccionada,2);
//        if (valorMateria!=null|| valorNota!=null){//si los mismos no son nulos 
//    try {
//        // los Convirto a entero
//        int idMateria = Integer.parseInt(valorMateria.toString());
//        //este sout fue para probar que me de el valor que necesitaba
//        //System.out.println(idMateria);
//        int nota=Integer.parseInt(valorNota.toString());
//        //este sou era para sabe que lo que me daba era correco
//        //System.out.println(nota);
//        //llamo al metodo actualizar enviando la informacion necesaria
//        ins.actualizarNota(idAlumno, idMateria, nota);
//// Ahora, "valorEntero" es una variable entera que contiene el valor deseado.
//    } catch (NumberFormatException e) {
//        // En caso de que no se pueda convertir a entero
//            JOptionPane.showMessageDialog(null,"El valor obtenido no es entero");
//    }} else {
//            JOptionPane.showMessageDialog(null,"El valor obtenido  es nulo");
//}     
        try {
            registroError = 0;
            InscripcionData ins = new InscripcionData();
            // actualiza la lista de notas del alumno seleccionado 
            obtenerNotasDeInscripciones(ins, idAlumno);
            for (Integer integer : filasSelec) {
                notaTabla = Double.parseDouble(jTinscripcionMateria.getValueAt(integer, 2).toString());
                int idMateria = Integer.parseInt(jTinscripcionMateria.getValueAt(integer, 0).toString());
                // itero sobre la lista fila y utilizo mi objeto integer como indice para obtener la nota actual de la fila que se está checkeando si hay cambios con la nota cambiada.
                nota = listaNotas.get(integer);
                if (notaTabla > 0 && notaTabla < 11) {
                    // si las notas difieren, se actualiza
                    if (notaTabla != nota) {
                        nota = notaTabla;
                        ins.actualizarNota(idAlumno, idMateria, nota);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Valor de nota fuera de rango (1 a 10)", "ERROR", JOptionPane.ERROR_MESSAGE);
                    registroError++;
                }
            }
            // mensaje de confirmación y limpieza de las listas.
            if (registroError == 0) {
                JOptionPane.showMessageDialog(this, "Notas actualizadas.");
                filasSelec.removeAll(filasSelec);
                listaNotas.removeAll(listaNotas);

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor númerico.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBguardarActionPerformed

    private void jCBalumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBalumnosItemStateChanged
        limpiar();
        listar();

        filasSelec.removeAll(filasSelec);
        listaNotas.removeAll(listaNotas);

    }//GEN-LAST:event_jCBalumnosItemStateChanged

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();
        RegistroAlumnosUlp.ventanaAbiertaA = false;
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTinscripcionMateriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTinscripcionMateriaMouseReleased
        // TODO add your handling code here:
        int filaFocused = jTinscripcionMateria.getSelectedRow();
        if (filaFocused >= 0) {
            filasSelec.add(filaFocused);
        }

    }//GEN-LAST:event_jTinscripcionMateriaMouseReleased
    public void limpiar() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void obtenerNotasDeInscripciones(InscripcionData ins, int idAlumno) {
        for (Inscripcion listaObtenida : ins.obtenerInscripcionesPorAlumno(idAlumno)) {
            listaNotas.add(listaObtenida.getNota());
        }
    }

    public void listar() {
        InscripcionData materiaInscripta = new InscripcionData();
        Alumno alumnoSeleccionado = (Alumno) jCBalumnos.getSelectedItem();
        idAlumno = alumnoSeleccionado.getIdAlumno();
        for (Inscripcion listaObtenida : materiaInscripta.obtenerInscripcionesPorAlumno(idAlumno)) {
            modelo.addRow(new Object[]{listaObtenida.getMateria().getIdMateria(), listaObtenida.getMateria(), listaObtenida.getNota()});

        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<Alumno> jCBalumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTinscripcionMateria;
    // End of variables declaration//GEN-END:variables

}
