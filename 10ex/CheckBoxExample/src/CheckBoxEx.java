import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx() {
        setTitle("CheckBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");

        JCheckBox apple = new JCheckBox("Apple");
        JCheckBox pear = new JCheckBox("Pear", true);
        JCheckBox cherry = new JCheckBox("Cherry", cherryIcon);
        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new CheckBoxEx();
    }
}
