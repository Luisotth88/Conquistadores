
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author javier
 */
public class avion {
    int x,y,w,h;
    panel p;
    boolean vivo = true;
    
    public avion(int x, int y, panel p) {
        this.x = x;
        this.y = y;
        this.p = p;
        this.w = 100;
        this.h = 350;
    }
    
    public void checkVida()
    {
        if (!vivo) return;
        for (bomba b : p.bombas)
        {
            int bcx = b.x + b.w/2;
            int pcx = x + w/2;
            int bcy = b.y + b.h/2;
            int pcy = y + h/2;
            
            if (Math.abs(bcx - pcx) <  b.w/2 + w/2 && Math.abs(bcy - pcy) <  b.h/2 + h/2){
                vivo = false;
                b.x=1000;
                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        try { Thread.sleep(3000);}catch(Exception e){}
                    vivo = true;
                    }
                }).start();
                return;
            }
        }
    }
    
    public void pintar(Graphics g)
    {
        checkVida();
        if (vivo)
        {
            g.setColor(Color.GREEN);
        }
        else
        {
            g.setColor(Color.red);
        }
        g.fillRect(x, y, w, h);
    }
}
