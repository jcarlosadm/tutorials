package basics.donut;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        this.drawDonut(g);
    }

    private void drawDonut(Graphics g) {
        // TODO Auto-generated method stub
        
    }

}
