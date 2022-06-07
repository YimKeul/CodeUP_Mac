
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseeventEx {
   static class MyGUI extends JFrame{
      MyGUI(){
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         setTitle("마우스이벤트처리");
         
         setLayout(new FlowLayout());
         
         JLabel lab1 = new JLabel("Hello");
         lab1.setBounds(0, 0, 0, 0);
         this.add(lab1);
         
         this.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
               lab1.setLocation(e.getX()-25,e.getY()-50);
            }
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
         });
         
         setSize(500,200);
         setVisible(true);
      }
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new MyGUI();
   }

}