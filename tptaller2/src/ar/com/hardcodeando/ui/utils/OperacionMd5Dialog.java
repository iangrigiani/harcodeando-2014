/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.hardcodeando.ui.utils;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
/**
 *
 * @author estefi
 */
public class OperacionMd5Dialog extends JDialog {

    public OperacionMd5Dialog() {

        initUI();
    }

    public final void initUI() {

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 10)));

        ImageIcon icon = new ImageIcon("src/resources/md5/operacionMd5.png");
        JLabel label = new JLabel(icon);
        label.setAlignmentX(0.5f);
        add(label);

        add(Box.createRigidArea(new Dimension(0, 10)));
        add(Box.createRigidArea(new Dimension(0, 50)));

        JButton close = new JButton("Cerrar");
        close.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event) {
                dispose();
            }
        });

        close.setAlignmentX(0.5f);
        add(close);

        setModalityType(ModalityType.APPLICATION_MODAL);

        setTitle("Operación MD5");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(rootPane);
        setSize(600, 300);
    }
}
