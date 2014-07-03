/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sala_
 */
public class Mapa extends javax.swing.JFrame {

    /**
     * Creates new form Mapa
     */
    WindowManager wm;
    public Mapa(WindowManager wm) {
        this.wm = wm;
        jugador a=wm.lobby.j;
        initComponents();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(200, 280, 20, 20);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(jButton4);
        jButton4.setBounds(160, 230, 20, 20);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(jButton5);
        jButton5.setBounds(80, 180, 20, 20);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(260, 180, 20, 20);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(jButton7);
        jButton7.setBounds(90, 70, 20, 20);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(jButton8);
        jButton8.setBounds(40, 110, 20, 20);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(jButton9);
        jButton9.setBounds(150, 40, 20, 20);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(210, 360, 20, 20);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(160, 360, 20, 20);

        jButton1.setText("Comprar Piloto");
        jPanel1.add(jButton1);
        jButton1.setBounds(263, 380, 110, 23);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(263, 430, 110, 23);

        jLabel1.setText("Tributos: ");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 280, 110, 20);

        jLabel3.setText("Pilotos: ");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 314, 100, 20);

        jLabel4.setText("Jugador");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(294, 10, 90, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mapa.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 400, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        wm.lobby.setVisible(true);
        wm.lobby.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    public void setbotones(jugador a){
        jButton3.setEnabled(a.isC1());
        jButton4.setEnabled(a.isC2());
        jButton5.setEnabled(a.isC3());
        jButton6.setEnabled(a.isC4());
        jButton7.setEnabled(a.isC5());
        jButton8.setEnabled(a.isC6());
        jButton9.setEnabled(a.isC7());
        jButton10.setEnabled(a.isC8());
        jButton11.setEnabled(a.isC9());
        jLabel4.setText("Jugador: "+a.getNombre());
        jLabel1.setText("Tributos: "+a.getPuntaje());
        jLabel3.setText("Pilotos: "+a.getPilotos() );
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
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
    // End of variables declaration//GEN-END:variables
}
