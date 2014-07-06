import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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
public class NewJFrame extends javax.swing.JFrame {

    Timer t;

    int x1=0;
    int y1=0;
    int x2=0;
    int y2=0;
    int x3=0;
    int y3=0;
    int x4=0;
    int y4=0;
    int x5=0;
    int y5=0;
    int x6=0;
    int y6=0;
    int x7=0;
    int y7=0;
    int x8=0;
    int y8=0;
    int x9=0;
    int y9=0;
    int temp;
    String p = "perdedor";
    String g= "ganador";
    WindowManager wm;
    public NewJFrame(WindowManager wm) {
        this.wm=wm;
        initComponents();
        this.setLocationRelativeTo(null);
        setSize(490, 370);
        temp=100;
        
        
        
        
        
        
    }
    public void perdiste (){
        temp=100;
        if(wm.lobby.j.getPilotos()==0){
                        JOptionPane.showMessageDialog(null, "GAME OVER");
                        String a=wm.lobby.j.getNombre();
                        wm.lobby.j=new jugador(a,1000);
                        wm.login.escribir(wm.lobby.j);
                        wm.lobby.setVisible(true);
                        
                    }
        else{
            wm.lobby.j.setPilotos(wm.lobby.j.getPilotos()-1);
            JOptionPane.showMessageDialog(null, "Has perdido");
            wm.minijuego.setVisible(false);
            wm.mapa.setVisible(true);
            wm.mapa.setbotones(wm.lobby.j);
            
        }
    }
    public void go(final int c){
        y1=0;
        y2=0;
        y3=0;
        y4=0;
        y5=0;
        y6=0;
        y7=0;
        y8=0;
        y9=0;
        
        
        x1=posicionxaleatoria();
        x2=posicionxaleatoria();
        x3=posicionxaleatoria();
        x4=posicionxaleatoria();
        x5=posicionxaleatoria();
        x6=posicionxaleatoria();
        x7=posicionxaleatoria();
        x8=posicionxaleatoria();
        x9=posicionxaleatoria();
        
        t= new Timer(150, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                
                jLabel6.setLocation(x1,y1);
                jLabel7.setLocation(x2,y2);
                jLabel8.setLocation(x3,y3);
                jLabel9.setLocation(x4,y4);
                jLabel10.setLocation(x5,y5);
                jLabel11.setLocation(x6,y6);
                jLabel12.setLocation(x7,y7);
                jLabel13.setLocation(x8,y8);
                jLabel14.setLocation(x9,y9);
                
                y1+=20;
                y2+=10;
                y3+=15;
                y4+=20;
                y5+=10;
                y6+=15;
                y7+=25;
                y8+=30;
                y9+=10;
                
                temp-=1;
                jLabel3.setText("Temp: "+temp);
                if(jLabel6.getBounds().intersects(jLabel1.getBounds())||jLabel7.getBounds().intersects(jLabel1.getBounds())||jLabel8.getBounds().intersects(jLabel1.getBounds())||jLabel9.getBounds().intersects(jLabel1.getBounds())||jLabel10.getBounds().intersects(jLabel1.getBounds())||jLabel11.getBounds().intersects(jLabel1.getBounds())||jLabel12.getBounds().intersects(jLabel1.getBounds())||jLabel3.getBounds().intersects(jLabel1.getBounds())||jLabel14.getBounds().intersects(jLabel1.getBounds())){
                    t.stop();
                    perdiste();
                }
                
                if(jLabel6.getLocation().getY()>=370){
                    x1=posicionxaleatoria();
                    y1=0;
                    jLabel6.setLocation(x1,y1);
                }
                if(jLabel7.getLocation().getY()>=370){
                    x2=posicionxaleatoria();
                    y2=0;
                    jLabel7.setLocation(x2,y2);
                }
                if(jLabel8.getLocation().getY()>=370){
                    x3=posicionxaleatoria();
                    y3=0;
                    jLabel8.setLocation(x3,y3);
                }
                if(jLabel9.getLocation().getY()>=370){
                    x4=posicionxaleatoria();
                    y4=0;
                    jLabel9.setLocation(x4,y4);
                }
                if(jLabel10.getLocation().getY()>=370){
                    x5=posicionxaleatoria();
                    y5=0;
                    jLabel10.setLocation(x5,y5);
                }
                if(jLabel11.getLocation().getY()>=370){
                    x6=posicionxaleatoria();
                    y6=0;
                    jLabel11.setLocation(x6,y6);
                }
                if(jLabel12.getLocation().getY()>=370){
                    x7=posicionxaleatoria();
                    y7=0;
                    jLabel12.setLocation(x7,y7);
                }
                if(jLabel13.getLocation().getY()>=370){
                    x8=posicionxaleatoria();
                    y8=0;
                    jLabel13.setLocation(x8,y8);
                }
                if(jLabel14.getLocation().getY()>=370){
                    x9=posicionxaleatoria();
                    y9=0;
                    jLabel14.setLocation(x9,y9);
                }
                if(temp==0){
                    temp=100;
                    t.stop();
                    
                    switch(c){
                        
                        case 9:
                            wm.mapa.b9.setVisible(false);
                            wm.mapa.b1.setEnabled(true);
                            wm.mapa.b8.setEnabled(true);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC9(false);
                            wm.lobby.j.setC1(true);
                            wm.lobby.j.setC8(true);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+300*wm.lobby.j.getPilotos());
                            break;
                        case 2:
                            wm.mapa.b2.setVisible(false);
                            wm.mapa.b4.setEnabled(true);
                            wm.mapa.b1.setEnabled(true);
                            wm.lobby.j.setC2(false);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setC1(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+200*wm.lobby.j.getPilotos());
                            break;
                        case 3:
                            wm.mapa.b3.setVisible(false);
                            wm.mapa.b4.setEnabled(true);
                            wm.mapa.b6.setEnabled(true);
                            wm.lobby.j.setC3(false);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setC6(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+200*wm.lobby.j.getPilotos());
                            break;
                        case 4:
                            wm.mapa.b4.setVisible(false);
                            wm.mapa.b8.setEnabled(true);
                            wm.mapa.b1.setEnabled(true);
                            wm.mapa.b5.setEnabled(true);
                            wm.mapa.b7.setEnabled(true);
                            wm.lobby.j.setC4(false);
                            wm.lobby.j.setC8(true);
                            wm.lobby.j.setC1(true);
                            wm.lobby.j.setC5(true);
                            wm.lobby.j.setC7(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+400*wm.lobby.j.getPilotos());
                            break;
                        case 5:
                            //764
                            wm.mapa.b5.setVisible(false);
                            wm.mapa.b7.setEnabled(true);
                            wm.mapa.b6.setEnabled(true);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC5(false);
                            wm.lobby.j.setC7(true);
                            wm.lobby.j.setC6(true);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+300*wm.lobby.j.getPilotos());
                            break;
                        case 6:
                            wm.mapa.b6.setVisible(false);
                            wm.mapa.b5.setEnabled(true);
                            wm.lobby.j.setC6(false);
                            wm.lobby.j.setC5(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+100*wm.lobby.j.getPilotos());
                            break;
                        case 7:
                            //5 y 4
                            wm.mapa.b7.setVisible(false);
                            wm.mapa.b5.setEnabled(true);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC7(false);
                            wm.lobby.j.setC5(true);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+200*wm.lobby.j.getPilotos());
                            break;
                        case 8:
                            wm.mapa.b8.setVisible(false);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC8(false);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+100*wm.lobby.j.getPilotos());
                            break;
                            
                            
                    }
                    JOptionPane.showMessageDialog(null, "Territorio Conquistado!");
                    wm.mapa.setbotones(wm.lobby.j);
                    wm.minijuego.setVisible(false);
                    wm.mapa.setVisible(true);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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
        jLabel6.setBounds(340, 60, 12, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plane.gif"))); // NOI18N
        jLabel1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jLabel1MouseWheelMoved(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 270, 28, 37);

        jLabel3.setText("CRONOMETRO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 80, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 60, 10, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(140, 10, 12, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(100, 60, 10, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 10, 10, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(220, 10, 10, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(160, 60, 10, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(370, 20, 10, 30);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(220, 60, 10, 30);

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

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((int)jLabel1.getLocation().getX()>= 120){
            jLabel1.setLocation((int)jLabel1.getLocation().getX()-10,(int)jLabel1.getLocation().getY());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if((int)jLabel1.getLocation().getX()<= 360){
            jLabel1.setLocation((int)jLabel1.getLocation().getX()+10,(int)jLabel1.getLocation().getY());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed

    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jLabel1MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseWheelMoved
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABAJO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables


    
    public static int posicionxaleatoria(){
        int a;
        do{
            a=((int)(Math.random()*1000))%370;
        }while(a<100);
        return a;
    }
            //100 370
}
