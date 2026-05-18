import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener  extends JFrame {
    public AnonymousClassListener() {
        setTitle("ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource();
                if(b.getText().equals("Action")) {
                    b.setText("Action1");
                } else {
                    b.setText("Action2");

                }
            }
        });
        setSize(350, 150);
        setVisible(true);
    }
    public static void main(String[] args){
        new AnonymousClassListener();
    }
}
