import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
public class SwingEvent{
    public SwingEvent(){
        JFrame jf = new JFrame("An Event Example");
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JButton a = new JButton("OK");
        a.setBounds(10,10,25,25);
        JButton b = new JButton("CANCEL");
        a.setBounds(10,45,25,25);
        JLabel l = new JLabel("Push a button");
        l.setBounds(45,80,25,25);
        jf.add(a);
        jf.add(b);
        jf.add(l);
        jf.setSize(220,90);
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JLabel o = new JLabel("OK pressed");
                o.setBounds(80,80,25,25);
                jf.add(o);
            }
        });
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JLabel c = new JLabel("CANCEL pressed");
                c.setBounds(80,80,25,25);
                jf.add(c);
            }
        });
    }
    public static void main(String[] args) {
        new SwingEvent();    
    }
}