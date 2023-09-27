package universidadejemplo.Vistas;


import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;


public class FAlumno extends javax.swing.JInternalFrame {
    boolean contieneNumero=false;
    private Alumno alumno;
    private int dni;
    InscripcionData ins= new InscripcionData();
    public FAlumno() {
        initComponents();
        alumno = new Alumno();
        
    }
    
    public void DatosMaterias(){
        
   /* DefaultTableModel modelo = new DefaultTableModel();
    if (jTcodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de materia");
        } else {
            int codigo = Integer.parseInt(jTcodigo.getText());
            MateriaData matData = new MateriaData();
            matData.buscarMateria(codigo);
            Materia mat = matData.buscarMateria(codigo);
            jTnombre.setText(mat.getNombre());
            JTaño.setText(mat.getAnio()+"");
            jChBEstado.setSelected(mat.isEstado());*/
        }

    public boolean verificarCampos() {
        ButtonModel bm = bGEstado.getSelection();
        try {  
            dni = Integer.parseInt(jTFdocumento.getText());
            if ((!"".equals(jTFapellido.getText()) && !"".equals(jTFnombre.getText()))
                    && bGEstado.isSelected(bm)) { //(jRActivoNo.isSelected() || jRActivoSi.isSelected())
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
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGEstado = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFdocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRActivoSi = new javax.swing.JRadioButton();
        jBsalir = new javax.swing.JButton();
        jTFapellido = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jRActivoNo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLfirma = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setTitle("Alumno con Materias");
        setPreferredSize(new java.awt.Dimension(499, 531));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Documento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jTFdocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTFdocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 221, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Activo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, 30));

        jRActivoSi.setBackground(new java.awt.Color(204, 204, 204));
        bGEstado.add(jRActivoSi);
        jRActivoSi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRActivoSi.setText("Si");
        jPanel1.add(jRActivoSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 50, 30));

        jBsalir.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, 30));

        jTFapellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTFapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 221, -1));

        jTFnombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(jTFnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 221, -1));

        jRActivoNo.setBackground(new java.awt.Color(204, 204, 204));
        bGEstado.add(jRActivoNo);
        jRActivoNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRActivoNo.setText("No");
        jPanel1.add(jRActivoNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 60));

        jLfirma.setForeground(new java.awt.Color(255, 153, 0));
        jLfirma.setText("Realizado  por el grupo 83");
        jPanel1.add(jLfirma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 90));

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
        RegistroAlumnosUlp.ventanaAbiertaF = false;
    }//GEN-LAST:event_jBsalirActionPerformed
    
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGEstado;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLfirma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRActivoNo;
    private javax.swing.JRadioButton jRActivoSi;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFapellido;
    private javax.swing.JTextField jTFdocumento;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
