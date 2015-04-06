package basics.application;

import java.awt.EventQueue;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Application extends JFrame {
    
    public Application() {
        this.initUI();
    }

    private void initUI() {
        this.add(new Board());
        
        this.setSize(250, 200);
        this.setTitle("Application");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
                
            }
        });
    }
    
}
