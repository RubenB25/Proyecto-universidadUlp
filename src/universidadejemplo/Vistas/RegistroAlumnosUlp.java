package universidadejemplo.Vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 * @author Gabriel
 */
public class RegistroAlumnosUlp extends javax.swing.JFrame {
    public RegistroAlumnosUlp() {
        initComponents();
        //  Para centrar el jDescritorio
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDescritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMIFormularioA = new javax.swing.JMenuItem();
        jMMateria = new javax.swing.JMenu();
        jMIFormularioM = new javax.swing.JMenuItem();
        jMAdministracion = new javax.swing.JMenu();
        jMIManejoInsc = new javax.swing.JMenuItem();
        jMIManipulacion = new javax.swing.JMenuItem();
        jMConsultas = new javax.swing.JMenu();
        jMIAlumnosxM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Universidad ULP grupo 83 (Ruben Botello, Gabriela Gimenez, Gabriel Mina, Rodolfo Richard)");
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Fondo1.png"));
        Image image = icon.getImage();
        jDescritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jDescritorio.setBackground(new java.awt.Color(255, 255, 255));
        jDescritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jDescritorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jDescritorio.setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout jDescritorioLayout = new javax.swing.GroupLayout(jDescritorio);
        jDescritorio.setLayout(jDescritorioLayout);
        jDescritorioLayout.setHorizontalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jDescritorioLayout.setVerticalGroup(
            jDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMAlumno.setText("Alumno");

        jMIFormularioA.setText("Formulario de alumno");
        jMIFormularioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFormularioAActionPerformed(evt);
            }
        });
        jMAlumno.add(jMIFormularioA);

        jMenuBar1.add(jMAlumno);

        jMMateria.setText("Materia");

        jMIFormularioM.setText("Formulario de materia");
        jMIFormularioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFormularioMActionPerformed(evt);
            }
        });
        jMMateria.add(jMIFormularioM);

        jMenuBar1.add(jMMateria);

        jMAdministracion.setText("Administración");

        jMIManejoInsc.setText("Manejo de inscripciones");
        jMIManejoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManejoInscActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMIManejoInsc);

        jMIManipulacion.setText("Manipulación de notas");
        jMIManipulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIManipulacionActionPerformed(evt);
            }
        });
        jMAdministracion.add(jMIManipulacion);

        jMenuBar1.add(jMAdministracion);

        jMConsultas.setText("Consultas");

        jMIAlumnosxM.setText("Alumnos por materia");
        jMIAlumnosxM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAlumnosxMActionPerformed(evt);
            }
        });
        jMConsultas.add(jMIAlumnosxM);

        jMenuBar1.add(jMConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDescritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIFormularioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioAActionPerformed
        FormularioAlumno fa = new FormularioAlumno();
        // Verifica si el JInternalFrame ya está en el JDesktopPane
        JInternalFrame[] frames = jDescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == fa.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    // Manejar la excepción si es necesario
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            // Agrega el JInternalFrame al JDesktopPane
            jDescritorio.add(fa);

            // Centra el JInternalFrame en el JDesktopPane
            Dimension desktopSize = jDescritorio.getSize();
            Dimension frameSize = fa.getSize();
            fa.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

            // Lleva el JInternalFrame al frente
            jDescritorio.moveToFront(fa);

            // Hace que el JInternalFrame sea visible
            fa.setVisible(true);
        } else {
            // Intenta traer al frente el JInternalFrame si ya está abierto
            fa.toFront();
        }
    }//GEN-LAST:event_jMIFormularioAActionPerformed

    private void jMIManejoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManejoInscActionPerformed

        // Crea una instancia de tu JInternalFrame
        Inscripciones JIInsc = new Inscripciones();

        // Verifica si el JInternalFrame ya está en el JDesktopPane
        JInternalFrame[] frames = jDescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == JIInsc.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    // Manejar la excepción si es necesario
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            // Agrega el JInternalFrame al JDesktopPane
            jDescritorio.add(JIInsc);

            // Centra el JInternalFrame en el JDesktopPane
            Dimension desktopSize = jDescritorio.getSize();
            Dimension frameSize = JIInsc.getSize();
            JIInsc.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

            // Hace que el JInternalFrame sea visible
            JIInsc.setVisible(true);
        }


    }//GEN-LAST:event_jMIManejoInscActionPerformed

    private void jMIManipulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManipulacionActionPerformed

        // Verifica si el JInternalFrame ya está en el JDesktopPane
        ActualizacionDeNotas adn = new ActualizacionDeNotas();
        JInternalFrame[] frames = jDescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean estaAbierta = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == adn.getClass()) {
                estaAbierta = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    // Manejar la excepción si es necesario
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!estaAbierta) {
            // Agrega el JInternalFrame al JDesktopPane
            jDescritorio.add(adn);

            // Centra el JInternalFrame en el JDesktopPane
            Dimension desktopSize = jDescritorio.getSize();
            Dimension frameSize = adn.getSize();
            adn.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

            // Lleva el JInternalFrame al frente
            jDescritorio.moveToFront(adn);

            // Hace que el JInternalFrame sea visible
            adn.setVisible(true);
        } else {
            // Intenta traer al frente el JInternalFrame si ya está abierto
            adn.toFront();
        }
        // adn.addComponentListener(adn);
    }//GEN-LAST:event_jMIManipulacionActionPerformed

    private void jMIFormularioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioMActionPerformed
        // Verifica si el JInternalFrame ya está en el JDesktopPane
        GestionMaterias gM = new GestionMaterias();
        JInternalFrame[] frames = jDescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean alreadyOpen = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == gM.getClass()) {
                alreadyOpen = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    // Manejar la excepción si es necesario
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!alreadyOpen) {
            // Agrega el JInternalFrame al JDesktopPane
            jDescritorio.add(gM);

            // Centra el JInternalFrame en el JDesktopPane
            Dimension desktopSize = jDescritorio.getSize();
            Dimension frameSize = gM.getSize();
            gM.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

            // Hace que el JInternalFrame sea visible
            gM.setVisible(true);

        } else {
            // Intenta traer al frente el JInternalFrame si ya está abierto
            gM.toFront();
        }
    }//GEN-LAST:event_jMIFormularioMActionPerformed

    private void jMIAlumnosxMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlumnosxMActionPerformed
        // TODO add your handling code here:
        ConsultaDeAlumnosPorMateria consultaAlumn = new ConsultaDeAlumnosPorMateria();
        JInternalFrame[] frames = jDescritorio.getAllFramesInLayer(javax.swing.JLayeredPane.DEFAULT_LAYER);
        boolean alreadyOpen = false;

        for (JInternalFrame frame : frames) {
            if (frame.getClass() == consultaAlumn.getClass()) {
                alreadyOpen = true;
                try {
                    frame.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    // Manejar la excepción si es necesario
                    e.printStackTrace();
                }
                break;
            }
        }

        if (!alreadyOpen) {
            // Agrega el JInternalFrame al JDesktopPane
            jDescritorio.add(consultaAlumn);

            // Centra el JInternalFrame en el JDesktopPane
            Dimension desktopSize = jDescritorio.getSize();
            Dimension frameSize = consultaAlumn.getSize();
            consultaAlumn.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);

            // Lleva el JInternalFrame al frente
            jDescritorio.moveToFront(consultaAlumn);

            // Hace que el JInternalFrame sea visible
            consultaAlumn.setVisible(true);
        } else {
            // Intenta traer al frente el JInternalFrame si ya está abierto
            consultaAlumn.toFront();
        }

    }//GEN-LAST:event_jMIAlumnosxMActionPerformed

    public static void main(String args[]) {

        //Connection con = Conexion.getConex();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnosUlp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnosUlp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnosUlp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnosUlp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnosUlp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDescritorio;
    private javax.swing.JMenu jMAdministracion;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenuItem jMIAlumnosxM;
    private javax.swing.JMenuItem jMIFormularioA;
    private javax.swing.JMenuItem jMIFormularioM;
    private javax.swing.JMenuItem jMIManejoInsc;
    private javax.swing.JMenuItem jMIManipulacion;
    private javax.swing.JMenu jMMateria;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
