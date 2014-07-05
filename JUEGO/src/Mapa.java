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
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(200, 280, 20, 20);

        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(b2);
        b2.setBounds(160, 230, 20, 20);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(b3);
        b3.setBounds(80, 180, 20, 20);

        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b4KeyPressed(evt);
            }
        });
        jPanel1.add(b4);
        b4.setBounds(260, 180, 20, 20);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(b5);
        b5.setBounds(90, 70, 20, 20);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(b6);
        b6.setBounds(40, 110, 20, 20);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(b7);
        b7.setBounds(150, 40, 20, 20);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);
        b8.setBounds(210, 360, 20, 20);

        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);
        b9.setBounds(160, 360, 20, 20);

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

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
       wm.minijuego.setVisible(true);
       wm.minijuego.go();
       wm.mapa.setVisible(false);
       if(wm.minijuego.win){
           System.out.println("wena");
       }
       
        
        
    }//GEN-LAST:event_b9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        wm.lobby.setVisible(true);
        wm.lobby.setLocationRelativeTo(null);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b4KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_b4KeyPressed
    public void setbotones(jugador a){
        b1.setEnabled(a.isC1());
        b2.setEnabled(a.isC2());
        b3.setEnabled(a.isC3());
        b4.setEnabled(a.isC4());
        b5.setEnabled(a.isC5());
        b6.setEnabled(a.isC6());
        b7.setEnabled(a.isC7());
        b8.setEnabled(a.isC8());
        b9.setEnabled(a.isC9());
        jLabel4.setText(a.getNombre());
        jLabel1.setText("Tributos: "+a.getPuntaje());
        jLabel3.setText("Pilotos: "+a.getPilotos() );
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
