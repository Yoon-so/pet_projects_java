import javax.swing.*;
import java.awt.*;
public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" Name"));
        c.add(new JTextField(""));
        c.add(new JLabel(" Student ID"));
        c.add(new JTextField(""));
        c.add(new JLabel(" Department"));
        c.add(new JTextField(""));
        c.add(new JLabel(" Course"));
        c.add(new JTextField(""));
        
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutEx();
    }
}