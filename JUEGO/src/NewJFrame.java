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
        
        x1=posicionxaleatoria();
        x2=posicionxaleatoria();
        x3=posicionxaleatoria();
        x4=posicionxaleatoria();
        x5=posicionxaleatoria();
        t= new Timer(150, new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                
                jLabel6.setLocation(x1,y1);
                jLabel7.setLocation(x2,y2);
                jLabel8.setLocation(x3,y3);
                jLabel9.setLocation(x4,y4);
                jLabel10.setLocation(x5,y5);
                y1+=5;y2+=10;y3+=15;y4+=5;y5+=10;
                temp-=1;
                jLabel3.setText("Temp: "+temp);
                if(jLabel6.getBounds().intersects(jLabel1.getBounds())){
                    JOptionPane.showMessageDialog(null,p);
                    t.stop();
                    wm.minijuego.setVisible(false);
                    perdiste();
                    
                    
                }
                if(jLabel7.getBounds().intersects(jLabel1.getBounds())){
                    JOptionPane.showMessageDialog(null,p);
                    t.stop();
                   wm.minijuego.setVisible(false);
                   perdiste();
                }
                if(jLabel8.getBounds().intersects(jLabel1.getBounds())){
                    JOptionPane.showMessageDialog(null,p);
                    t.stop();
                    wm.minijuego.setVisible(false);
                    perdiste();
                }
                if(jLabel9.getBounds().intersects(jLabel1.getBounds())){
                    JOptionPane.showMessageDialog(null,p);
                    t.stop();
                    wm.minijuego.setVisible(false);
                    perdiste();
                }
                if(jLabel10.getBounds().intersects(jLabel1.getBounds())){
                    JOptionPane.showMessageDialog(null,p);
                    t.stop();
                    wm.minijuego.setVisible(false);
                    perdiste();
                }
                if(jLabel6.getLocation().getY()==370){
                    x1=posicionxaleatoria();
                    y1=0;
                    jLabel6.setLocation(x1,y1);
                }
                if(jLabel7.getLocation().getY()==370){
                    x2=posicionxaleatoria();
                    y2=0;
                    jLabel7.setLocation(x2,y2);
                }
                if(jLabel8.getLocation().getY()==370){
                    x3=posicionxaleatoria();
                    y3=0;
                    jLabel8.setLocation(x3,y3);
                }
                if(jLabel9.getLocation().getY()==370){
                    x4=posicionxaleatoria();
                    y4=0;
                    jLabel9.setLocation(x4,y4);
                }
                if(jLabel10.getLocation().getY()==370){
                    x5=posicionxaleatoria();
                    y5=0;
                    jLabel10.setLocation(x5,y5);
                }
                if(temp==0){
                    temp=100;
                    JOptionPane.showMessageDialog(null,g);
                    t.stop();
                    
                    switch(c){
                        
                        case 9:
                            wm.mapa.b9.setEnabled(false);
                            wm.mapa.b1.setEnabled(true);
                            wm.mapa.b8.setEnabled(true);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC9(false);
                            wm.lobby.j.setC1(true);
                            wm.lobby.j.setC8(true);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+30*wm.lobby.j.getPilotos());
                            break;
                        case 2:
                            wm.mapa.b2.setEnabled(false);
                            wm.mapa.b4.setEnabled(true);
                            wm.mapa.b1.setEnabled(true);
                            wm.lobby.j.setC2(false);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setC1(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+20*wm.lobby.j.getPilotos());
                            break;
                        case 3:
                            wm.mapa.b3.setEnabled(false);
                            wm.mapa.b4.setEnabled(true);
                            wm.mapa.b6.setEnabled(true);
                            wm.lobby.j.setC3(false);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setC6(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+20*wm.lobby.j.getPilotos());
                            break;
                        case 4:
                            wm.mapa.b4.setEnabled(false);
                            wm.mapa.b8.setEnabled(true);
                            wm.mapa.b1.setEnabled(true);
                            wm.mapa.b5.setEnabled(true);
                            wm.mapa.b7.setEnabled(true);
                            wm.lobby.j.setC4(false);
                            wm.lobby.j.setC8(true);
                            wm.lobby.j.setC1(true);
                            wm.lobby.j.setC5(true);
                            wm.lobby.j.setC7(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+40*wm.lobby.j.getPilotos());
                            break;
                        case 5:
                            //764
                            wm.mapa.b5.setEnabled(false);
                            wm.mapa.b7.setEnabled(true);
                            wm.mapa.b6.setEnabled(true);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC5(false);
                            wm.lobby.j.setC7(true);
                            wm.lobby.j.setC6(true);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+30*wm.lobby.j.getPilotos());
                            break;
                        case 6:
                            wm.mapa.b6.setEnabled(false);
                            wm.mapa.b5.setEnabled(true);
                            wm.lobby.j.setC6(false);
                            wm.lobby.j.setC5(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+10*wm.lobby.j.getPilotos());
                            break;
                        case 7:
                            //5 y 4
                            wm.mapa.b7.setEnabled(false);
                            wm.mapa.b5.setEnabled(true);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC7(false);
                            wm.lobby.j.setC5(true);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+20*wm.lobby.j.getPilotos());
                            break;
                        case 8:
                            wm.mapa.b8.setEnabled(false);
                            wm.mapa.b4.setEnabled(true);
                            wm.lobby.j.setC8(false);
                            wm.lobby.j.setC4(true);
                            wm.lobby.j.setPuntaje(wm.lobby.j.getPuntaje()+10*wm.lobby.j.getPilotos());
                            break;
                            
                            
                    }
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
        jLabel6.setBounds(310, 30, 30, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plane.gif"))); // NOI18N
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 270, 28, 40);

        jLabel3.setText("CRONOMETRO");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 80, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(220, 30, 30, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(170, 30, 30, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 30, 30, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/misil.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 30, 30, 40);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ABAJO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
