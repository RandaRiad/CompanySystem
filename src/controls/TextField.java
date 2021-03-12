/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import java.awt.Graphics;
import javax.swing.JTextField;

/**
 *
 * @author dfz6
 */
public class TextField extends JTextField  {
    
   
    public TextField(int size){
        super(size);
        setOpaque(false);
    }
    @Override
    protected void paintComponent (Graphics g){
      
        g.setColor(getBackground());
        g.fillRoundRect(0, 0,getWidth(), getHeight(), 20, 20);
        super.paintComponent(g);
    }
    
    
    
    
    
    
}
