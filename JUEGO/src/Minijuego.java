
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Minijuego {
    private boolean iniciado;
    boolean win;       
    panel p;
    WindowManager wm;
    JFrame v = new JFrame("Ventana");
    public Minijuego(WindowManager wm)
    {
        p = new panel(this);
        v.setSize(640, 480);
        v.add(p);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        win=false;
        
    }
    
    public void stop()
    {
        this.iniciado = false;
    }
    
    public void start()
    {
        v.setVisible(true);
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                iniciado = true;
                while (iniciado)
                {
                    p.repaint();
                    try {
                        Thread.sleep(20);
                    } catch(Exception e){}
                }
            }
        });
        t.start();
    }
}
