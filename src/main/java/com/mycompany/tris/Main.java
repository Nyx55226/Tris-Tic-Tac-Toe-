/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tris;
import com.github.weisj.darklaf.LafManager;
import com.github.weisj.darklaf.theme.IntelliJTheme;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author onryo_tsumi
 */
public class Main extends javax.swing.JFrame {
    private int punteggioGiocatore1=0;
    private int punteggioGiocatore2=0;
    ImageIcon X=new ImageIcon(getClass().getResource("/Img/x.png"));
    Image x=X.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH );
    ImageIcon O=new ImageIcon(getClass().getResource("/Img/o.png"));
    Image o=O.getImage().getScaledInstance(135, 135, Image.SCALE_SMOOTH);
    ImageIcon ImgWindows=new ImageIcon(getClass().getResource("/Img/icona.png"));
    Image imgWindows=ImgWindows.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
    private Game gioco=new Game();
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        LafManager.install(new IntelliJTheme());
        this.setIconImage(imgWindows);
        ((CardLayout)this.getContentPane().getLayout()).show(this.getContentPane(), "card2");
        GameI();
    }
    public void GameI(){
        jButton1.setIcon(new ImageIcon(x));
        jButton2.setIcon(new ImageIcon(o));
        jButton3.setIcon(new ImageIcon(o));
        jButton4.setIcon(new ImageIcon(o));
        jButton5.setIcon(new ImageIcon(x));
        jButton6.setIcon(new ImageIcon(x));
        jButton7.setIcon(new ImageIcon(x));
        jButton8.setIcon(new ImageIcon(o));
        jButton9.setIcon(new ImageIcon(o));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(450, 600));
        setMinimumSize(new java.awt.Dimension(450, 600));
        setPreferredSize(new java.awt.Dimension(450, 600));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 550));
        jPanel3.setMinimumSize(new java.awt.Dimension(450, 550));

        jPanel4.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel4.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel4.setLayout(new java.awt.GridLayout(3, 3));

        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(51, 102, 204)));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel4.add(jButton11);

        jButton12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(51, 102, 204)));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel4.add(jButton12);

        jButton13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 0, new java.awt.Color(51, 102, 204)));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel4.add(jButton13);

        jButton14.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 3, new java.awt.Color(51, 102, 204)));
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jPanel4.add(jButton14);

        jButton15.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 102, 204)));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel4.add(jButton15);

        jButton16.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(51, 102, 204)));
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel4.add(jButton16);

        jButton17.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 3, new java.awt.Color(51, 102, 204)));
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jPanel4.add(jButton17);

        jButton18.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 0, 3, new java.awt.Color(51, 102, 204)));
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jPanel4.add(jButton18);

        jButton19.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 0, 0, new java.awt.Color(51, 102, 204)));
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jPanel4.add(jButton19);

        jButton20.setBackground(new java.awt.Color(255, 187, 0));
        jButton20.setFont(new java.awt.Font("Cantarell", 1, 27)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 0, 128));
        jButton20.setText("RICOMINCIA");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 128));
        jLabel2.setText("Vittorie:");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 128));
        jLabel3.setText("X : 0");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 128));
        jLabel4.setText("O : 0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(75, 75, 75)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, "card3");

        jPanel1.setBackground(new java.awt.Color(255, 209, 164));
        jPanel1.setMaximumSize(new java.awt.Dimension(450, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(450, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 550));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 128));
        jLabel1.setText("Benvenuto");

        jPanel2.setBackground(new java.awt.Color(255, 209, 164));
        jPanel2.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setBackground(new java.awt.Color(255, 209, 164));
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 3, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 209, 164));
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 209, 164));
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 0, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 209, 164));
        jButton4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 3, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 209, 164));
        jButton5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 209, 164));
        jButton6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 209, 164));
        jButton7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 3, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 209, 164));
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 0, 3, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 209, 164));
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 0, 0, new java.awt.Color(51, 102, 204)));
        jPanel2.add(jButton9);

        jButton10.setBackground(new java.awt.Color(255, 187, 0));
        jButton10.setFont(new java.awt.Font("Cantarell", 1, 27)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 128));
        jButton10.setText("INIZIA");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        ((CardLayout)this.getContentPane().getLayout()).show(this.getContentPane(), "card3");
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
    if(jButton11.isEnabled())
        if(gioco.turno(0, 0)){
            char icona=gioco.getIcona(0, 0);
            if(icona=='X') jButton11.setIcon(new ImageIcon(x));
            else jButton11.setIcon(new ImageIcon(o));
            
            if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
                    
            }
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
    if(jButton12.isEnabled())
        if(gioco.turno(0, 1)){
            char icona=gioco.getIcona(0, 1);
            if(icona=='X') jButton12.setIcon(new ImageIcon(x));
            else jButton12.setIcon(new ImageIcon(o));
            
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
    if(jButton13.isEnabled())
        if(gioco.turno(0, 2)){
            char icona=gioco.getIcona(0, 2);
            if(icona=='X') jButton13.setIcon(new ImageIcon(x));
            else jButton13.setIcon(new ImageIcon(o));
            
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
    if(jButton14.isEnabled())
        if(gioco.turno(1, 0)){
            char icona=gioco.getIcona(1, 0);
            if(icona=='X') jButton14.setIcon(new ImageIcon(x));
            else jButton14.setIcon(new ImageIcon(o));
            
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
    if(jButton15.isEnabled())
        if(gioco.turno(1, 1)){
            char icona=gioco.getIcona(1, 1);
            if(icona=='X') jButton15.setIcon(new ImageIcon(x));
            else jButton15.setIcon(new ImageIcon(o));
            
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
    if(jButton16.isEnabled())
        if(gioco.turno(1, 2)){
            char icona=gioco.getIcona(1, 2);
            if(icona=='X') jButton16.setIcon(new ImageIcon(x));
            else jButton16.setIcon(new ImageIcon(o));
            
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
    if(jButton17.isEnabled())
        if(gioco.turno(2, 0)){
            char icona=gioco.getIcona(2, 0);
            if(icona=='X') jButton17.setIcon(new ImageIcon(x));
            else jButton17.setIcon(new ImageIcon(o));
            
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
    if(jButton18.isEnabled())
        if(gioco.turno(2, 1)){
            char icona=gioco.getIcona(2, 1);
            if(icona=='X') jButton18.setIcon(new ImageIcon(x));
            else jButton18.setIcon(new ImageIcon(o));
           
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
    if(jButton19.isEnabled())
        if(gioco.turno(2, 2)){
            char icona=gioco.getIcona(2, 2);
            if(icona=='X') jButton19.setIcon(new ImageIcon(x));
            else jButton19.setIcon(new ImageIcon(o));
            
             if(gioco.controlloVittoria(icona)){
                JOptionPane.showMessageDialog(this, "Grande! Tris completato da "+icona+"!","Complimenti",JOptionPane.NO_OPTION);
                if(icona=='X'){
                    punteggioGiocatore1++;
                    jLabel3.setText("X :"+punteggioGiocatore1);
                    fermaGioco(true);
                    
                }else{
                    punteggioGiocatore2++;
                    jLabel4.setText("O :"+punteggioGiocatore2);
                    fermaGioco(false);
                }
            }
        }
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        jButton11.setIcon(null);
        jButton12.setIcon(null);
        jButton13.setIcon(null);
        jButton14.setIcon(null);
        jButton15.setIcon(null);
        jButton16.setIcon(null);
        jButton17.setIcon(null);
        jButton18.setIcon(null);
        jButton19.setIcon(null);
        gioco.creazioneGriglia();
        iniziaGioco();
    }//GEN-LAST:event_jButton20MouseClicked
    private void fermaGioco(boolean a){
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        jButton19.setEnabled(false);
        gioco.setGiocatori(a);
        
    }
    private void iniziaGioco(){
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
