/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.hardcodeando.ui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author Nestor
 */
public class HillPanel extends javax.swing.JPanel {

    /**
     * Creates new form HillPanel
     */
    public HillPanel() {
        try {
            initComponents();
//            ImagePanel imgPanel = new ImagePanel();
//            imgPanel.setLocation(10, 20);
//            
//            //this.setLayout(new BorderLayout());
//            IntroHillPanel.add(imgPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 431, 129));
//            imgPanel.setVisible(true);
//            imgPanel.setBounds(0, 0, 431, 129);
            
            BufferedImage myPicture = ImageIO.read(new File("./res/hill_letras.png"));
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            IntroHillPanel.add(picLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 431, 129));
            
            BufferedImage imgFormarClave = ImageIO.read(new File("./res/validar_clave.png"));
            JLabel picLabelClave = new JLabel(new ImageIcon(imgFormarClave));
            hillPaso1Panel.add(picLabelClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 394, 172));
            
            BufferedImage imgFormarCifrar = ImageIO.read(new File("./res/cifrar.png"));
            JLabel picLabelCifrar = new JLabel(new ImageIcon(imgFormarCifrar));
            hillPaso2Panel.add(picLabelCifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 392, 333));
            
            BufferedImage imgFormarDesCifrar = ImageIO.read(new File("./res/desencriptar.png"));
            JLabel picLabelDesCifrar = new JLabel(new ImageIcon(imgFormarDesCifrar));
            hillPaso3Panel.add(picLabelDesCifrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 396, 445));
            
            
            // Deshabilitamos tabs
            jTabbedPane1.setEnabledAt(1, false);
            jTabbedPane1.setEnabledAt(2, false);
            jTabbedPane1.setEnabledAt(3, false);
            
            
        } catch (IOException ex) {
            Logger.getLogger(HillPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        IntroHillPanel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hillPaso1Panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lblHeaderPaso1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hillPaso2Panel = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        hillPaso3Panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Hill Cipher");

        jTabbedPane1.setFocusable(false);

        IntroHillPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Comenzar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        IntroHillPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, -1));

        jLabel2.setText("Hill Cipher es un algoritmo de encriptacion basado en algebra lineal, el cual toma el alfabeto de 26 letras como un espacio lineal.");
        IntroHillPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 750, -1));

        jLabel3.setText("<html>Para encriptar o desencriptar, el algoritmo asigna <br> valores numericos al alfabeto. <br><br> Para el aprendizaje de este algoritmos por tres pasos.<br><br> <strong>Paso 1</strong>: Se explicara el procedimiento y las condiciones <br> necesarias para armar una clave.<br><br> <strong>Paso 2</strong>: Se utilizara la clave obtenida para encriptar <br>un mensaje de ejemplo.<br><br> <strong>Paso 3</strong>: Se calculara otra clave para desencriptar <br> un mensaje un mesaje secreto<br><br> </html>");
        jLabel3.setDoubleBuffered(true);
        IntroHillPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 330, 230));
        jLabel3.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Introducción");
        IntroHillPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jTabbedPane1.addTab("Introducción", IntroHillPanel);

        hillPaso1Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        hillPaso1Panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, -1));

        lblHeaderPaso1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeaderPaso1.setText("Paso 1: Obtener una clave");
        hillPaso1Panel.add(lblHeaderPaso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setText("<html>La clave es una matriz de nxn la cual tiene que cumplir con lo siguiente para ser valida. <br> Para este ejemplo vamos a utilizar n=2.</html>");
        hillPaso1Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 44, 610, -1));

        jLabel7.setText("<html> <ul> <li>Dicha matriz es la matriz de encriptación cuyos valores se encuentran <br>entre los valores designados del alfabeto.<br><br></li> <li>Esta matriz encriptación debe ser inversible porque su inversa se usara <br>para desencriptar mas adelante.<br><br></li> <li>El determinante de la matriz tiene que ser un primo relativo al tamaño<br> de del alfabeto (26)<br><br></li> </ul> </html>");
        hillPaso1Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 90, 400, 190));

        jTabbedPane1.addTab("Paso 1 de 3", hillPaso1Panel);

        hillPaso2Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Siguiente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        hillPaso2Panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Paso 2: Vamos a encriptar");
        hillPaso2Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel9.setText("Supongamos que queremos encriptar \"TOP SECRET MESSAGE\"");
        hillPaso2Panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel10.setText("<html> <ul> <li>Separamos el texto en bloques de n=2 (ignorando espacios)<br><br></li> <li>Detarminarmos el valor numerico de cada letra y los alineamos <br>como vectores columnas.<br><br></li> <li>Multiplicamos cada uno de estos vectores por la matriz de encriptacion y <br>tomamos modulo 26 del resultado.<br><br></li> <li>Convertimos cada unos de los vectores obtenidos en vectores alfabeticos <br>y los combinamos para formar el texto cifrado.<br><br></li> </ul> </html>");
        hillPaso2Panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 320, 260));

        jLabel14.setText("Introdusca un mensaje a encriptar:");
        hillPaso2Panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jTextField1.setText("Mensaje a encriptar");
        jTextField1.setToolTipText("");
        hillPaso2Panel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 220, -1));

        jButton5.setText("Encriptar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        hillPaso2Panel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        jLabel13.setText("Mensaje encriptado:");
        hillPaso2Panel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        hillPaso2Panel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 220, -1));

        jTabbedPane1.addTab("Paso 2 de 3", hillPaso2Panel);

        hillPaso3Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Paso 3: Desencriptando");
        hillPaso3Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel11.setText("<html> Para desencriptar el mensaje \"HLDTQIHJDXWQCMAG\", utilizaremos la matriz inversa de la clave.  <br> Esto es posible porque una de las condiciones fue que la clave sea inversible. </html>");
        hillPaso3Panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel12.setText("<html> <ul> <li>Como el algoritmos utiliza  aritmetica de modulo, tenemos que hallar la <br>matriz inversa de la clave en modulo 26<br><br></li> <li>Separamos el texto en bloques de n=2 <br><br></li> <li>Determinarmos el valor numerico de cada letra y los alineamos <br>como vectores columnas.<br><br></li> <li>Multiplicamos cada uno de estos vectores por la matriz inversa hallada y <br>tomamos modulo 26 del resultado.<br><br></li> <li>Convertimos cada unos de los vectores obtenidos en vectores alfabeticos <br>y los combinamos para formar el texto original.<br><br></li> </ul> </html>");
        hillPaso3Panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        jLabel15.setText("Indrodusca un mensaje a desencriptar:");
        hillPaso3Panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        jTextField3.setText("mensaje encriptado");
        hillPaso3Panel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 260, -1));

        jLabel16.setText("Mensaje desencriptado:");
        hillPaso3Panel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, -1, -1));

        jTextField4.setText("mensaje");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        hillPaso3Panel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 260, -1));

        jButton6.setText("Desencriptar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        hillPaso3Panel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, -1, -1));

        jTabbedPane1.addTab("Paso 3 de 3", hillPaso3Panel);

        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setEnabledAt(2, true);
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setEnabledAt(1, true); 
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setEnabledAt(3, true);
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IntroHillPanel;
    private javax.swing.JPanel hillPaso1Panel;
    private javax.swing.JPanel hillPaso2Panel;
    private javax.swing.JPanel hillPaso3Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblHeaderPaso1;
    // End of variables declaration//GEN-END:variables
}
