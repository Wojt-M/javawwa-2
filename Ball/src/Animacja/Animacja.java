package Animacja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by W on 06.12.2016.
 */
public class Animacja implements ActionListener
{
    int x = 10;
    int y = 20;
    int ruchX = 5;
    int ruchY = 7;

    JFrame ramka;
    PanelWewnêtrzny panWew;
    JButton przycisk;

    public static void main(String[] args)
    {
        Animacja animacja = new Animacja();
        animacja.Run();
    }

    public void Run(){

    ramka = new JFrame();
    ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    przycisk = new JButton("Exit");
    panWew = new PanelWewnêtrzny();


    ramka.add(panWew);
    ramka.add(BorderLayout.SOUTH, przycisk);
    ramka.setResizable(false);
    ramka.setSize(800, 500);
    ramka.setVisible(true);

    Timer t = new Timer(20, this);
        t.start();
        
        
      przycisk.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			
			ramka.dispose();
		}
	});   
        
    }
    
   

    @Override
    public void actionPerformed(ActionEvent e)
    {

        x = x + ruchX;
        y = y + ruchY;
        if(y >=500 - 150){
            ruchY = -7;
        }

        if(x >= 800 - 100 ){
            ruchX = -5;
        }
        if(y <= 0){
            ruchY = 7;
        }
        if(x <= 0){
            ruchX = 5;
        }
        panWew.repaint();
    }

    class PanelWewnêtrzny extends JComponent{
        public void paintComponent(Graphics g){
            g.setColor(new Color (255, 98, 46));
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(new Color (66, 255, 90));
            g.fillOval(x, y, 100, 100);


        }
    }


}

