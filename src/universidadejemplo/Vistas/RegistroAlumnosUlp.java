package universidadejemplo.Vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;

/** @author Gabriel*/
public class RegistroAlumnosUlp extends javax.swing.JFrame {
    public static boolean ventanaAbiertaA=false;
    public static boolean ventanaAbiertaC=false;
    public static boolean ventanaAbiertaF=false;
    public static boolean ventanaAbiertaG=false;
    public static boolean ventanaAbiertaI=false;
    
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
        setTitle("Universidad ULP");
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/Fondo.png"));
        Image image = icon.getImage();
        jDescritorio = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jDescritorio.setBackground(new java.awt.Color(255, 255, 255));
        jDescritorio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
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
        if(!(ventanaAbiertaF)){
            jDescritorio.repaint();

        jDescritorio.add(fa);
        
        Dimension desktopSize = jDescritorio.getSize();
        Dimension frameSize = fa.getSize();
        fa.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        jDescritorio.moveToFront(fa);
        fa.setVisible(true);
        ventanaAbiertaF= true;
        }else fa.toFront(); // No funciona, consultar con couch
    }//GEN-LAST:event_jMIFormularioAActionPerformed

    private void jMIManejoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManejoInscActionPerformed
       
        // TODO add your handling code here:+
        Inscripciones JIInsc = new Inscripciones();
         if(!(ventanaAbiertaI)){
        jDescritorio.repaint();
        
        // Crea una instancia de tu JInternalFrame
        
        // Agrega el JInternalFrame al JDesktopPane
  
        
        
        jDescritorio.add(JIInsc);
        Dimension desktopSize = jDescritorio.getSize();
        Dimension frameSize = JIInsc.getSize();
        JIInsc.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        // Hace que el JInternalFrame sea visible
        JIInsc.setVisible(true);
        ventanaAbiertaI=true;
    }
        
       
        
    }//GEN-LAST:event_jMIManejoInscActionPerformed

    private void jMIManipulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIManipulacionActionPerformed
 if(!(ventanaAbiertaA)){
         jDescritorio.repaint();
        // Crea una instancia de tu JInternalFrame
        ActualizacionDeNotas adn =new ActualizacionDeNotas();
        // Agrega el JInternalFrame al JDesktopPane
        
        jDescritorio.add(adn);
        Dimension desktopSize = jDescritorio.getSize();
        Dimension frameSize = adn.getSize();
        adn.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        // Hace que el JInternalFrame sea visible
        adn.setVisible(true);}
    ventanaAbiertaA=true;
       // adn.addComponentListener(adn);
    }//GEN-LAST:event_jMIManipulacionActionPerformed

    private void jMIFormularioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFormularioMActionPerformed
        // TODO add your handling code here:
         if(!(ventanaAbiertaG)){
        jDescritorio.repaint();
        GestionMaterias gM = new GestionMaterias();
        jDescritorio.add(gM);
        Dimension desktopSize = jDescritorio.getSize();
        Dimension frameSize = gM.getSize();
        gM.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        gM.setVisible(true);
        ventanaAbiertaG=true;
         }
    }//GEN-LAST:event_jMIFormularioMActionPerformed

    private void jMIAlumnosxMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAlumnosxMActionPerformed
        // TODO add your handling code here:
         if(!(ventanaAbiertaC)){
        jDescritorio.repaint();
        ConsultaDeAlumnosPorMateria consultaAlumn = new ConsultaDeAlumnosPorMateria();
        
        jDescritorio.add(consultaAlumn);
        Dimension desktopSize = jDescritorio.getSize();
        Dimension frameSize = consultaAlumn.getSize();
        consultaAlumn.setLocation((desktopSize.width - frameSize.width) / 2, (desktopSize.height - frameSize.height) / 2);
        jDescritorio.moveToFront(consultaAlumn);
        consultaAlumn.setVisible(true);
        ventanaAbiertaC=true;
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
