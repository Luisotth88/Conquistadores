import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//230X 260Y
/**
 *
 * @author Diego
 */
public class NewJFrame extends javax.swing.JFrame implements KeyListener{

    Timer t;
    int y=0;
    int x=posicionxaleatoria();
    boolean win=false;
    public NewJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(490, 370);
        jLabel6.setLocation(245,0);
        
        t= new Timer(50, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jLabel6.setLocation(x,y);
                y+=5;
                jLabel6.getBounds().intersects(jLabel1.getBounds());
                if(jLabel6.getBounds().intersects(jLabel1.getBounds())){
                    JOptionPane.showMessageDialog(null,"Perdedor ajaja");
                    t.stop();
                }
            }
        });
        t.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ABAJO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setText("<<<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 290, 57, 23);

        jButton2.setText(">>>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(400, 290, 57, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 30, 30, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plane.gif"))); // NOI18N
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 270, 30, 40);

        jLabel3.setText("CRONOMETRO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 80, 30);

        ABAJO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/11.jpg"))); // NOI18N
        jPanel1.add(ABAJO);
        ABAJO.setBounds(0, 0, 490, 340);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_LEFT){
            jLabel1.setLocation((int)jLabel1.getLocation().getX()-10,(int)jLabel1.getLocation().getY());
            
        }
        if (evt.getKeyCode()==KeyEvent.VK_RIGHT){
            jLabel1.setLocation((int)jLabel1.getLocation().getX()+10,(int)jLabel1.getLocation().getY());
        }
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((int)jLabel1.getLocation().getX()>= 120){
            jLabel1.setLocation((int)jLabel1.getLocation().getX()-10,(int)jLabel1.getLocation().getY());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if((int)jLabel1.getLocation().getX()<=350){
            jLabel1.setLocation((int)jLabel1.getLocation().getX()+10,(int)jLabel1.getLocation().getY());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABAJO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static int posicionxaleatoria(){
        int a;
        do{
            a=((int)(Math.random()*1000))%370;
        }while(a<100);
        return a;
    }
            //100 370
}
