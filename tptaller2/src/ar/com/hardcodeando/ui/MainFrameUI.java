/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.hardcodeando.ui;

import ar.com.hardcodeando.dto.HillDTO;
import ar.com.hardcodeando.dto.MD5DTO;
import ar.com.hardcodeando.ui.utils.AlgorithmStateStorage;
import java.awt.BorderLayout;
import javax.swing.JComponent;

import java.awt.Dimension;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Nestor
 */
public class MainFrameUI extends javax.swing.JFrame {

    /**
     * Creates new form MainFrameUI
     */
    public MainFrameUI() {
        initComponents();
        JPanel statusPanel = new JPanel();
        statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        this.add(statusPanel, BorderLayout.SOUTH);
        statusPanel.setPreferredSize(new Dimension(this.getWidth(), 16));
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
        JLabel statusLabel = new JLabel("status");
        statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
        statusPanel.add(statusLabel);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(new Dimension(1024, 700));
    }
   
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        fileChooser = new javax.swing.JFileChooser();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        fileChooser.setCurrentDirectory(new java.io.File("/"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(800, 600));
        jLayeredPane1.setLayout(new java.awt.BorderLayout());
        jLayeredPane1.add(jScrollPane1, java.awt.BorderLayout.LINE_END);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        jMenu3.setText("Algoritmos");

        jMenu5.setText("Hill Cipher");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu5MousePressed(evt);
            }
        });

        jMenuItem4.setText("Aprender");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem4MousePressed(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Autoevaluar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenu3.add(jMenu5);

        jMenu7.setText("NLFSR");

        jMenuItem6.setText("Aprender");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem6MousePressed(evt);
            }
        });
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem7.setText("Autoevaluar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenu3.add(jMenu7);

        jMenu8.setText("DES");

        jMenuItem8.setText("Aprender");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem8MousePressed(evt);
            }
        });
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuItem9.setText("Autoevaluar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenu3.add(jMenu8);

        jMenu6.setText("RSA");

        jMenuItem10.setText("Aprender");
        jMenuItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem10MousePressed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Autoevaluar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenu3.add(jMenu6);

        jMenu2.setText("MD5");

        jMenuItem12.setText("Aprender");
        jMenuItem12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem12MousePressed(evt);
            }
        });
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Autoevaluar");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenu3.add(jMenu2);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Historial");

        jMenuItem1.setText("Abrir Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        removeCurrentComponent();
        if (this.hEvaluarPanel == null) {
            this.hEvaluarPanel = new HillEvaluarPanel();
        }
        this.currentComponent = this.hEvaluarPanel;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        removeCurrentComponent();
        if (this.hpanel == null) {
            this.hpanel = new HillPanel();
        }
        this.currentComponent = this.hpanel;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        removeCurrentComponent();
        if (this.rpanelautoev == null) {
            this.rpanelautoev = new RSAPanelAutoevaluar();
        }
        this.currentComponent = this.rpanelautoev;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
       removeCurrentComponent();
        if (this.md5EvaluarPanel == null) {
            this.md5EvaluarPanel = new MD5PanelEvaluar();
        }
        this.currentComponent = this.md5EvaluarPanel;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12MouseClicked

    }//GEN-LAST:event_jMenuItem12MouseClicked

    private void jMenuItem12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem12MousePressed
        removeCurrentComponent();
        if (this.md5panel == null) {
            this.md5panel = new MD5Panel();
        }
        this.currentComponent = this.md5panel;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem12MousePressed

    private void insertCurrentComponent() {
        this.add(this.currentComponent, BorderLayout.CENTER);
        this.currentComponent.setVisible(true);
        this.currentComponent.setEnabled(true);
        this.setVisible(true);
    }

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1ActionPerformed

    private void jMenu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5MousePressed

    private void jMenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MousePressed
        
        this.showHillPanelAutoevaluar(null);
        //jLabel1.setVisible(false);
    }//GEN-LAST:event_jMenuItem4MousePressed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        removeCurrentComponent();
        if (this.dPanelEvaluar == null) {
            this.dPanelEvaluar = new DesPanelEvaluar();
        }
        this.currentComponent = this.dPanelEvaluar;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MousePressed
        removeCurrentComponent();
        if (this.dpanel == null) {
            this.dpanel = new DesPanel();
        }
        this.currentComponent = this.dpanel;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem8MousePressed

    private void jMenuItem10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem10MousePressed
        removeCurrentComponent();
        if (this.rpanel == null) {
            this.rpanel = new RSAPanel();
        }
        this.currentComponent = this.rpanel;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem10MousePressed

    private void jMenuItem6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MousePressed
        removeCurrentComponent();
        if (this.npanel == null) {
            this.npanel = new NLFSRAprender();
        }
        this.currentComponent = this.npanel;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem6MousePressed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        removeCurrentComponent();
        if (this.nEvaluar == null) {
            this.nEvaluar = new NLFSREvaluar();
        }
        this.currentComponent = this.nEvaluar;
        insertCurrentComponent();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String type = AlgorithmStateStorage.getType(file.getAbsolutePath());
            switch (type) {
                case AlgorithmStateStorage.ALGO_HILL:  
                     HillDTO hillDTO = AlgorithmStateStorage.loadHill(file.getAbsolutePath());
                     showHillPanelAutoevaluar(hillDTO);
                     break;
                case AlgorithmStateStorage.ALGO_NLFRS:  //TODO:
                     break;
                case AlgorithmStateStorage.ALGO_DES:  //TODO:
                     break;
                case AlgorithmStateStorage.ALGO_RSA:  //TODO:
                     break;
                case AlgorithmStateStorage.ALGO_MD5:  
                     MD5DTO md5DTO = AlgorithmStateStorage.loadMD5(file.getAbsolutePath());
                     showMD5PanelAutoevaluar(md5DTO);
                     break;
                default:  //TODO: mostrar mensaje diciendo que no se puede levantar el archivo/el archivo no corresponde al formato de ningun algoritmo
                    System.out.println("ESTRUCTURA DEL ALGORITMO INVALIDA");
                     break;
            }
        } else {
             System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(MainFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrameUI().setVisible(true);              
            }
        });
    }

    private HillPanel hpanel=null;
    private HillEvaluarPanel hEvaluarPanel=null;
    private MD5Panel md5panel=null;
    private MD5PanelEvaluar md5EvaluarPanel=null;
    private DesPanel dpanel=null;
    private DesPanelEvaluar dPanelEvaluar=null;
    private RSAPanel rpanel = null;
    private RSAPanelAutoevaluar rpanelautoev = null;
    private NLFSRAprender npanel = null;
    private NLFSREvaluar nEvaluar = null;
    private JComponent currentComponent=null;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables

    
    
    private void showHillPanelAutoevaluar(HillDTO hillDTO) {
        removeCurrentComponent();
        this.hEvaluarPanel = new HillEvaluarPanel();

        if (hillDTO != null) {
            this.hEvaluarPanel.load(hillDTO);
        }

        this.currentComponent = hEvaluarPanel;
        insertCurrentComponent();
    }
    
    private void showMD5PanelAutoevaluar(MD5DTO md5DTO) {
        removeCurrentComponent();
        this.md5EvaluarPanel = new MD5PanelEvaluar();

        if (md5DTO != null) {
            this.md5EvaluarPanel.load(md5DTO);
        }

        this.currentComponent = md5EvaluarPanel;
        insertCurrentComponent();
    }

    private void removeCurrentComponent() {
        if(this.currentComponent!=null){
            this.currentComponent.setVisible(false);
            this.currentComponent.setEnabled(false);
            this.remove(this.currentComponent);
        }
    }
}
