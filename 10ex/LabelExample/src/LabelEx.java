import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        setTitle("Label Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("Love you!");
        
        ImageIcon beauty = new ImageIcon("images-02/beauty.jpg");
        JLabel imageLabel = new JLabel(beauty);

        ImageIcon normalIcon = new ImageIcon("images-02/normalIcon.gif");
        JLabel label = new JLabel("Call me if you miss me!", normalIcon, SwingConstants.CENTER);
        
        c.add(textLabel);
        c.add(imageLabel);
        c.add(label);

        setSize(400, 600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LabelEx();
    }
}
