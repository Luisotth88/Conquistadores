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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
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
        jPanel1.add(jButton10);
        jButton10.setBounds(210, 360, 20, 20);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        jPanel1.add(jButton11);
        jButton11.setBounds(160, 360, 20, 20);

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

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
