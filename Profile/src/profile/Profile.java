/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profile;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Font.*;
import java.awt.Color.*;
import javafx.scene.control.TextArea;
import javax.swing.JScrollPane;

/**
 *
 * @author sistem
 */
public class Profile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aku km = new Aku();
    }

}

class Aku extends JFrame {

    JScrollPane scroll;
    JLabel intro = new JLabel("BIODATA DIRI");
    JLabel img;
    JLabel nama = new JLabel("RIDKA SIWI");
    JLabel ttl = new JLabel("NGANJUK, 16 MARET 2000");
    String[] agamaya
            = {"ISLAM", "KRISTEN", "KATOLIK", "HINDU", "BUDHA", "KONGHUCU"};
    JComboBox agamasi = new JComboBox(agamaya);

    JRadioButton jk1 = new JRadioButton("L");
    JRadioButton jk2 = new JRadioButton("P");
    JLabel alamat = new JLabel("A L A M A T");
    JTextArea ta = new JTextArea();
    JButton edit = new JButton("EDIT");
    JButton save = new JButton("SAVE");

    public Aku() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 1000);
        getContentPane().setBackground(Color.black);

        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        img = new JLabel(new ImageIcon(getClass().getResource("kk.jpeg")));
        intro.setFont(new Font("Lucida Calligraphy", 0, 17));
        intro.setForeground(Color.WHITE);
        nama.setForeground(Color.WHITE);
        ttl.setForeground(Color.WHITE);
        alamat.setForeground(Color.WHITE);
        alamat.setFont(new Font("Arial", 0, 18));

        ButtonGroup group = new ButtonGroup();
        group.add(jk1);
        group.add(jk2);
        setLayout(null);
        add(intro);
        add(img);
        add(nama);
        add(ttl);
        add(agamasi);
        add(jk1);
        add(jk2);
        add(alamat);
        add(scroll);
        add(edit);
        add(save);

        intro.setBounds(120, 10, 210, 20);
        img.setBounds(70, 40, 250, 320);
        nama.setBounds(160, 380, 200, 20);
        ttl.setBounds(120, 400, 200, 20);
        agamasi.setBounds(70, 430, 260, 23);
        jk1.setBounds(100, 470, 40, 20);
        jk2.setBounds(250, 470, 40, 20);
        alamat.setBounds(150, 510, 120, 20);
        scroll.setBounds(60, 540, 280, 150);
        edit.setBounds(70, 700, 80, 30);
        save.setBounds(250, 700, 80, 30);

        
        setVisible(true);
        setLocation(400, 0);
    }

}
