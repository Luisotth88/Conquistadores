
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JPanel;

/**
 *
 * @author javier
 */
public class panel extends JPanel implements MouseListener{

    Minijuego m;
    LinkedList<bomba> bombas;
    avion avion;
    public panel(Minijuego m)
    {
        super();
        setSize(640, 480);
        addMouseListener(this);
        this.m = m;
        this.avion = new avion(200,200,this);
        bombas = new LinkedList<>();
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        pintarbomba(g);
        avion.pintar(g);
    }
    
    public void pintarbomba(Graphics g)
    {
        bomba b;
        Iterator<bomba> iter = bombas.iterator();
        while (iter.hasNext())
        {
            b = iter.next();
            if (b.x >= 640)
            {
                iter.remove();
            }
            else
            {
                b.pintar(g);
            }
        }
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        bomba b = new bomba(e.getX(),e.getY(),this);
        b.disparar();
        bombas.add(b);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    
}
