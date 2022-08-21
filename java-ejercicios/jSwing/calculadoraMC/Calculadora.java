package calculadoraMC;

import java.util.ArrayList;
import java.util.Iterator;

public class Calculadora extends javax.swing.JFrame {

    ArrayList<String> operacion;
    
    public Calculadora() {
        this.operacion = new ArrayList<>();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelOperandos = new javax.swing.JPanel();
        jTextFieldResultado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonCE = new javax.swing.JButton();
        jPanelOperaciones = new javax.swing.JPanel();
        jButtonSuma = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Calculadora");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldResultado.setEditable(false);
        jTextFieldResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldResultadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperandosLayout = new javax.swing.GroupLayout(jPanelOperandos);
        jPanelOperandos.setLayout(jPanelOperandosLayout);
        jPanelOperandosLayout.setHorizontalGroup(
            jPanelOperandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperandosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOperandosLayout.setVerticalGroup(
            jPanelOperandosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperandosLayout.createSequentialGroup()
                .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jButton1.setText("1");
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonCE.setText("CE");
        jButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton0)
                    .addComponent(jButtonCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(6, 6, 6)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(6, 6, 6)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton0)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButtonC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButtonCE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOperaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255))); // NOI18N

        jButtonSuma.setText("+");
        jButtonSuma.setMaximumSize(new java.awt.Dimension(38, 28));
        jButtonSuma.setMinimumSize(new java.awt.Dimension(38, 28));
        jButtonSuma.setPreferredSize(new java.awt.Dimension(38, 28));
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });

        jButtonMultiplicacion.setText("*");
        jButtonMultiplicacion.setMaximumSize(new java.awt.Dimension(38, 28));
        jButtonMultiplicacion.setMinimumSize(new java.awt.Dimension(38, 28));
        jButtonMultiplicacion.setPreferredSize(new java.awt.Dimension(38, 28));
        jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacionActionPerformed(evt);
            }
        });

        jButtonResta.setText("-");
        jButtonResta.setMaximumSize(new java.awt.Dimension(38, 28));
        jButtonResta.setMinimumSize(new java.awt.Dimension(38, 28));
        jButtonResta.setPreferredSize(new java.awt.Dimension(38, 28));
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });

        jButtonDivision.setText("/");
        jButtonDivision.setMaximumSize(new java.awt.Dimension(38, 28));
        jButtonDivision.setMinimumSize(new java.awt.Dimension(38, 28));
        jButtonDivision.setPreferredSize(new java.awt.Dimension(38, 28));
        jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisionActionPerformed(evt);
            }
        });

        jButtonIgual.setText("=");
        jButtonIgual.setMaximumSize(new java.awt.Dimension(38, 28));
        jButtonIgual.setMinimumSize(new java.awt.Dimension(38, 28));
        jButtonIgual.setPreferredSize(new java.awt.Dimension(38, 28));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonRaiz.setText("√");
        jButtonRaiz.setMaximumSize(new java.awt.Dimension(38, 28));
        jButtonRaiz.setMinimumSize(new java.awt.Dimension(38, 28));
        jButtonRaiz.setPreferredSize(new java.awt.Dimension(38, 28));
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperacionesLayout = new javax.swing.GroupLayout(jPanelOperaciones);
        jPanelOperaciones.setLayout(jPanelOperacionesLayout);
        jPanelOperacionesLayout.setHorizontalGroup(
            jPanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacionesLayout.createSequentialGroup()
                .addGroup(jPanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButtonMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonResta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanelOperacionesLayout.setVerticalGroup(
            jPanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOperacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelOperandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelOperaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOperandos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
        if (jTextFieldResultado.getText().isEmpty()) {
            if (!operacion.isEmpty()) {
                operacion.remove(operacion.size() - 1);
                operacion.add("*");
            }
        } else {
            operacion.add(jTextFieldResultado.getText());
            jTextFieldResultado.setText("");
            operacion.add("*");
        }
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed

    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        if (jTextFieldResultado.getText().isEmpty()) {
            if (!operacion.isEmpty()) {
                operacion.remove(operacion.size() - 1);
                operacion.add("/");
            }
        } else {
            operacion.add(jTextFieldResultado.getText());
            jTextFieldResultado.setText("");
            operacion.add("/");
        }
    }//GEN-LAST:event_jButtonDivisionActionPerformed

    private void jTextFieldResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldResultadoMouseClicked
        jTextFieldResultado.setText("");
    }//GEN-LAST:event_jTextFieldResultadoMouseClicked

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        if (!jTextFieldResultado.getText().isEmpty()) {
            operacion.add(jTextFieldResultado.getText());
            jTextFieldResultado.setText("");
        }
     //   jTextFieldResultado.setText(Double.toString(hacerOperacion())); con iterator
        jTextFieldResultado.setText(Double.toString(calcular()));
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // jTextFieldResultado.setText(jTextFieldResultado.getText() + "1");
       jTextFieldResultado.setText(jTextFieldResultado.getText()+evt.getSource().toString().substring(407, 408));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //  jTextFieldResultado.setText(jTextFieldResultado.getText() + "2"); 
      //otra forma de hacerlo con los eventos y utilizar el evento de jButton1ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed
        String texto = jTextFieldResultado.getText();
        if (!texto.equals("")) {
            double raiz = Double.valueOf(texto);
            raiz = Math.sqrt(raiz);
            jTextFieldResultado.setText(Double.toString(raiz));
        }
    }//GEN-LAST:event_jButtonRaizActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jTextFieldResultado.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCEActionPerformed
        jTextFieldResultado.setText("");
        operacion.clear();
    }//GEN-LAST:event_jButtonCEActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        if (jTextFieldResultado.getText().isEmpty()) {
            if (!operacion.isEmpty()) {
                operacion.remove(operacion.size() - 1);
                operacion.add("+");
            }
        } else {
            operacion.add(jTextFieldResultado.getText());
            jTextFieldResultado.setText("");
            operacion.add("+");
        }
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        if (jTextFieldResultado.getText().isEmpty()) {
            if (!operacion.isEmpty()) {
                operacion.remove(operacion.size() - 1);
                operacion.add("-");
            }
        } else {
            operacion.add(jTextFieldResultado.getText());
            jTextFieldResultado.setText("");
            operacion.add("-");
        }
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        jTextFieldResultado.setText(jTextFieldResultado.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private double calcular()
    {
        double res=0;
        String operador="";
        
        if (!operacion.isEmpty())
        {
            if (operacion.size()<3)
            {
                res=Double.valueOf((String)operacion.get(0));
            }
            else
            {
                for (int i=0;i<operacion.size();i++)
                {
                    String s=operacion.get(i);
                    if (!s.equals("+") && !s.equals("-") && !s.equals("/") && !s.equals("*")) {
                    double valor = Double.valueOf(s);
                    if (!operador.isEmpty()) {
                        switch (operador) {
                            case "+":
                                res += valor;
                                break;
                            case "-":
                                res -= valor;
                                break;
                            case "/":
                                res /= valor;
                                break;
                            case "*":
                                res *= valor;
                                break;
                        }
                        operador = "";
                    } else {
                        res = valor;
                    }
                    
                } else {
                    operador = s;
                }
                }
            }
        }    
        
        return res;
    }
    
    private double hacerOperacion () {
        double resultado = 0;
        String operador = "";
        Iterator<String> iterator = operacion.iterator();
        if ((!operacion.isEmpty()) && operacion.size() < 3) {
            resultado = Double.valueOf((String) iterator.next());
        } else {
            while (iterator.hasNext()) {
                String s = (String) iterator.next();
                if (!s.equals("+") && !s.equals("-") && !s.equals("/") && !s.equals("*")) {
                    double valor = Double.valueOf(s);
                    if (!operador.isEmpty()) {
                        switch (operador) {
                            case "+":
                                resultado += valor;
                                break;
                            case "-":
                                resultado -= valor;
                                break;
                            case "/":
                                resultado /= valor;
                                break;
                            case "*":
                                resultado *= valor;
                                break;
                        }
                        operador = "";
                    } else {
                        resultado = valor;
                    }
                    
                } else {
                    operador = s;
                }
            }
       
        }
        return resultado;
    }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCE;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelOperaciones;
    private javax.swing.JPanel jPanelOperandos;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}
