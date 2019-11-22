package formularios;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class form1 extends javax.swing.JFrame {

    public form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDado1 = new javax.swing.JLabel();
        labelDado2 = new javax.swing.JLabel();
        labelDado3 = new javax.swing.JLabel();
        labelDado4 = new javax.swing.JLabel();
        labelDado5 = new javax.swing.JLabel();
        labelDado6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtField1 = new javax.swing.JTextField();
        txtField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Apostar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Apuesta");

        jLabel2.setText("Gana");

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDado4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDado2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDado5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDado3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelDado6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDado3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(labelDado6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDado1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDado2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelDado5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDado4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel2)
                                    .addComponent(jButton2))
                                .addContainerGap(24, Short.MAX_VALUE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int d1, d2, d3, suma, apuesta;
    Random random = new Random();

    private void txtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField1ActionPerformed

    }//GEN-LAST:event_txtField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar apuesta");
        } else {
            labelDado1.setVisible(false);
            labelDado2.setVisible(false);
            labelDado3.setVisible(false);
            labelDado4.setVisible(false);
            labelDado5.setVisible(false);
            labelDado6.setVisible(false);

            d1 = random.nextInt(6) + 1;
            d2 = random.nextInt(6) + 1;
            d3 = random.nextInt(6) + 1;

            suma = d1 + d2 + d3;

            labelDado1.setIcon(new ImageIcon(getClass().getResource("/imagenes/dado" + d1 + ".png")));
            labelDado2.setIcon(new ImageIcon(getClass().getResource("/imagenes/dado" + d2 + ".png")));
            labelDado3.setIcon(new ImageIcon(getClass().getResource("/imagenes/dado" + d3 + ".png")));

            labelDado1.setVisible(true);
            labelDado2.setVisible(true);
            labelDado3.setVisible(true);

            apuesta = Integer.parseInt(txtField1.getText());

            if (suma == 3 || suma == 18) {
                apuesta = apuesta * 3;
                txtField2.setText(Integer.toString(apuesta));
                JOptionPane.showMessageDialog(null, "Ganaste! el triple");
            } else if (suma == 6 || suma == 9 || suma == 12) {
                apuesta = 0;
                txtField2.setText(Integer.toString(apuesta));
                JOptionPane.showMessageDialog(null, "perdiste todo tu dinero");
            } else {
                JOptionPane.showMessageDialog(null, "Segunda tirada");

                d1 = random.nextInt(6) + 1;
                d2 = random.nextInt(6) + 1;
                d3 = random.nextInt(6) + 1;

                labelDado4.setIcon(new ImageIcon(getClass().getResource("/imagenes/dado" + d1 + ".png")));
                labelDado5.setIcon(new ImageIcon(getClass().getResource("/imagenes/dado" + d2 + ".png")));
                labelDado6.setIcon(new ImageIcon(getClass().getResource("/imagenes/dado" + d3 + ".png")));

                labelDado4.setVisible(true);
                labelDado5.setVisible(true);
                labelDado6.setVisible(true);

                if (d1 == d2 && d2 == d3) {
                    apuesta = apuesta * 2;
                    txtField2.setText(Integer.toString(apuesta));
                    JOptionPane.showMessageDialog(null, "Ganaste! el doble");
                } else {
                    if (d1 == 1 || d2 == 1 || d3 == 1) {
                        apuesta = apuesta + 10;
                        txtField2.setText(Integer.toString(apuesta));
                        JOptionPane.showMessageDialog(null, "Ganaste! +10");
                    } else {
                        if (d1 == d2 || d2 == d3 || d1 == d3) {
                            apuesta = apuesta;
                            txtField2.setText(Integer.toString(apuesta));
                            JOptionPane.showMessageDialog(null, "lo mismo");
                        } else {
                            apuesta = 0;
                            txtField2.setText(Integer.toString(apuesta));
                            JOptionPane.showMessageDialog(null, "perdiste");
                        }
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        apuesta = 0;
        txtField1.setText("");
        txtField2.setText(Integer.toString(apuesta));
        labelDado1.setVisible(false);
        labelDado2.setVisible(false);
        labelDado3.setVisible(false);
        labelDado4.setVisible(false);
        labelDado5.setVisible(false);
        labelDado6.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelDado1;
    private javax.swing.JLabel labelDado2;
    private javax.swing.JLabel labelDado3;
    private javax.swing.JLabel labelDado4;
    private javax.swing.JLabel labelDado5;
    private javax.swing.JLabel labelDado6;
    private javax.swing.JTextField txtField1;
    private javax.swing.JTextField txtField2;
    // End of variables declaration//GEN-END:variables
}
