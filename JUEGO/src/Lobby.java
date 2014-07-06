
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sala_
 */
public class Lobby extends javax.swing.JFrame {

    /**
     * Creates new form Lobby
     */
    jugador j;
    WindowManager wm;
    public Lobby(WindowManager wm) {
        this.wm = wm;
        initComponents();
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
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 150, 120, 23);

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 200, 120, 23);

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 250, 120, 23);

        jLabel3.setText("Cargar para continuar con el usuario guardado anteriormente y");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 30, 330, 14);

        jLabel4.setText("Presione boton Iniciar para crear un nuevo usuario y comenzar partida,");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 10, 360, 14);

        jLabel5.setText("Salir para volver a Windows");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 50, 330, 14);

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel6.setText("Conquistadores");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(170, 260, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lobby.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-90, -30, 540, 370);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        wm.login.setVisible(true);
        wm.login.setLocationRelativeTo(null);
        this.setVisible(false);
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        j=leer();
        wm.mapa.setbotones(j);
        wm.mapa.setVisible(true);
        wm.mapa.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    public jugador leer(){
         
         File file = new File("save.txt");
         FileInputStream fis = null;
         BufferedInputStream bis = null;
         DataInputStream dis = null;
         String split=";";
         String[] linea=new String[20];
         jugador d=null;
         try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);   
            while (dis.available() != 0) {
                linea = dis.readLine().split(split);}
                d=new jugador(linea[0],Integer.parseInt(linea[1]),Long.parseLong(linea[2]),Boolean.parseBoolean(linea[3]),Boolean.parseBoolean(linea[4]),
                Boolean.parseBoolean(linea[5]),Boolean.parseBoolean(linea[6]),Boolean.parseBoolean(linea[7]),Boolean.parseBoolean(linea[8]),
                  Boolean.parseBoolean(linea[9]),Boolean.parseBoolean(linea[10]),Boolean.parseBoolean(linea[11]));                                  
           }catch (IOException e) {
			e.printStackTrace();
             }
           return d;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
