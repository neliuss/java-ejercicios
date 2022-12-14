package Alumnos;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import alumnosGUI.Alumno;


public class ListaAlumnos extends javax.swing.JFrame {
 
    ArrayList<Alumno> alumnado = new ArrayList<>();
    int pos = 0;

    public ListaAlumnos() {
        initComponents();

      leerFichero();

       if (!alumnado.isEmpty()) {
            mostrarDatosAlumno(pos);
            if (alumnado.size() > 1) {
                jButtonSiguiente.setEnabled(true);
            }
        }
       
    }
    
    private void leerFichero(){
        // se guarda de forma completa en el arraylist todos los alumnos
      
     try 
     {
         ObjectInputStream fichero = 
                new ObjectInputStream(new FileInputStream("alumnos.dat"));
     
          alumnado = (ArrayList <Alumno>)fichero.readObject();
     }
     catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"No se encuentra la clase de serialización");
     }
     catch (IOException e)
             {
              JOptionPane.showMessageDialog(null,"Problemas de E/S. Se creará alumnos.dat");   
             //no se crea aquí,solo se da el aviso
             }
    }

    private void serializar()
    { //  el arraylist completo
        try (ObjectOutputStream ficheiro = 
                new ObjectOutputStream(new FileOutputStream("alumnos.dat",false))){ 
             ficheiro.writeObject(alumnado);
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error, problemas de E/S");
        }
    }
        
  
    private void mostrarDatosAlumno(int posicion) {
     
        Alumno alumno = alumnado.get(posicion);
        jTextFieldNombre.setText(alumno.nombre);
        jTextFieldDNI.setText(alumno.dni);
        jTextFieldEdad.setText(Integer.toString(alumno.edad));
        jTextFieldCurso.setText(alumno.curso);
        jTextFieldNota.setText(Float.toString(alumno.nota));
        if (alumno.repite) {
            jRadioButtonRepiteSi.setSelected(true);
        } else {
            jRadioButtonRepiteNo.setSelected(true);
        }
    }
    
    private void borrarDatos() {
        jTextFieldNombre.setText("");
        jTextFieldDNI.setText("");
        jTextFieldEdad.setText("");
        jTextFieldCurso.setText("");
        jTextFieldNota.setText("");
        buttonGroupRepite.clearSelection();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRepite = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNota = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonRepiteSi = new javax.swing.JRadioButton();
        jRadioButtonRepiteNo = new javax.swing.JRadioButton();
        jLabelCurso = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNota = new javax.swing.JTextField();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jTextFieldCurso = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonPrevio = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión alumnado");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));

        jLabel6.setBackground(new java.awt.Color(0, 204, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Alumnos");

        jButtonSalir.setBackground(new java.awt.Color(239, 239, 239));
        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/x.png"))); // NOI18N
        jButtonSalir.setContentAreaFilled(false);
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonSalir)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelNombre.setText("Nombre");

        jLabel2.setText("DNI");

        jLabelNota.setText("NOTA");

        jLabel4.setText("Repite");

        buttonGroupRepite.add(jRadioButtonRepiteSi);
        jRadioButtonRepiteSi.setText("Si");

        buttonGroupRepite.add(jRadioButtonRepiteNo);
        jRadioButtonRepiteNo.setText("No");

        jLabelCurso.setText("Curso");

        jTextFieldNombre.setEditable(false);

        jTextFieldDNI.setEditable(false);

        jTextFieldNota.setEditable(false);

        jLabelEdad.setText("Edad");

        jTextFieldEdad.setEditable(false);

        jTextFieldCurso.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelEdad)
                            .addComponent(jLabelNota)
                            .addComponent(jLabelCurso))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jRadioButtonRepiteSi)
                        .addGap(27, 27, 27)
                        .addComponent(jRadioButtonRepiteNo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldNota)
                    .addComponent(jTextFieldDNI)
                    .addComponent(jTextFieldEdad)
                    .addComponent(jTextFieldCurso)
                    .addComponent(jTextFieldNombre))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelEdad)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelNota)
                    .addComponent(jTextFieldNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonRepiteNo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonRepiteSi)
                    .addComponent(jLabel4))
                .addGap(15, 15, 15))
        );

        jButtonPrevio.setText("Previo");
        jButtonPrevio.setEnabled(false);
        jButtonPrevio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrevioActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.setEnabled(false);
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Borrar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButtonNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPrevio)
                .addGap(14, 14, 14)
                .addComponent(jButtonSiguiente)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonPrevio)
                    .addComponent(jButtonSiguiente)
                    .addComponent(jButtonEliminar))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        NuevoAlumno nuevoA = new NuevoAlumno(this, true);
        nuevoA.setVisible(true); //asi iniciamos el dialog
      if (nuevoA.getAlumno() != null) {  // o bien añadimos aquí el alumno que viene de nuevo alumno
            alumnado.add(nuevoA.getAlumno());
        } // hasta aquí se añade el alumno o se hacía en NuevoAlumno añadiendo ya el objeto en la lista
        if (!alumnado.isEmpty()) {
            mostrarDatosAlumno(pos);
            if (pos < alumnado.size()-1) {
                jButtonSiguiente.setEnabled(true);
            }
            jButtonEliminar.setEnabled(true);
        }
        
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonPrevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrevioActionPerformed
        pos--;
        mostrarDatosAlumno(pos);
        if (pos < alumnado.size()-1) {
            jButtonSiguiente.setEnabled(true);
        }
        if (pos == 0) {
            jButtonPrevio.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonPrevioActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        pos++;
        mostrarDatosAlumno(pos);
        jButtonPrevio.setEnabled(true);
        if (pos == alumnado.size()-1) {
            jButtonSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        alumnado.remove(pos);
        if (alumnado.isEmpty()) {
            borrarDatos();
            jButtonEliminar.setEnabled(false);
            jButtonSiguiente.setEnabled(false);
            jButtonPrevio.setEnabled(false);
        } else {
            if (pos > 0) {
                pos--;
            }
            mostrarDatosAlumno(pos);
            if (alumnado.size() == 1) {
                jButtonPrevio.setEnabled(false);
                jButtonSiguiente.setEnabled(false);
            } else if (pos == 0) {
                jButtonPrevio.setEnabled(false);
                jButtonSiguiente.setEnabled(true);
            } else if (pos == alumnado.size()-1){
                jButtonPrevio.setEnabled(true);
                jButtonSiguiente.setEnabled(false);
            } else {
                jButtonPrevio.setEnabled(true);
                jButtonSiguiente.setEnabled(true);
            }          
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
       // serializar();
        serializar();
        //System.exit(0); asi cerramos o bien con dispose:
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupRepite;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonPrevio;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCurso;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNota;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButtonRepiteNo;
    private javax.swing.JRadioButton jRadioButtonRepiteSi;
    private javax.swing.JTextField jTextFieldCurso;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNota;
    // End of variables declaration//GEN-END:variables
}
