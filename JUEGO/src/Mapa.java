
import javax.swing.JOptionPane;

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
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ABAJO = new javax.swing.JLabel();

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
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);
        b2.setBounds(160, 230, 20, 20);

        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
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
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);
        b5.setBounds(90, 70, 20, 20);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);
        b6.setBounds(40, 110, 20, 20);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/attack.png"))); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 440, 160, 23);

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 500, 160, 23);

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(230, 470, 160, 23);

        jLabel1.setText("Tributos: ");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 240, 110, 20);

        jLabel2.setText("Precio Piloto:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 400, 160, 30);

        jLabel3.setText("Pilotos: ");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 260, 100, 20);

        jLabel4.setText("Jugador");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(234, 10, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel5.setText("Conquista todo el ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 290, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel6.setText("continente sudameri-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 310, 130, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel7.setText("cano.");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 330, 130, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel8.setText("Los pilotos son los");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 350, 140, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel9.setText("intentos restantes.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 370, 160, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel10.setText("Guardar la partida");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 390, 140, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel11.setText("te permite guardar ");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 410, 170, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel12.setText("los territorios ya ");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 430, 170, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel13.setText("conquistados y");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 450, 170, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel14.setText("continuar en otro");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(10, 470, 170, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel15.setText("momento");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 490, 170, 20);

        ABAJO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mapa.png"))); // NOI18N
        jPanel1.add(ABAJO);
        ABAJO.setBounds(0, 0, 400, 540);

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
        wm.minijuego.setVisible(true);
       wm.minijuego.go(4);
       wm.mapa.setVisible(false);
    }//GEN-LAST:event_b4ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
         wm.mapa.setVisible(false);
         wm.minijuego.setVisible(true);
         wm.minijuego.go(9);
       
    }//GEN-LAST:event_b9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        wm.lobby.setVisible(true);
        wm.lobby.setLocationRelativeTo(null);
        
        //wm.minijuego.jLabel1.setSize([28, 37]);tamaño minimo, se le puede agregar tamaño y asi aumente la dificultad
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        wm.mapa.setVisible(false);
        wm.minijuego.setVisible(true);
        wm.minijuego.go(8);
       
    }//GEN-LAST:event_b8ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        wm.mapa.setVisible(false);
        wm.minijuego.setVisible(true);
       wm.minijuego.go(1);
       
    }//GEN-LAST:event_b1ActionPerformed

    private void b4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b4KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_b4KeyPressed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        wm.mapa.setVisible(false);
        wm.minijuego.setVisible(true);
       wm.minijuego.go(7);
       
    }//GEN-LAST:event_b7ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       wm.mapa.setVisible(false);
        wm.minijuego.setVisible(true);
       wm.minijuego.go(5);
       
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        wm.mapa.setVisible(false);
        wm.minijuego.setVisible(true);
       wm.minijuego.go(6);
       
    }//GEN-LAST:event_b6ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
       wm.mapa.setVisible(false);
        wm.minijuego.setVisible(true);
       wm.minijuego.go(3);
       
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        wm.mapa.setVisible(false);
        wm.minijuego.setVisible(true);
       wm.minijuego.go(2);
    }//GEN-LAST:event_b2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        wm.login.escribir(wm.lobby.j);
        JOptionPane.showMessageDialog(null, "Guardado con éxito");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:10-p*100
        int p = (10-wm.lobby.j.getPilotos())*100;
        if(wm.lobby.j.getPilotos()<5){
            jLabel2.setText("Precio $"+p); 
            if(wm.lobby.j.puntaje>=p){
                wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()-p);
                wm.lobby.j.setPilotos(wm.lobby.j.getPilotos()+1);
                this.setbotones(wm.lobby.j);
            }
        }else{
            jLabel2.setText("Pilotos no disponibles"); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int p = (10-wm.lobby.j.getPilotos())*100;
        if(wm.lobby.j.getPilotos()<5){
            jLabel2.setText("Precio $"+p);
        }else{
            jLabel2.setText("Pilotos no disponibles"); 
        }
    }//GEN-LAST:event_jLabel2MouseClicked
    public void setbotones(jugador a){
        
        if(a.isC1()==true){
            b1.setVisible(false);
            b4.setEnabled(true);
            b8.setEnabled(true);
            b4.setVisible(true);
            b8.setVisible(true);
        }
        if(a.isC2()==true){
            b2.setVisible(false);
            b4.setEnabled(true);
            b1.setEnabled(true);
            b4.setVisible(true);
            b1.setVisible(true);
        }
        if(a.isC3()==true){
            b3.setVisible(false);
            b4.setEnabled(true);
            b6.setEnabled(true);
            b4.setVisible(true);
            b6.setVisible(true);
        }
        if(a.isC4()==true){
            b4.setVisible(false);
           b1.setEnabled(true);
            b5.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b1.setVisible(true);
            b5.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
        }
        if(a.isC5()==true){
            b5.setVisible(false);
            b4.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b4.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
        }
        if(a.isC6()==true){
            b6.setVisible(false);
            b5.setEnabled(true);
            b5.setVisible(true);
        }
        if(a.isC7()==true){
            b7.setVisible(false);
            b5.setEnabled(true);
            b4.setEnabled(true);
            b5.setVisible(true);
            b4.setVisible(true);
        }
        if(a.isC8()==true){
            b8.setVisible(false);
            b4.setEnabled(true);
            b4.setVisible(true);
        }
        if(a.isC9()==true){
            b9.setVisible(false);
            b1.setEnabled(true);
            b4.setEnabled(true);
            b8.setEnabled(true);
            b1.setVisible(true);
            b4.setVisible(true);
            b8.setVisible(true);
        }
        jLabel4.setText("Jugador: "+a.getNombre());
        jLabel1.setText("Tributos: "+a.getPuntaje());
        jLabel3.setText("Pilotos: "+a.getPilotos() );
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABAJO;
    public javax.swing.JButton b1;
    public javax.swing.JButton b2;
    public javax.swing.JButton b3;
    public javax.swing.JButton b4;
    public javax.swing.JButton b5;
    public javax.swing.JButton b6;
    public javax.swing.JButton b7;
    public javax.swing.JButton b8;
    public javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
